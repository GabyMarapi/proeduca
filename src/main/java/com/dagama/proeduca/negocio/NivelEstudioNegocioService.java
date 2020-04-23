package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Nivelestudio;
import com.dagama.proeduca.repositorio.NivelestudioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NivelEstudioNegocioService {
    @Autowired
    private NivelestudioRepositorio nivelestudioRepositorio;

    public Nivelestudio registrar(Nivelestudio nivelEstudio){ return nivelestudioRepositorio.save(nivelEstudio);}

    public List<Nivelestudio> obtenerNivelEstudio(){
        List<Nivelestudio> listado = (List<Nivelestudio>)nivelestudioRepositorio.obtenerReporteNivelEstudio();
        Nivelestudio nivelEstudio = new Nivelestudio();
        for(Nivelestudio rep:listado){
            nivelEstudio.setIdnivelestudio(rep.getIdnivelestudio());
            nivelEstudio.setNombrenivelestudio(rep.getNombrenivelestudio());
            nivelEstudio.setIduniversidad(rep.getIduniversidad());
        }
        return listado;
    }

    public Nivelestudio obtenerNivelestudioxId(Long idnivelestudio){
        Nivelestudio nivelEstudio;
        nivelEstudio = nivelestudioRepositorio.buscarNivelEstudio(idnivelestudio);
        return nivelEstudio;
    }
}
