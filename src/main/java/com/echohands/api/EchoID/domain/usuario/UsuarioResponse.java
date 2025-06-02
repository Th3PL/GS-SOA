package com.echohands.api.EchoID.domain.usuario;

public class UsuarioResponse {
    private Long id;
    private String nome;

    public UsuarioResponse toDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        return this;
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
