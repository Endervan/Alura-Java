package br.com.lista;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

//        Map<Integer, String> pessoas = new HashMap<>(); // monta ordem crescente put
        Map<Integer, String> pessoas = new LinkedHashMap<>(); // monta lista com ordem inserção

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

    }
}
