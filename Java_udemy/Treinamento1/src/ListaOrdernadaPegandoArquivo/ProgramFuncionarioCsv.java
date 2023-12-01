package ListaOrdernadaPegandoArquivo;

import ListaOrdernadaPegandoArquivo.Entites.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ProgramFuncionarioCsv {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\funcionarios.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine(); // pega tudo q esta em uma linha
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");

                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list); // orderna a lista

            for (Employee emp : list) {
                System.out.println(emp.getName() + "," + String.format("%.2f",emp.getSalary()));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


