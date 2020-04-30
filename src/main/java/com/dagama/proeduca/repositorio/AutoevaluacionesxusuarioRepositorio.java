package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Autoevaluacionesxusuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AutoevaluacionesxusuarioRepositorio extends CrudRepository<Autoevaluacionesxusuario, Long> {
    @Query(value="call ListadoAutoEvaluacionesxAlumno(:idusuario, :grado)", nativeQuery = true)
    public Iterable<Autoevaluacionesxusuario> ConsultaAutoevaluacionesxusuario(
            @Param("idusuario") int idusuario,
            @Param("grado") String grado);
}
