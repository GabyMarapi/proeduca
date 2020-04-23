package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Evaluacionrespuestausuario;
import com.dagama.proeduca.entidades.Nivelestudio;
import com.dagama.proeduca.repositorio.EvaluacionrespuestausuarioRepositorio;
import com.dagama.proeduca.repositorio.NivelestudioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionrespuestausuarioNegocioService {
    @Autowired
    private EvaluacionrespuestausuarioRepositorio evaluacionrespuestausuarioRepositorio;

    public Evaluacionrespuestausuario registrar(Evaluacionrespuestausuario evaluacionrespuestausuario){ return evaluacionrespuestausuarioRepositorio.save(evaluacionrespuestausuario);}
}
