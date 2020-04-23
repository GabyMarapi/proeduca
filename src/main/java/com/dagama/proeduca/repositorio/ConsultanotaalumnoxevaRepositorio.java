package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Consultanotaalumnoxeva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConsultanotaalumnoxevaRepositorio extends CrudRepository<Consultanotaalumnoxeva, Long> {
    @Query(value="call MostrarDetalleEvaluacion(:idevaluacion, :idusuario)", nativeQuery = true)
    public Iterable<Consultanotaalumnoxeva> Consultanotaalumnoxeva(
            @Param("idevaluacion") int idevaluacion,
            @Param("idusuario") int idusuario);
}
