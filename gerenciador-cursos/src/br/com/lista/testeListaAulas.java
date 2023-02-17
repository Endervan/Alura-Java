package br.com.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testeListaAulas {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revistando as ArrayList",21);
        Aula a2 = new Aula("Lista de objetos",15);
        Aula a3 = new Aula("Relacionamento de lista e objetos",10);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
       //  msm efeito linha 25 e 27
        aulas.sort(Comparator.comparing(Aula::getTempo));


    }


}
