package br.com.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Domindoa as coleçoes java ", "Ender");


        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Criando aula ", 20));
        javaColecoes.adicionar(new Aula("Modelando com coleções ", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());


    }


}


