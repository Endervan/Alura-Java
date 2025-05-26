package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Alves"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Xavier"));
        lista.add(new Usuario("Janaina"));

        System.out.println("pegando pelo id " + lista.get(3)); // pegando pelo indice

        // removendo pelo indice
        lista.remove(3);

        // removendo pelo nome
        lista.remove(new Usuario("Ana"));


        // verifica se contem
        System.out.println("contains "+lista.contains(new Usuario("Alves")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

    }
}
