package excessoes;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }


    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu erro");
    }
}