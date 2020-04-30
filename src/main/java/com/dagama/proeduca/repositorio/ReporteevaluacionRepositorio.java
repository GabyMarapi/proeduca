package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Cursoxevaluacion;
import com.dagama.proeduca.entidades.Reporteevaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReporteevaluacionRepositorio extends CrudRepository<Reporteevaluacion, Long> {
    @Query(value="call sp_reporteEvaluacion(:idnivelestudio, :idevaluacion, :numexam)", nativeQuery = true)
    public Iterable<Reporteevaluacion> ConsultaReporteevaluacion(
            @Param("idnivelestudio") int idnivelestudio,
            @Param("idevaluacion") int idevaluacion,
            @Param("numexam") int numexam);
}
