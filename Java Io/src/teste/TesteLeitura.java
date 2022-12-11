package teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        // fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt"); // criando fluxo binario
        Reader isr = new InputStreamReader(fis); // melhorando fluxo binario
        BufferedReader br = new BufferedReader(isr); //

        String linha = br.readLine(); // lendo uma linha strings

        System.out.println(linha);

        br.close();
    }
}
