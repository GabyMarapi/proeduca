package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Cursoxevaluacion;
import com.dagama.proeduca.entidades.Cursoxnivel;
import com.dagama.proeduca.repositorio.CursoxEvaluacionRepositorio;
import com.dagama.proeduca.repositorio.CursoxNivelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoxEvaluacionNegocioService {
    @Autowired
    private CursoxEvaluacionRepositorio cursoxEvaluacionRepositorio;

    public List<Cursoxevaluacion> CursoxEvaluacion(int idevaluacion){
        List<Cursoxevaluacion> listado = (List<Cursoxevaluacion>)cursoxEvaluacionRepositorio.ConsultaCursoxEvaluacion(idevaluacion);
        Cursoxevaluacion consultaxEvaluacion = new Cursoxevaluacion();
        for(Cursoxevaluacion rep:listado){
            consultaxEvaluacion.setIdcurso(rep.getIdcurso());
            consultaxEvaluacion.setNombrecurso(rep.getNombrecurso());
        }
        return listado;
    }
}
