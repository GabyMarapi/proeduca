package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Validausuario;
import com.dagama.proeduca.negocio.ValidaUsuarioNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class ValidaUsuarioServiceRest {

    @Autowired
    private ValidaUsuarioNegocioService validaUsuarioNegocioService;

    @GetMapping("/validausuario/{login}/{password}")
    public List<Validausuario> ValidaUsuario(@PathVariable(value = "login") String login,
                                        @PathVariable(value = "password") String password){
        return validaUsuarioNegocioService.ValidaUsuario(login, password);
    }
}