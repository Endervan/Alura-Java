package Streams.match;

import Streams.reduce.testReduceAvancado.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class test {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ana M", 7.1);
        Aluno a2 = new Aluno("maria M", 5.2);
        Aluno a3 = new Aluno("João M", 2.3);
        Aluno a4 = new Aluno("Ender M", 6.4);
        Aluno a5 = new Aluno("manu M", 9.5);
        Aluno a6 = new Aluno("louise M", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        // allMatch verifica se todos os alunos passaram
        System.out.println(alunos.stream().allMatch(aprovados));

        // anyMatch verifica se todos pelo menos um aluno passou
        System.out.println(alunos.stream().anyMatch(aprovados));

        // noneMatch verifica se nenhum esta aprovado
        System.out.println(alunos.stream().noneMatch(aprovados));

        // negando predicatye
        System.out.println(alunos.stream().noneMatch(reprovados));
    }
}
