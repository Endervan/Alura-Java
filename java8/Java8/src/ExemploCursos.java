import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {


    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));


        cursos.sort(Comparator.comparing(Curso::getAlunos));

//

        // stream devolve algo com fluxo de objeto (corrente)
//         predicate => criterio a ser adotado
        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);


        // somando valores cursos mairores dou == a 100
        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
        System.out.println(sum);


//        cursos.forEach(curso -> System.out.println(curso.getNome()));

    }


}
