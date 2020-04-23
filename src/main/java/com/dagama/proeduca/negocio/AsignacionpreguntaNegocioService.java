package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Asignacionpregunta;
import com.dagama.proeduca.repositorio.AsignacionpreguntaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionpreguntaNegocioService {
    @Autowired
    private AsignacionpreguntaRepositorio asignacionpreguntaRepositorio;

    public Asignacionpregunta obtenerRespuesta(int idevaluacion){
        Asignacionpregunta asignacionpregunta;
        asignacionpregunta = asignacionpreguntaRepositorio.AsignarPregunta(idevaluacion);
        return asignacionpregunta;
    }
}
