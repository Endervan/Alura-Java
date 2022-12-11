package outputSream;

import java.io.*;

public class TesteEscritaOutputStream {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem1.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("ender scopel 111111111");
        bw.newLine();
        bw.newLine();
        bw.write("manu e luoise");




        bw.close();
    }
}
