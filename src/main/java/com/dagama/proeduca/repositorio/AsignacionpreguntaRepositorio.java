package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Asignacionpregunta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AsignacionpreguntaRepositorio extends CrudRepository<Asignacionpregunta, Long> {
    @Query(value="call sp_asignacion_pregunta(:idevaluacion)", nativeQuery = true)
    public Asignacionpregunta AsignarPregunta(
            @Param("idevaluacion") int idevaluacion);
}
