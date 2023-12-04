package Generics.EqualsAndHascode;

import Generics.EqualsAndHascode.Entities.Client;

public class ProgramTest {


    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria@email.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // true contem msm conteudo


        System.out.println(c1 == c2); // fase pq  embora obj tenha msm conteudo ele tei referencia diferentes caso c1 e c2


        // qnd referencias sao literal == qnd n existe instanciacao ex: String s1 = new String("test") ;
        String s1 = "test";
        String s2 = "test";

        //String s1 = new String("test") nesse caso java cria a referencia de memoria
        System.out.println(s1 == s2);
    }
}
