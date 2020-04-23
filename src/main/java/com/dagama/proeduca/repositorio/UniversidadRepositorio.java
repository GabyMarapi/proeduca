package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Curso;
import com.dagama.proeduca.entidades.Universidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UniversidadRepositorio extends CrudRepository<Universidad, Long> {

    @Query("SELECT new com.dagama.proeduca.entidades.Universidad(a.iduniversidad, a.nombreuniversidad ) FROM Universidad a")
    public Iterable<Universidad> obtenerReporteUniversidad();

}
