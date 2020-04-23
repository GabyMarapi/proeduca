package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Cursoxnivel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CursoxNivelRepositorio extends CrudRepository<Cursoxnivel, Long> {
    @Query(value="call ConsultaCursoxNivel(:idnivelestudio)", nativeQuery = true)
    public Iterable<Cursoxnivel> ConsultaCursoxNivel(
            @Param("idnivelestudio") int idnivelestudio);
}
