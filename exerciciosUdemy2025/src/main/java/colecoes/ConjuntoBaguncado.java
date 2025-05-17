package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');


        System.out.printf("Conjunto: %s\n", conjunto.size());

        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.contains('x'));
    }
}
