package lambada;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        Function<String, String> oResultadoE = valor -> "O REsultado e " + valor;
        String ResultadoFinal = parOuImpar.andThen(oResultadoE).apply(6);
        System.out.println(ResultadoFinal);
    }
}
