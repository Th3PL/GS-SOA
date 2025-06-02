package com.echohands.api.EchoID.domain.usuario;

import com.echohands.api.EchoID.domain.endereco.DadosEndereco;

public record UsuarioResquestCreate(
        String nome,
        String email,
        String telefone,
        DadosEndereco endereco
) {
}
