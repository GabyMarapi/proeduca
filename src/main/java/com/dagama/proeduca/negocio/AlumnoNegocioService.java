package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Alumno;
import com.dagama.proeduca.repositorio.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoNegocioService {
    @Autowired
    private AlumnoRepositorio alumnoRepositorio;

    public Alumno registrar(Alumno alumno){ return alumnoRepositorio.save(alumno);}

    public List<Alumno> obtenerAlumno(){
        List<Alumno> listado = (List<Alumno>)alumnoRepositorio.obtenerReporteAlumno();
        Alumno alumno = new Alumno();
        for(Alumno rep:listado){
            alumno.setIdalumno(rep.getIdalumno());
            alumno.setNombrealumno(rep.getNombrealumno());
            alumno.setIdusuario(rep.getIdusuario());
            alumno.setIdnivelestudio(rep.getIdnivelestudio());
        }
        return listado;
    }
}
