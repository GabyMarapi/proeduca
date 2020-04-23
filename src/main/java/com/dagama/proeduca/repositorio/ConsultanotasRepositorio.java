package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Consultanotas;
import com.dagama.proeduca.entidades.Cursoxnivel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConsultanotasRepositorio extends CrudRepository<Consultanotas, Long> {
    @Query(value="call ConsultaNotaxEvaluacion(:idevaluacion, :idcurso)", nativeQuery = true)
    public Iterable<Consultanotas> Consultanotas(
            @Param("idevaluacion") int idevaluacion,
            @Param("idcurso") int idcurso);
}
