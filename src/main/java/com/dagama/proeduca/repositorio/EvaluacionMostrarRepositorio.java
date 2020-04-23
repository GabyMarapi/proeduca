package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Evaluacionmostrar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EvaluacionMostrarRepositorio extends CrudRepository<Evaluacionmostrar, Long> {
    @Query(value="call MostrarEvaluacion(:idevaluacion)", nativeQuery = true)
    public Iterable<Evaluacionmostrar> ConsultaEvaluacionMostrar(
            @Param("idevaluacion") int idevaluacion);
}
