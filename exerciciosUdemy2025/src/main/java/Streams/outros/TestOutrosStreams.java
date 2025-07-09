package Streams.outros;

import Streams.reduce.testReduceAvancado.Aluno;

import java.util.Arrays;
import java.util.List;

public class TestOutrosStreams {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ana Max", 7.1);
        Aluno a2 = new Aluno("maria Max", 5.2);
        Aluno a3 = new Aluno("João Max", 2.3);
        Aluno a4 = new Aluno("Ender Max", 6.4);
        Aluno a5 = new Aluno("manu Max", 9.5);
        Aluno a6 = new Aluno("louise Max", 8);
        Aluno a7 = new Aluno("louise Max", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        System.out.println("usansdo distict ... pega obj diferentes .. duplicado não entra");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nusansdo  Skip ( paginação ) / Limit ");
        alunos.stream()
                .distinct()
                .skip(2) // pulo 2 primeiros elementos e montou o restantes
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile pega os elementos ate certa condição");
        alunos.stream()
                .distinct()
                .skip(4)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }
}
