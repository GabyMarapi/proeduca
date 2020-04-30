package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Validausuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ValidausuarioRepositorio extends CrudRepository<Validausuario, Long> {
    @Query(value="call ValidaUsuario(:login, :password)", nativeQuery = true)
    public Iterable<Validausuario> ValidaUsuario(
            @Param("login") String login,
            @Param("password") String password);
}