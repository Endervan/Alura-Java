package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.util.List;

public class BuscandoTodosVendedores {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=========test 3 : seller findAll =========");
        List<Seller> list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
