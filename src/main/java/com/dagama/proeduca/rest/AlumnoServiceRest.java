package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Usuarioxtipo;
import com.dagama.proeduca.negocio.AlumnoxtipoNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class AlumnoServiceRest {

    @Autowired
    private AlumnoxtipoNegocioService alumnoxtipoNegocioService;

    @GetMapping("/usuario/{idtipo}")
    public List<Usuarioxtipo> Alumnoxtipo(
            @PathVariable(value = "idtipo") int idtipo){
        return alumnoxtipoNegocioService.AlumnoxTipo(idtipo);
    }
}