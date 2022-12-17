package teste;


import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class testeLeitura2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));
//        Boolean tem = scanner.hasNextLine(); // faz loop linhas  como forEach

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");

            linhaScanner.useLocale(Locale.US); // java usa configuracoes da região

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
            String valorFormatado = String.format(new Locale("pt","BR"),"%s - %04d-%08d, %20s: %8.2f ",tipoConta ,agencia ,numeroConta ,titular ,saldo);

            System.out.println(valorFormatado);
            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
        }

        scanner.close();


    }

}
