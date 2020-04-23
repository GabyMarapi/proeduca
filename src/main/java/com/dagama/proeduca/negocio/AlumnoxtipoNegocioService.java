package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Usuarioxtipo;
import com.dagama.proeduca.repositorio.AlumnoxtipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoxtipoNegocioService {
    @Autowired
    private AlumnoxtipoRepositorio alumnoxtipoRepositorio;

    public List<Usuarioxtipo> AlumnoxTipo(int idtipo){
        List<Usuarioxtipo> listado = (List<Usuarioxtipo>)alumnoxtipoRepositorio.ConsultaAlumnoxTipo(idtipo);
        Usuarioxtipo alumnoxtipo = new Usuarioxtipo();
        for(Usuarioxtipo rep:listado){
            alumnoxtipo.setIdusuario(rep.getIdusuario());
            alumnoxtipo.setNombrealumno(rep.getNombrealumno());
            alumnoxtipo.setIdnivelestudio(rep.getIdnivelestudio());
        }
        return listado;
    }
}
