package oo.heranca.desafio;

public class CarroTest {

    public static void main(String[] args) {
        Carro c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.acelerar();
        c2.frear();
        c2.ligarTurbo();

        System.out.println(c2);

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}
