package lambada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierComposicao {
    public static void main(String[] args) {

        // tipo funcional que nao receber nenhum mas e pode fornecer algo
        Supplier<List<String>> supplier = () -> Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        System.out.println(supplier.get());
    }
}
