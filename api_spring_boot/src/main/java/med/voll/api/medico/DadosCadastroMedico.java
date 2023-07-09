package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        Especialidade especialidade,
        DadosEndereco endereco
) {
}
