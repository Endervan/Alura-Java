package byteBankHerdado;

public class testeFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Ender");
        funcionario.setCpf("001.000.000-20");
        funcionario.setSalario(4000);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getBonificacao());


    }
}
