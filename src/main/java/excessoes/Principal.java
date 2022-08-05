package excessoes;

public class Principal {

    public static void main(String[] args) {

        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(nome);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }

        System.out.println("DEPOIS");

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

//        try {
//            System.out.println(1 / 0);
//        } catch (ArithmeticException | NullPointerException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            System.out.println(1 / 0);
//        } catch (ArithmeticException && NullPointerException ex) {
//            ex.printStackTrace();
//        }

    }


}