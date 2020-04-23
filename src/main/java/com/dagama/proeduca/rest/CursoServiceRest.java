package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Cursoxevaluacion;
import com.dagama.proeduca.entidades.Cursoxnivel;
import com.dagama.proeduca.negocio.CursoNegocioService;
import com.dagama.proeduca.negocio.CursoxEvaluacionNegocioService;
import com.dagama.proeduca.negocio.CursoxNivelNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class CursoServiceRest {

    @Autowired
    private CursoNegocioService cursoNegocioService;

    @Autowired
    private CursoxNivelNegocioService cursoxNivelNegocioService;

    @Autowired
    private CursoxEvaluacionNegocioService cursoxEvaluacionNegocioService;

    @GetMapping("/cursos")
    public List<Curso> obtenerCurso() {
        return cursoNegocioService.obtenerCurso();
    }

    @GetMapping("/curso/{idcurso}")
    public Curso obtenerCurso(@PathVariable(value = "idcurso") String idcurso){
        return cursoNegocioService.obtenerCursoxId(idcurso);
    }

    @GetMapping("/cursoxnivel/{idnivelestudio}")
    public List<Cursoxnivel> CursoxNivel(
            @PathVariable(value = "idnivelestudio") int idnivelestudio){
        return cursoxNivelNegocioService.CursoxNivel(idnivelestudio);
    }

    @GetMapping("/cursoxevaluacion/{idevaluacion}")
    public List<Cursoxevaluacion> CursoxEvaluacion(
            @PathVariable(value = "idevaluacion") int idevaluacion){
        return cursoxEvaluacionNegocioService.CursoxEvaluacion(idevaluacion);
    }
}
