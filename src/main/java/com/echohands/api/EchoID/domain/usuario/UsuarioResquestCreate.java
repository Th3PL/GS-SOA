package com.echohands.api.EchoID.domain.usuario;

import com.echohands.api.EchoID.domain.endereco.DadosEndereco;

public class UsuarioResquestCreate {
    private String nome;
    private String email;
    private String telefone;
    private DadosEndereco endereco;

    public UsuarioResquestCreate() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }
}
