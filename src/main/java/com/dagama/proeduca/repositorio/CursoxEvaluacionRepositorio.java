package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Cursoxevaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CursoxEvaluacionRepositorio extends CrudRepository<Cursoxevaluacion, Long> {
    @Query(value="call ConsultaCursoxEvaluacion(:idevaluacion)", nativeQuery = true)
    public Iterable<Cursoxevaluacion> ConsultaCursoxEvaluacion(
            @Param("idevaluacion") int idevaluacion);
}
