package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Evaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EvaluacionRepositorio extends CrudRepository<Evaluacion, Long> {

    @Query("SELECT a FROM Evaluacion a WHERE a.idevaluacion=:idevaluacion")
    public Evaluacion buscarEvaluacion(@Param("idevaluacion") Long idevaluacion);

    @Query("SELECT new com.dagama.proeduca.entidades.Evaluacion(a.idevaluacion, a.tituloevaluacion, a.idnivelestudio, a.descripcionevaluacion, a.duracion, a.numeropreguntas, a.fechainicio, a.fechafin, a.gradodificultad, a.tipoevaluacion, a.notamaxima, a.esactivo ) FROM Evaluacion a")
    public Iterable<Evaluacion> obtenerReporteEvaluacion();
}
