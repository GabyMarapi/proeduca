package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Consultanotas;
import com.dagama.proeduca.repositorio.ConsultanotasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultanotasNegocioService {
    @Autowired
    private ConsultanotasRepositorio consultanotasRepositorio;

    public List<Consultanotas> obtenerConsultanotas(int idevaluacion, int idcurso){
        List<Consultanotas> listado = (List<Consultanotas>)consultanotasRepositorio.Consultanotas(idevaluacion, idcurso);
        Consultanotas consultanotas = new Consultanotas();
        for(Consultanotas rep:listado){
            consultanotas.setPuesto(rep.getPuesto());
            consultanotas.setNombrealumno(rep.getNombrealumno());
            consultanotas.setPuntaje(rep.getPuntaje());
        }
        return listado;
    }
}
