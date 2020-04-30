package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Alumno;
import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Usuarioxtipo;
import com.dagama.proeduca.negocio.AlumnoNegocioService;
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

    @Autowired
    private AlumnoNegocioService alumnoNegocioService;

    @GetMapping("/usuario/{idtipo}")
    public List<Usuarioxtipo> Alumnoxtipo(
            @PathVariable(value = "idtipo") int idtipo){
        return alumnoxtipoNegocioService.AlumnoxTipo(idtipo);
    }

    @GetMapping("/alumno/{idalumno}")
    public Alumno obtenerAlumno(@PathVariable(value = "idalumno") String idalumno){
        return alumnoNegocioService.obtenerAlumnoxId(idalumno);
    }

    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumno() {
        return alumnoNegocioService.obtenerAlumno();
    }

    @PostMapping("/alumno_reg")
    public Alumno IngresarAlumno(@RequestBody Alumno alumno) {
        return alumnoNegocioService.registrar(alumno);
    }
}