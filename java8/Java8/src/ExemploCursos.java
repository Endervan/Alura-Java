import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
//        cursos.stream().filter(c -> c.getAlunos() >= 100)
//                .map(Curso::getAlunos)
//                .forEach(System.out::println);


//        // somando valores cursos mairores dou == a 100
        OptionalDouble sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();
//
        System.out.println(sum);
//
//        // Optional ja tratar null automaticamente
//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100) // devolve stream
//                .findAny()// devolve optional
//                .ifPresent(c -> System.out.println(c.getNome()));

//       Curso curso =  optionalCurso.orElse(null);
//
//        System.out.println(curso.getNome());


//        cursos.forEach(curso -> System.out.println(curso.getNome()));

        // toMap e forEach colectors recebe bi consumeres caso seria chave e o valor
        cursos.parallelStream()// parallelStream trabalha paralelamente isso torna aplica sup rapida em ambiente que tenha muitos dados
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));


        OptionalDouble media = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average();
//
        System.out.println("media geral" + media);
    }


}
