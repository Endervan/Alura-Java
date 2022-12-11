package teste;


import java.io.*;

public class testeEscritaInputeOutputSteam {

    public static void main(String[] args) throws IOException {


        InputStream fis = System.in; // new FileInputStream("lorem.txt"); faz copia de umpro outro
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; // new FileOutputStream("lorem1.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush(); // descarga limpera tudo
            linha = br.readLine();

        }

        br.close();
        bw.close();
    }

}
