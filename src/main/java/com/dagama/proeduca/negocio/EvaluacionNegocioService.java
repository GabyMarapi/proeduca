package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Evaluacion;
import com.dagama.proeduca.repositorio.EvaluacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionNegocioService {

    @Autowired
    private EvaluacionRepositorio evaluacionRepositorio;

    public Evaluacion registrar(Evaluacion evaluacion){ return evaluacionRepositorio.save(evaluacion);}

    public List<Evaluacion> obtenerEvaluacion(){
        List<Evaluacion> listado = (List<Evaluacion>)evaluacionRepositorio.obtenerReporteEvaluacion();
        Evaluacion evaluacion = new Evaluacion();
        for(Evaluacion rep:listado){
            evaluacion.setIdevaluacion(rep.getIdevaluacion());
            evaluacion.setTituloevaluacion(rep.getTituloevaluacion());
        }
        return listado;
    }

    public Evaluacion obtenerEvaluacionxId(String idevaluacion){
        Evaluacion evaluacion;
        evaluacion = evaluacionRepositorio.buscarEvaluacion(Long.parseLong(idevaluacion));
        return evaluacion;
    }

}
