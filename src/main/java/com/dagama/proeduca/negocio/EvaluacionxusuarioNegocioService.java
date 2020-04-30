package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Cursoxnivel;
import com.dagama.proeduca.entidades.Evaluacionxusuario;
import com.dagama.proeduca.repositorio.CursoxNivelRepositorio;
import com.dagama.proeduca.repositorio.EvaluacionxusuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EvaluacionxusuarioNegocioService {
    @Autowired
    private EvaluacionxusuarioRepositorio evaluacionxusuarioRepositorio;

    public List<Evaluacionxusuario> Evaluacionxusuario(int idusuario, int flag){
        List<Evaluacionxusuario> listado = (List<Evaluacionxusuario>)evaluacionxusuarioRepositorio.ConsultaEvaluacionxUsuario(idusuario, flag);
        Evaluacionxusuario evaluacionxusuario = new Evaluacionxusuario();
        for(Evaluacionxusuario rep:listado){
            evaluacionxusuario.setIdevaluacion(rep.getIdevaluacion());
            evaluacionxusuario.setNombrenivelestudio(rep.getNombrenivelestudio());
            evaluacionxusuario.setTituloevaluacion(rep.getTituloevaluacion());
            evaluacionxusuario.setDuracion(rep.getDuracion());
            evaluacionxusuario.setNumeropreguntas(rep.getNumeropreguntas());
            evaluacionxusuario.setFechainicio(rep.getFechainicio());
            evaluacionxusuario.setGradodificultad(rep.getGradodificultad());
            evaluacionxusuario.setNotamaxima(rep.getNotamaxima());
        }
        return listado;
    }
}
