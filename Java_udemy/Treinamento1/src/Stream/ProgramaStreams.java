package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramaStreams {

    public static void main(String[] args) {
        //Steam => sequencia de elementos advinda de uma fonte de dados(Arrays,coleção,funcao de interação,recurso E/S) q oferece suporte a operaçoes agregadas

        // e uma solucao para processar sequencia de dados de forma:
        // 1 => Declarativa(Iteração interna:escodida do programador)
        // 2 => Parallel-friendy -> imutavel -> thread safe
        // 3 => sem efeitos colaterais
        // 4 => sob demanda (lazy evaluation)
        //
        // acesso sequencial (sem indice)

        // single-use:so pode ser usada unica vez

        // Pepiline : Operaçoes em streams retornando novas streams. possivel cria uma cadeia de operaçoes (flixo de processamento)

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //sequencia de fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[]{0L,1L}, p -> new Long[]{p[1],p[0]+p[1]}).map(p->p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));


    }
}
