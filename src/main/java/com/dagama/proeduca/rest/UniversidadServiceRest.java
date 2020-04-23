package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Universidad;
import com.dagama.proeduca.negocio.CursoNegocioService;
import com.dagama.proeduca.negocio.UniversidadNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class UniversidadServiceRest {

    @Autowired
    private UniversidadNegocioService universidadNegocioService;

    @GetMapping("/universidades")
    public List<Universidad> obtenerUniversidad() {
        return universidadNegocioService.obtenerUniversidad();
    }
}
