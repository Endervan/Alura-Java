package Util;

// 2 metodo sem metodos estaticos
public class CurrentyConverter {


    public static double Coversao(double dollares, double valor) {
        double result = dollares * valor;
        return result + IOF(result);
    }

    public static   double IOF(double result) {
        return result * 0.06;
    }

}
