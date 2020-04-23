package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evaluacionxusuario {
    @Id
    private Long idevaluacion;
    private String nombrenivelestudio;
    private String tituloevaluacion;
    private int duracion;
    private int numeropreguntas;
    private String fechainicio;
    private String gradodificultad;
    private int notamaxima;

    public Evaluacionxusuario(){

    }

    public Evaluacionxusuario(Long idevaluacion, String nombrenivelestudio, String tituloevaluacion, int duracion, int numeropreguntas, String fechainicio, String gradodificultad, int notamaxima) {
        this.idevaluacion = idevaluacion;
        this.nombrenivelestudio = nombrenivelestudio;
        this.tituloevaluacion = tituloevaluacion;
        this.duracion = duracion;
        this.numeropreguntas = numeropreguntas;
        this.fechainicio = fechainicio;
        this.gradodificultad = gradodificultad;
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

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getGradodificultad() {
        return gradodificultad;
    }

    public void setGradodificultad(String gradodificultad) {
        this.gradodificultad = gradodificultad;
    }

    public int getNotamaxima() {
        return notamaxima;
    }

    public void setNotamaxima(int notamaxima) {
        this.notamaxima = notamaxima;
    }
}
