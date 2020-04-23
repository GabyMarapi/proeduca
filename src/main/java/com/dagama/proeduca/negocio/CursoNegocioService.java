package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CursoNegocioService {
    @Autowired
    private CursoRepositorio cursoRepositorio;

    public Curso registrar(Curso curso){ return cursoRepositorio.save(curso);}

    public List<Curso> obtenerCurso(){
        List<Curso> listado = (List<Curso>)cursoRepositorio.obtenerReporteCurso();
        Curso curso = new Curso();
        for(Curso rep:listado){
            curso.setIdcurso(rep.getIdcurso());
            curso.setNombrecurso(rep.getNombrecurso());
        }
        return listado;
    }

    public Curso obtenerCursoxId(String idcurso){
        Curso curso;
        curso = cursoRepositorio.buscarCurso(Long.parseLong(idcurso));
        return curso;
    }
}
