package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cursoxevaluacion {
    @Id
    private Long idcurso;
    private String nombrecurso;

    public Cursoxevaluacion(){

    }

    public Cursoxevaluacion(Long idcurso, String nombrecurso) {
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
