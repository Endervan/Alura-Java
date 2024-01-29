package db.model.dao.impl;

import db.DB;
import db.DBException;
import db.model.dao.SellerDao;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "select seller.*, department.name as DepName "
                            + "from seller "
                            + "inner join department "
                            + "on seller.DepartmentId = department.Id "
                            + "where DepartmentId = ? "
                            + "order by Name ");

            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = instanciateDepartment(rs);
                Seller obj = instanciateSeller(rs, dep);
                return obj;
            }
            return null;

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    private Seller instanciateSeller(ResultSet rs, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instanciateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "select seller.*, department.name as DepName "
                            + "from seller "
                            + "inner join department "
                            + "on seller.DepartmentId = department.Id "
                            + "order by Name ");

            rs = st.executeQuery();
            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {
                Department dep = map.get(rs.getInt("DepartmentId")); // map monta sem repeticao

                if (dep == null) { // somente unico departmant
                    dep = instanciateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"),dep); // salvando departamento
                }

                Seller obj = instanciateSeller(rs, dep); // varios vendedores msm department
                list.add(obj);
            }
            return list;

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "select seller.*, department.name as DepName "
                            + "from seller "
                            + "inner join department "
                            + "on seller.DepartmentId = department.Id "
                            + "where DepartmentId = ? "
                            + "order by Name ");

            st.setInt(1, department.getId());
            rs = st.executeQuery();
            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {
                Department dep = map.get(rs.getInt("DepartmentId")); // map monta sem repeticao

                if (dep == null) { // somente unico departmant
                    dep = instanciateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"),dep); // salvando departamento
                }

                Seller obj = instanciateSeller(rs, dep); // varios vendedores msm department
                list.add(obj);
            }
            return list;

        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
