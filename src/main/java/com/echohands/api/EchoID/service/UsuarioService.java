package com.echohands.api.EchoID.service;

import com.echohands.api.EchoID.domain.usuario.Usuario;
import com.echohands.api.EchoID.domain.usuario.UsuarioRepository;
import com.echohands.api.EchoID.domain.usuario.UsuarioResquestCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario save(UsuarioResquestCreate dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setTelefone(dto.telefone());
        usuario.setEndereco(dto.endereco());
        return repository.save(usuario);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }
}
