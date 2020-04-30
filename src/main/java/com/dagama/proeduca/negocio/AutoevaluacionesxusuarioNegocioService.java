package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Autoevaluacionesxusuario;
import com.dagama.proeduca.entidades.Evaluacionxusuario;
import com.dagama.proeduca.repositorio.AutoevaluacionesxusuarioRepositorio;
import com.dagama.proeduca.repositorio.EvaluacionxusuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoevaluacionesxusuarioNegocioService {
    @Autowired
    private AutoevaluacionesxusuarioRepositorio autoevaluacionesxusuarioRepositorio;

    public List<Autoevaluacionesxusuario> Autoevaluacionesxusuario(int idusuario, String grado){
        List<Autoevaluacionesxusuario> listado = (List<Autoevaluacionesxusuario>)autoevaluacionesxusuarioRepositorio.ConsultaAutoevaluacionesxusuario(idusuario, grado);
        Autoevaluacionesxusuario autoevaluacionesxusuario = new Autoevaluacionesxusuario();
        for(Autoevaluacionesxusuario rep:listado){
            autoevaluacionesxusuario.setIdevaluacion(rep.getIdevaluacion());
            autoevaluacionesxusuario.setNombrenivelestudio(rep.getNombrenivelestudio());
            autoevaluacionesxusuario.setTituloevaluacion(rep.getTituloevaluacion());
            autoevaluacionesxusuario.setDuracion(rep.getDuracion());
            autoevaluacionesxusuario.setNumeropreguntas(rep.getNumeropreguntas());
            autoevaluacionesxusuario.setNotamaxima(rep.getNotamaxima());
        }
        return listado;
    }
}
