package Generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploContravariancia {

    public static void main(String[] args) {

        // Covariancia qnd pode fazer get e nao pode fazer put
        // ex: get - error  /// put - ok

        List<Object> myObjects = new ArrayList<Object>();
        myObjects.add("Maria");
        myObjects.add("Alex");

        List< ? super Number> myNumbers  = myObjects;
        // get - error
//        Number x = myNumbers.get(0);

        // put - ok
        myNumbers.add(20);
        System.out.println(myNumbers);

    }
}
