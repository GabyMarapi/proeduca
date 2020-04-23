package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evaluacionxnivel {
    @Id
    private Long idevaluacion;
    private String tituloevaluacion;

    public Evaluacionxnivel(){

    }

    public Evaluacionxnivel(Long idevaluacion, String tituloevaluacion) {
        this.idevaluacion = idevaluacion;
        this.tituloevaluacion = tituloevaluacion;
    }

    public Long getIdevaluacion() {
        return idevaluacion;
    }

    public void setIdevaluacion(Long idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public String getTituloevaluacion() {
        return tituloevaluacion;
    }

    public void setTituloevaluacion(String tituloevaluacion) {
        this.tituloevaluacion = tituloevaluacion;
    }
}
