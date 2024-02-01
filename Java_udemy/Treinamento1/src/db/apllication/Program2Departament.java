package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.DepartmentDao;
import db.model.entities.Department;

import java.util.List;

public class Program2Departament {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=========test 1 : seller findAll =========");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("=========t==================================================================");
        System.out.println("=========test 1 : seller findById ====================================");
        Department department = departmentDao.findById(2);
        System.out.println(department);

    }
}
