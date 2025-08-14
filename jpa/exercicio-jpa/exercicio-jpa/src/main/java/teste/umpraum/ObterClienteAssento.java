package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome()); // assento
        System.out.println(cliente.getAssento().getCliente().getNome()); // cliente daquele assento

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        System.out.println(daoAssento.obterPorId(1L).getCliente().getNome()); // assento daquele cliente


        daoCliente.fechar();
        daoAssento.fechar();
    }
}
