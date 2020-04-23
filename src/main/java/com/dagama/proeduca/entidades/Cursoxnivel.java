package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cursoxnivel {
    @Id
    private Long idcurso;
    private String nombrecurso;

    public Cursoxnivel(){

    }

    public Cursoxnivel(Long idcurso, String nombrecurso){
        this.idcurso = idcurso;
        this.nombrecurso = nombrecurso;
    }

    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }
}
