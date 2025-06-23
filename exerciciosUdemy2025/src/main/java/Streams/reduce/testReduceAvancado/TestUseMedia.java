package Streams.reduce.testReduceAvancado;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestUseMedia {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ana", 7.1);
        Aluno a2 = new Aluno("maria", 5.2);
        Aluno a3 = new Aluno("João", 2.3);
        Aluno a4 = new Aluno("Ender", 6.4);
        Aluno a5 = new Aluno("manu", 9.5);
        Aluno a6 = new Aluno("louise", 8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> CalcularMedia = Media::adicionar;
        BinaryOperator<Media> combinarMedia = Media::combinar;

        Media media = alunos.parallelStream()
                .filter(aprovados)
                .map(apenasNota)
                .reduce(new Media(), CalcularMedia, combinarMedia);

        System.out.println("Media da Turma dos aprovados " + media.getValor());
    }
}
