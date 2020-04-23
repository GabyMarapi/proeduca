package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CursoRepositorio extends CrudRepository<Curso, Long> {
    @Query("SELECT a FROM Curso a WHERE a.idcurso=:idcurso")
    public Curso buscarCurso(@Param("idcurso") Long idcurso);

    @Query("SELECT new com.dagama.proeduca.entidades.Curso(a.idcurso, a.nombrecurso ) FROM Curso a")
    public Iterable<Curso> obtenerReporteCurso();
}
