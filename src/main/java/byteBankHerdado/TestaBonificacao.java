package byteBankHerdado;

public class TestaBonificacao {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        //
        f1.setSalario(1000.00);
        System.out.println(f1.getTipo());
        System.out.println("funcionario comun bonificação " + f1.getBonificacao());

        // funcionario gerente
        Funcionario f2 = new Funcionario();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println("funcionario Cargo Diretor bonificação " + f2.getBonificacao());

        // // funcionario diretor
        Funcionario f3 = new Funcionario();
        f3.setTipo(2);
        f3.setSalario(5000.0);
        System.out.println(f3.getTipo());
        System.out.println("funcionario Cargo Diretor bonificação " + f3.getBonificacao());
    }
}
