package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class BuscandoTodosVendedores {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=========test 3 : seller findAll =========");
        List<Seller> list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("========= test  4 : seller insert =========");
        Department dep = new Department(5, null);
        Seller newSeller = new Seller(null, "Tereza", "tereza@email.com", new Date(), 15000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted  new Id = " + newSeller.getId());


    }
}
