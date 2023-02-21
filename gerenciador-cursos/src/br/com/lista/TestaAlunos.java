package br.com.lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

    public static void main(String[] args) {
// set msm se tive objtos duplicados ele garante somente um
        Collection<String> alunos = new HashSet<>(); // tipo tabela de espelhamento

        alunos.add("ender");
        alunos.add("ender");
        alunos.add("alves");
        alunos.add("vitor");
        alunos.add("cersar");
        alunos.add("iris");
        alunos.add("roberta");

        boolean alunoEstaMatriculado = alunos.contains("ender");
        alunos.remove("ender"); // remove qnd contains sao metodos ultra rapido no conjunto
        System.out.println(alunoEstaMatriculado);

        System.out.println(alunos.size());

//        for (String aluno:alunos){
//            System.out.println(aluno);
//        }

        alunos.forEach(System.out::println);

        List<String> alunosEmLista = new ArrayList<>(alunos);

        System.out.println(alunosEmLista.get(0));


    }


}


