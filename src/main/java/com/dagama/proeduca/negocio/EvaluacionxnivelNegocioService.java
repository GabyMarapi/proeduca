package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Evaluacionxnivel;
import com.dagama.proeduca.entidades.Evaluacionxusuario;
import com.dagama.proeduca.repositorio.EvaluacionxnivelRepositorio;
import com.dagama.proeduca.repositorio.EvaluacionxusuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionxnivelNegocioService {
    @Autowired
    private EvaluacionxnivelRepositorio evaluacionxnivelRepositorio;

    public List<Evaluacionxnivel> Evaluacionxnivel(int idnivel){
        List<Evaluacionxnivel> listado = (List<Evaluacionxnivel>)evaluacionxnivelRepositorio.ConsultaEvaluacionxNivel(idnivel);
        Evaluacionxnivel evaluacionxnivel = new Evaluacionxnivel();
        for(Evaluacionxnivel rep:listado){
            evaluacionxnivel.setIdevaluacion(rep.getIdevaluacion());
            evaluacionxnivel.setTituloevaluacion(rep.getTituloevaluacion());
        }
        return listado;
    }
}
