package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.*;
import com.dagama.proeduca.negocio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")

public class EvaluacionServiceRest {

    @Autowired
    private EvaluacionNegocioService evaluacionNegocioService;

    @Autowired
    private EvaluacionpreguntaNegocioService evaluacionpreguntaNegocioService;

    @Autowired
    private EvaluacionxusuarioNegocioService evaluacionxusuarioNegocioService;

    @Autowired
    private EvaluacionMostrarNegocioService evaluacionMostrarNegocioService;

    @Autowired
    private EvaluacionrespuestausuarioNegocioService evaluacionrespuestausuarioNegocioService;

    @Autowired
    private EvaluacionxnivelNegocioService evaluacionxnivelNegocioService;

    @Autowired
    private AsignacionpreguntaNegocioService asignacionpreguntaNegocioService;

    @Autowired
    private AutoevaluacionesxusuarioNegocioService autoevaluacionesxusuarioNegocioService;

    @GetMapping("/evaluacion/{idevaluacion}")
    public Evaluacion obtenerEvaluacion(@PathVariable(value = "idevaluacion") String idevaluacion){
        return evaluacionNegocioService.obtenerEvaluacionxId(idevaluacion);
    }

    @GetMapping("/asignarpregunta/{idevaluacion}")
    public Asignacionpregunta obtenerRespuesta(@PathVariable(value = "idevaluacion") int idevaluacion){
        return asignacionpreguntaNegocioService.obtenerRespuesta(idevaluacion);
    }

    @GetMapping("/evaluaciones")
    public List<Evaluacion> obtenerEvaluaciones() {
        return evaluacionNegocioService.obtenerEvaluacion();
    }

    @GetMapping("/evaluacionxusuario/{idusuario}/{flag}")
    public List<Evaluacionxusuario> EvaluacionxUsuario(
            @PathVariable(value = "idusuario") int idusuario,
            @PathVariable(value = "flag") int flag){
        return evaluacionxusuarioNegocioService.Evaluacionxusuario(idusuario, flag);
    }

    @GetMapping("/autoevaluacionxusuario/{idusuario}/{grado}")
    public List<Autoevaluacionesxusuario> Autoevaluacionesxusuario(
            @PathVariable(value = "idusuario") int idusuario,
            @PathVariable(value = "grado") String grado){
        return autoevaluacionesxusuarioNegocioService.Autoevaluacionesxusuario(idusuario, grado);
    }

    @GetMapping("/evaluacionxnivel/{idnivel}")
    public List<Evaluacionxnivel> Evaluacionxnivel(
            @PathVariable(value = "idnivel") int idnivel){
        return evaluacionxnivelNegocioService.Evaluacionxnivel(idnivel);
    }

    @GetMapping("/evaluacionmostrar/{idevaluacion}")
    public List<Evaluacionmostrar> EvaluacionMostrar(
            @PathVariable(value = "idevaluacion") int idevaluacion){
        return evaluacionMostrarNegocioService.EvaluacionMostrar(idevaluacion);
    }

    @GetMapping("/evaluacionpregunta/{idevaluacion}")
    public List<Evaluacionpregunta> EvaluacionPregunta(
            @PathVariable(value = "idevaluacion") int idevaluacion){
        return evaluacionpreguntaNegocioService.obtener(idevaluacion);
    }

    @PostMapping("/evaluacion_reg")
    public Evaluacion IngresarEvaluacion(@RequestBody Evaluacion evaluacion) {
        return evaluacionNegocioService.registrar(evaluacion);
    }

    @PostMapping("/evaluacionpregunta_reg")
    public Evaluacionpregunta IngresarEvaluacionpregunta(@RequestBody Evaluacionpregunta evaluacionpregunta) {
        return evaluacionpreguntaNegocioService.registrar(evaluacionpregunta);
    }

    @PostMapping("/evaluacionrespuesta_reg")
    public Evaluacionrespuestausuario IngresarEvaluacionrespuesta(@RequestBody Evaluacionrespuestausuario evaluacionrespuesta) {
        return evaluacionrespuestausuarioNegocioService.registrar(evaluacionrespuesta);
    }
}