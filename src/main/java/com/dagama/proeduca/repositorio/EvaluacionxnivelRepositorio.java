package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Evaluacionxnivel;
import com.dagama.proeduca.entidades.Evaluacionxusuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EvaluacionxnivelRepositorio extends CrudRepository<Evaluacionxnivel, Long> {
    @Query(value="call ConsultaEvaluacionxNivel(:idnivel)", nativeQuery = true)
    public Iterable<Evaluacionxnivel> ConsultaEvaluacionxNivel(
            @Param("idnivel") int idnivel);
}
