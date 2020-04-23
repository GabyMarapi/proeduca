package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Universidad;
import com.dagama.proeduca.repositorio.CursoRepositorio;
import com.dagama.proeduca.repositorio.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UniversidadNegocioService {
    @Autowired
    private UniversidadRepositorio universidadRepositorio;

    public Universidad registrar(Universidad universidad){ return universidadRepositorio.save(universidad);}

    public List<Universidad> obtenerUniversidad(){
        List<Universidad> listado = (List<Universidad>)universidadRepositorio.obtenerReporteUniversidad();
        Universidad universidad = new Universidad();
        for(Universidad rep:listado){
            universidad.setIduniversidad(rep.getIduniversidad());
            universidad.setNombreuniversidad(rep.getNombreuniversidad());
        }
        return listado;
    }
}
