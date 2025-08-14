package modelo.umpraum;

import jakarta.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Relacionamento bidirecional com Cliente (consegui ver o Cliente a partir do Assento)
    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Construtor padrão necessário para JPA
    public Assento() {
    }

    public Assento(String nome) {
        super();
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
