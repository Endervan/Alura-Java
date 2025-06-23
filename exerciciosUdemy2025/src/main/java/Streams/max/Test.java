package Streams.max;

import Streams.reduce.testReduceAvancado.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ana Max", 7.1);
        Aluno a2 = new Aluno("maria Max", 5.2);
        Aluno a3 = new Aluno("João Max", 2.3);
        Aluno a4 = new Aluno("Ender Max", 6.4);
        Aluno a5 = new Aluno("manu Max", 9.5);
        Aluno a6 = new Aluno("louise Max", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> aprovados = a -> a.nota >= 7;

        Comparator<Aluno> melhorNota = Comparator.comparing(a -> a.nota);
        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return -1;
            if (aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        // melhor aluno
        System.out.println(alunos.stream().max(melhorNota).get());

        // pior aluno entre piores
        System.out.println(alunos.stream().min(piorNota).get());

        // melhor aluno entre piores
        System.out.println(alunos.stream().max(piorNota).get());

        // pior aluno
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
