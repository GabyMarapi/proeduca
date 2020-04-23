package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Nivelestudio;
import com.dagama.proeduca.negocio.NivelEstudioNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class NivelEstudioServiceRest {

    @Autowired
    private NivelEstudioNegocioService nivelEstudioNegocioService;

    @GetMapping("/nivelestudios")
    public List<Nivelestudio> obtenerNivelEstudio() {
        return nivelEstudioNegocioService.obtenerNivelEstudio();
    }

    @GetMapping("/nivelestudio/{idnivelestudio}")
    public Nivelestudio obtenerNivelEstudio(@PathVariable(value = "idnivelestudio") Long idnivelestudio) {
        return nivelEstudioNegocioService.obtenerNivelestudioxId(idnivelestudio);
    }
}
