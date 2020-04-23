package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Evaluacionpregunta;
import com.dagama.proeduca.entidades.Usuarioxtipo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EvaluacionpreguntaRepositorio extends CrudRepository<Evaluacionpregunta, Long> {
    @Query(value="call ListadoEvaluacionespreguntaXIdEvaluacion(:idevaluacion)", nativeQuery = true)
    public Iterable<Evaluacionpregunta> ConsultaEvaluacionpreguntasxEvaluacion(
            @Param("idevaluacion") int idevaluacion);
}
