package db.apllication;

import db.model.entities.Department;
import db.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1,"Books");
        Seller seller = new Seller(1,"jooa","joao@email.com",new Date(),1500.00,obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}
