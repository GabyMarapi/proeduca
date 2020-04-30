package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Mostrarsolucion;
import com.dagama.proeduca.entidades.Registrapromedio;
import com.dagama.proeduca.repositorio.RegistrapromedioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrapromedioNegocioService {
    @Autowired
    private RegistrapromedioRepositorio registrapromedioRepositorio;

    public List<Registrapromedio> MostrarRegistrarPromedio(int idevaluacion, int idusuario){
        List<Registrapromedio> listado = (List<Registrapromedio>)registrapromedioRepositorio.Registrapromedio(idevaluacion, idusuario);
        Registrapromedio mostrarsolucion = new Registrapromedio();
        for(Registrapromedio rep:listado){
            mostrarsolucion.setTituloevaluacion(rep.getTituloevaluacion());
            mostrarsolucion.setPreguntas(rep.getPreguntas());
            mostrarsolucion.setBuenas(rep.getBuenas());
            mostrarsolucion.setMalas(rep.getMalas());
            mostrarsolucion.setVacias(rep.getVacias());
            mostrarsolucion.setPuntajeobtenido(rep.getPuntajeobtenido());
        }
        return listado;
    }
}
