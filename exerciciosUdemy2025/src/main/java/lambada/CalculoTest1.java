package lambada;

public class CalculoTest1 {

    public static void main(String[] args) {
        Calculo  calcular = new Somar();
        System.out.printf("calcular = %.2f\n",calcular.executar(10,20));

        calcular = new Multiplicar();
        System.out.printf("multiplicar = %.2f\n",calcular.executar(10,20));


    }
}

