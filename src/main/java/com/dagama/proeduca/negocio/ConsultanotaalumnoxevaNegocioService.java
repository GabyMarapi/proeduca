package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Consultanotaalumnoxeva;
import com.dagama.proeduca.repositorio.ConsultanotaalumnoxevaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultanotaalumnoxevaNegocioService {
    @Autowired
    private ConsultanotaalumnoxevaRepositorio consultanotaalumnoxevaRepositorio;

    public List<Consultanotaalumnoxeva> obtenerConsultanotaalumnoxeva(int idevaluacion, int idusuario){
        List<Consultanotaalumnoxeva> listado = (List<Consultanotaalumnoxeva>)consultanotaalumnoxevaRepositorio.Consultanotaalumnoxeva(idevaluacion, idusuario);
        Consultanotaalumnoxeva consultanotaalumnoxeva = new Consultanotaalumnoxeva();
        for(Consultanotaalumnoxeva rep:listado){
            consultanotaalumnoxeva.setTituloevaluacion(rep.getTituloevaluacion());
            consultanotaalumnoxeva.setDescripcionevaluacion(rep.getDescripcionevaluacion());
            consultanotaalumnoxeva.setGradodificultad(rep.getGradodificultad());
            consultanotaalumnoxeva.setDuracion(rep.getDuracion());
            consultanotaalumnoxeva.setPreguntas(rep.getPreguntas());
            consultanotaalumnoxeva.setBuenas(rep.getBuenas());
            consultanotaalumnoxeva.setMalas(rep.getMalas());
            consultanotaalumnoxeva.setVacias(rep.getVacias());
            consultanotaalumnoxeva.setPuntajeobtenido(rep.getPuntajeobtenido());
        }
        return listado;
    }
}
