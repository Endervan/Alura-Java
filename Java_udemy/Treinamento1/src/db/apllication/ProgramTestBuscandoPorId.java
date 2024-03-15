package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Seller;

public class ProgramTestBuscandoPorId {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=========test 1 : seller findById =========");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
