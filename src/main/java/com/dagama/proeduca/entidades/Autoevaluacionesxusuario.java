package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autoevaluacionesxusuario {
    @Id
    private Long idevaluacion;
    private String nombrenivelestudio;
    private String tituloevaluacion;
    private int duracion;
    private int numeropreguntas;
    private int notamaxima;

    public Autoevaluacionesxusuario(){

    }

    public Autoevaluacionesxusuario(Long idevaluacion, String nombrenivelestudio, String tituloevaluacion, int duracion, int numeropreguntas, int notamaxima) {
        this.idevaluacion = idevaluacion;
        this.nombrenivelestudio = nombrenivelestudio;
        this.tituloevaluacion = tituloevaluacion;
        this.duracion = duracion;
        this.numeropreguntas = numeropreguntas;
        this.notamaxima = notamaxima;
    }

    public Long getIdevaluacion() {
        return idevaluacion;
    }

    public void setIdevaluacion(Long idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public String getNombrenivelestudio() {
        return nombrenivelestudio;
    }

    public void setNombrenivelestudio(String nombrenivelestudio) {
        this.nombrenivelestudio = nombrenivelestudio;
    }

    public String getTituloevaluacion() {
        return tituloevaluacion;
    }

    public void setTituloevaluacion(String tituloevaluacion) {
        this.tituloevaluacion = tituloevaluacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumeropreguntas() {
        return numeropreguntas;
    }

    public void setNumeropreguntas(int numeropreguntas) {
        this.numeropreguntas = numeropreguntas;
    }

    public int getNotamaxima() {
        return notamaxima;
    }

    public void setNotamaxima(int notamaxima) {
        this.notamaxima = notamaxima;
    }
}
