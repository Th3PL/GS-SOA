package com.echohands.api.EchoID.controller;

import com.echohands.api.EchoID.domain.usuario.UsuarioResponse;
import com.echohands.api.EchoID.domain.usuario.UsuarioResquestCreate;
import com.echohands.api.EchoID.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponse> create(@RequestBody UsuarioResquestCreate dto){
        return ResponseEntity.status(201).body(new UsuarioResponse().toDto(service.save(dto)));
    }

}
