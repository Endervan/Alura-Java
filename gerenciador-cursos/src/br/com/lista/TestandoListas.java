package br.com.lista;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>(); // respeita a ordem passada

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);
        for (String aula : aulas) {
            System.out.println("Aula com for reduzido:" + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println(primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula com for comum: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Aula com forEach:" + aula);
        });

        Collections.sort(aulas);
        System.out.println("usando ordenação sort(a-z) collects" + aulas);
    }
}
