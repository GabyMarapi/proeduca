package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepositorio extends CrudRepository<Alumno, Long> {

    @Query("SELECT new com.dagama.proeduca.entidades.Alumno(a.idalumno, a.nombrealumno, a.idusuario, a.idnivelestudio ) FROM Alumno a")
    public Iterable<Alumno> obtenerReporteAlumno();
}
