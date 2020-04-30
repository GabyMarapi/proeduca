package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Registrapromedio;
import com.dagama.proeduca.negocio.RegistrapromedioNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class RegistrapromedioServiceRest {

    @Autowired
    private RegistrapromedioNegocioService registrapromedioNegocioService;

    @GetMapping("/registrapromedio/{idevaluacion}/{idusuario}")
    public List<Registrapromedio> obtenerRespuesta(
            @PathVariable(value = "idevaluacion") int idevaluacion,
            @PathVariable(value = "idusuario") int idusuario){
        return registrapromedioNegocioService.MostrarRegistrarPromedio(idevaluacion, idusuario);
    }
}
