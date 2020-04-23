package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Usuarioxtipo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AlumnoxtipoRepositorio extends CrudRepository<Usuarioxtipo, Long> {
    @Query(value="call ListarUsuarios(:idtipo)", nativeQuery = true)
    public Iterable<Usuarioxtipo> ConsultaAlumnoxTipo(
            @Param("idtipo") int idtipo);
}
