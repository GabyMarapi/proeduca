package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Asignacionpregunta;
import com.dagama.proeduca.entidades.Registrapromedio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RegistrapromedioRepositorio extends CrudRepository<Registrapromedio, Long> {
    @Query(value="call sp_registraEvaluacionAlumno(:idevaluacion, :idusuario)", nativeQuery = true)
    public Iterable<Registrapromedio> Registrapromedio(
            @Param("idevaluacion") int idevaluacion,
            @Param("idusuario") int idusuario);
}
