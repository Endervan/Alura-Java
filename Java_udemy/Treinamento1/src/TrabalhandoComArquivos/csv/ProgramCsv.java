package TrabalhandoComArquivos.csv;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCsv {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        System.out.println(sourceFolderStr);

        boolean sucess = new File(sourceFolderStr + "\\out1").mkdir();
        System.out.println("Pasta Criada " + sucess);

        String targetFilesStr = sourceFolderStr + "\\out1\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quant = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quant));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilesStr))) {
                for (Product item : list) {
                    bw.write(item.getName()+","+String.format("%.2f",item.total()));
                }
            } catch (IOException e) {
                System.out.println("Error writing file " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file " + e.getMessage());
        }

        sc.close();
    }


}
