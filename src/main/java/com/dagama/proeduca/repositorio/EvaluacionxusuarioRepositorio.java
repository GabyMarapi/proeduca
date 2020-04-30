package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Evaluacionxusuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EvaluacionxusuarioRepositorio extends CrudRepository<Evaluacionxusuario, Long> {
    @Query(value="call ListadoEvaluacionesxAlumno(:idusuario, :flag)", nativeQuery = true)
    public Iterable<Evaluacionxusuario> ConsultaEvaluacionxUsuario(
            @Param("idusuario") int idusuario,
            @Param("flag") int flag);
}
