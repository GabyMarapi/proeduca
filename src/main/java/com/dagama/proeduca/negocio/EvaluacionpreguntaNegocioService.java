package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Alumno;
import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Evaluacion;
import com.dagama.proeduca.entidades.Evaluacionpregunta;
import com.dagama.proeduca.repositorio.EvaluacionpreguntaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionpreguntaNegocioService {
    @Autowired
    private EvaluacionpreguntaRepositorio evaluacionpreguntaRepositorio;

    public Evaluacionpregunta registrar(Evaluacionpregunta evaluacionpregunta){ return evaluacionpreguntaRepositorio.save(evaluacionpregunta);}

    public List<Evaluacionpregunta> obtener(int idevaluacion){
        List<Evaluacionpregunta> listado = (List<Evaluacionpregunta>) evaluacionpreguntaRepositorio.ConsultaEvaluacionpreguntasxEvaluacion(idevaluacion);
        return listado;

    }
}
