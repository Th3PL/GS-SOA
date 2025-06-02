package com.echohands.api.EchoID.service;

import com.echohands.api.EchoID.domain.usuario.Usuario;
import com.echohands.api.EchoID.domain.usuario.UsuarioRepository;
import com.echohands.api.EchoID.domain.usuario.UsuarioRequestUpdate;
import com.echohands.api.EchoID.domain.usuario.UsuarioResquestCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private EmailService emailService;

    @Autowired
    private UsuarioRepository repository;

    public Usuario save(UsuarioResquestCreate dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setTelefone(dto.getTelefone());
        usuario.setEndereco(dto.getEndereco());

        Usuario usuarioSalvo = repository.save(usuario);

        try {
            String assunto = "Bem-vindo ao EchoID!";
            String conteudo = String.format(
                    "Olá, %s!\n\nSeu cadastro no EchoID foi realizado com sucesso.\n\n" +
                            "Dados cadastrados:\n" +
                            "- Nome: %s\n" +
                            "- E-mail: %s\n" +
                            "- Telefone: %s\n" +
                            "- Endereço: %s\n\n" +
                            "Seja bem-vindo(a) à nossa plataforma! 🚀\n\n" +
                            "Equipe EchoID",
                    usuarioSalvo.getNome(),
                    usuarioSalvo.getNome(),
                    usuarioSalvo.getEmail(),
                    usuarioSalvo.getTelefone(),
                    usuarioSalvo.getEndereco()
            );

            emailService.enviarEmail(usuarioSalvo.getEmail(), assunto, conteudo);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarioSalvo;
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public boolean deleteById(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Usuario> update(Long id, UsuarioRequestUpdate dto) {
        return repository.findById(id)
                .map(usuario -> {
                    usuario.setNome(dto.getNome());
                    usuario.setTelefone(dto.getTelefone());
                    return repository.save(usuario);
                });
    }
}
