package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Evaluacionmostrar;
import com.dagama.proeduca.entidades.Mostrarsolucion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MostrarSolucionRepositorio extends CrudRepository<Mostrarsolucion, Long> {
    @Query(value="call MostrarSolucion(:idevaluacion, :idusuario)", nativeQuery = true)
    public Iterable<Mostrarsolucion> ConsultaMostrarSolucion(
            @Param("idevaluacion") int idevaluacion,
            @Param("idusuario") int idusuario);
}
