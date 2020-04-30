package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Alumno;
import com.dagama.proeduca.entidades.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AlumnoRepositorio extends CrudRepository<Alumno, Long> {
    @Query("SELECT a FROM Alumno a WHERE a.idalumno=:idalumno")
    public Alumno buscarAlumno(@Param("idalumno") Long idalumno);

    @Query("SELECT new com.dagama.proeduca.entidades.Alumno(a.idalumno, a.dni, a.nombrealumno, a.idnivelestudio, a.iduniversidad ) FROM Alumno a")
    public Iterable<Alumno> obtenerReporteAlumno();

}
