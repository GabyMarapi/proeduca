package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Cursoxnivel;
import com.dagama.proeduca.repositorio.CursoxNivelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoxNivelNegocioService {

    @Autowired
    private CursoxNivelRepositorio cursoxNivelRepositorio;

    public List<Cursoxnivel> CursoxNivel(int idnivelestudio){
        List<Cursoxnivel> listado = (List<Cursoxnivel>)cursoxNivelRepositorio.ConsultaCursoxNivel(idnivelestudio);
        Cursoxnivel consultaxnivel = new Cursoxnivel();
        for(Cursoxnivel rep:listado){
            consultaxnivel.setIdcurso(rep.getIdcurso());
            consultaxnivel.setNombrecurso(rep.getNombrecurso());
        }
        return listado;
    }
}
