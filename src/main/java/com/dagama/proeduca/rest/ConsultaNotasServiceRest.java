package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Consultanotaalumnoxeva;
import com.dagama.proeduca.entidades.Consultanotas;
import com.dagama.proeduca.negocio.ConsultanotaalumnoxevaNegocioService;
import com.dagama.proeduca.negocio.ConsultanotasNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class ConsultaNotasServiceRest {

    @Autowired
    private ConsultanotasNegocioService consultanotasNegocioService;

    @Autowired
    private ConsultanotaalumnoxevaNegocioService consultanotaalumnoxevaNegocioService;

    @GetMapping("/consultanotas/{idevaluacion}/{idcurso}")
    public List<Consultanotas> obtenerConsultanotas(
            @PathVariable(value = "idevaluacion") int idevaluacion,
            @PathVariable(value = "idcurso") int idcurso) {
        return consultanotasNegocioService.obtenerConsultanotas(idevaluacion, idcurso);
    }

    @GetMapping("/consultanotaalumnoxeva/{idevaluacion}/{idusuario}")
    public List<Consultanotaalumnoxeva> obtenerConsultanotaalumnoxeva(
            @PathVariable(value = "idevaluacion") int idevaluacion,
            @PathVariable(value = "idusuario") int idusuario) {
        return consultanotaalumnoxevaNegocioService.obtenerConsultanotaalumnoxeva(idevaluacion, idusuario);
    }
}
