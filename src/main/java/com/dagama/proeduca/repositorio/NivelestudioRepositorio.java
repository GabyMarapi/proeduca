package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Nivelestudio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface NivelestudioRepositorio extends CrudRepository<Nivelestudio, Long> {
    @Query("SELECT a FROM Nivelestudio a WHERE a.idnivelestudio=:idnivelestudio")
    public Nivelestudio buscarNivelEstudio(@Param("idnivelestudio") Long idnivelestudio);

    @Query("SELECT new com.dagama.proeduca.entidades.Nivelestudio(a.idnivelestudio, a.nombrenivelestudio, a.iduniversidad) FROM Nivelestudio a")
    public Iterable<Nivelestudio> obtenerReporteNivelEstudio();
}
