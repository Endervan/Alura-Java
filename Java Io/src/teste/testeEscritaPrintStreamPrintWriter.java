package teste;


import java.io.IOException;
import java.io.PrintStream;

public class testeEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem.txt");

        ps.println("lorem iiiiiiiii dddddddddddd");

        ps.println();
        ps.println("fkjsdfhkdhf ujisdffskfkldsdlfhjs");

        ps.close();


    }

}
