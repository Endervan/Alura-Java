package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.util.List;

public class BuscandoVendedoresPorDepartament {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=========test 2 : seller findByDepartament =========");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);

        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
