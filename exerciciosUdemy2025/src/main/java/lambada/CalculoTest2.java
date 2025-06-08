package lambada;

public class CalculoTest2 {

    public static void main(String[] args) {
        Calculo calc = (x, y) -> x + y; // expressao lambda

        System.out.printf("somar = %.2f\n", calc.executar(10, 20));

        calc = (x, y) -> x * y; // expressao lambda

        System.out.printf("somar = %.2f\n", calc.executar(10, 20));
    }
}

