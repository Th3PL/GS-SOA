package com.echohands.api.EchoID.domain.usuario;

import com.echohands.api.EchoID.domain.endereco.DadosEndereco;
import com.echohands.api.EchoID.domain.endereco.Endereco;
import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @Embedded
    private Endereco endereco;

    public Usuario() {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = new Endereco();
        this.endereco.setLogradouro(endereco.logradouro());
        this.endereco.setBairro(endereco.bairro());
        this.endereco.setCep(endereco.cep());
        this.endereco.setCidade(endereco.cidade());
        this.endereco.setUf(endereco.uf());
        this.endereco.setComplemento(endereco.complemento());
        this.endereco.setNumero(endereco.numero());

    }
}
