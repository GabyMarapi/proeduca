package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Evaluacionmostrar;
import com.dagama.proeduca.repositorio.EvaluacionMostrarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionMostrarNegocioService {

    @Autowired
    private EvaluacionMostrarRepositorio evaluacionMostrarRepositorio;

    public List<Evaluacionmostrar> EvaluacionMostrar(int idevaluacion){
        List<Evaluacionmostrar> listado = (List<Evaluacionmostrar>)evaluacionMostrarRepositorio.ConsultaEvaluacionMostrar(idevaluacion);
        Evaluacionmostrar evaluacionMostrar = new Evaluacionmostrar();
        for(Evaluacionmostrar rep:listado){
            evaluacionMostrar.setIdpregunta(rep.getIdpregunta());
            evaluacionMostrar.setNumero(rep.getNumero());
            evaluacionMostrar.setIdrespuesta(rep.getIdrespuesta());
            evaluacionMostrar.setDescripcion(rep.getDescripcion());
        }
        return listado;
    }
}
