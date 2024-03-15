package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDao;
import db.model.entities.Seller;

import java.util.Scanner;

public class updateDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("========= test  5 : seller update =========");


//        Seller seller = sellerDao.findById(1);
//        seller.setEmail("max@email.com");
//        sellerDao.update(seller);
//        System.out.println("Uptade Complete ");

        System.out.println("========= test  6 : seller delete =========");

        System.out.print("Entre id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Complete ");
        sc.close();

    }
}
