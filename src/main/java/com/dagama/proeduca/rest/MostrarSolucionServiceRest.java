package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Evaluacion;
import com.dagama.proeduca.entidades.Mostrarsolucion;
import com.dagama.proeduca.negocio.EvaluacionNegocioService;
import com.dagama.proeduca.negocio.MostrarSolucionNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class MostrarSolucionServiceRest {
    @Autowired
    private MostrarSolucionNegocioService mostrarSolucionNegocioService;

    @GetMapping("/mostrarsolucion/{idevaluacion}/{idusuario}")
    public List<Mostrarsolucion> MostrarSolucion(
            @PathVariable(value = "idevaluacion") int idevaluacion,
            @PathVariable(value = "idusuario") int idusuario){
        return mostrarSolucionNegocioService.MostrarSolucion(idevaluacion, idusuario);
    }
}
