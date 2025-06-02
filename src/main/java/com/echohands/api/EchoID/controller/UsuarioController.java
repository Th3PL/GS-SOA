package com.echohands.api.EchoID.controller;

import com.echohands.api.EchoID.domain.usuario.UsuarioRequestUpdate;
import com.echohands.api.EchoID.domain.usuario.UsuarioResponse;
import com.echohands.api.EchoID.domain.usuario.UsuarioResquestCreate;
import com.echohands.api.EchoID.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponse> create(@RequestBody UsuarioResquestCreate dto){
        return ResponseEntity.status(201).body(new UsuarioResponse().toDto(service.save(dto)));
    }

    @PutMapping("{id}")
    public ResponseEntity<UsuarioResponse> update(@PathVariable Long id,
                                                  @RequestBody UsuarioRequestUpdate dto){
        return service.update(id, dto)
                .map(usuario -> new UsuarioResponse().toDto(usuario)
                ).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> findAll(){
        return ResponseEntity.ok(
                service
                        .findAll()
                        .stream()
                        .map(usuario -> {
                            return new UsuarioResponse().toDto(usuario);
                        })
                        .collect(Collectors.toList())

        );
    }

    @GetMapping("{id}")
    public ResponseEntity<UsuarioResponse> findById(@PathVariable Long id){
        return service.findById(id).map(usuario -> {
                    return new UsuarioResponse().toDto(usuario);
                }).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(Long id){
        boolean result = service.deleteById(id);
        if(result){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
