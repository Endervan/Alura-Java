package lambada;

// proibi da interface ter mais uma metodo abstract caso executar
@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);


    default String legal() {
        return "legal default";
    }

    static String muitoLegal(){
        return "muitoLegal uso static";
    }
}
