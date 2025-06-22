package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterTest {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.0, true);
        Aluno a2 = new Aluno("Bia", 6.0, false);
        Aluno a3 = new Aluno("Ender", 8.0, false);
        Aluno a4 = new Aluno("Marcos", 10.0, true);
        Aluno a5 = new Aluno("Valeria", 4.0, true);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovados = a -> a.nota > 7;
        Predicate<Aluno> bomComportamento = a -> a.comportamento;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabens " + a.nome + " Você foi Aprovado";

        alunos.stream()
                .filter(aprovados)
                .filter(bomComportamento)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
