package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuarioxtipo {
    @Id
    private Long idusuario;
    private String nombrealumno;
    private int idnivelestudio;

    public Usuarioxtipo() {

    }

    public Usuarioxtipo(Long idusuario, String nombrealumno, int idnivelestudio) {
        this.idusuario = idusuario;
        this.nombrealumno = nombrealumno;
        this.idnivelestudio = idnivelestudio;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public int getIdnivelestudio() {
        return idnivelestudio;
    }

    public void setIdnivelestudio(int idnivelestudio) {
        this.idnivelestudio = idnivelestudio;
    }
}
