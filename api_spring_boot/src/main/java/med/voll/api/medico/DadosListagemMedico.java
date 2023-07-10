package med.voll.api.medico;

// DTO => pode devolve somente uma parte das informaçoes
public record DadosListagemMedico(Long id,String nome,String email,String crm, Especialidade especialidade) {


    public DadosListagemMedico(Medico medico){
        this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());

    }
}
