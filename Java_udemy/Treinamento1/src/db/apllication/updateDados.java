package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Seller;

public class updateDados {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("========= test  5 : seller update =========");


        Seller seller = sellerDao.findById(1);
        System.out.println(seller);
        seller.setName("scopel  max");
        sellerDao.update(seller);

        System.out.println("Uptade Complete ");

    }
}
