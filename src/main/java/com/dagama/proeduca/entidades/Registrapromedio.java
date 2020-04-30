package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registrapromedio {
    @Id
    private String tituloevaluacion;
    private int preguntas;
    private int buenas;
    private int malas;
    private int vacias;
    private double puntajeobtenido;


    public Registrapromedio(){

    }

    public Registrapromedio(String tituloevaluacion, int preguntas, int buenas, int malas, int vacias, double puntajeobtenido) {
        this.tituloevaluacion = tituloevaluacion;
        this.preguntas = preguntas;
        this.buenas = buenas;
        this.malas = malas;
        this.vacias = vacias;
        this.puntajeobtenido = puntajeobtenido;
    }

    public String getTituloevaluacion() {
        return tituloevaluacion;
    }

    public void setTituloevaluacion(String tituloevaluacion) {
        this.tituloevaluacion = tituloevaluacion;
    }

    public int getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(int preguntas) {
        this.preguntas = preguntas;
    }

    public int getBuenas() {
        return buenas;
    }

    public void setBuenas(int buenas) {
        this.buenas = buenas;
    }

    public int getMalas() {
        return malas;
    }

    public void setMalas(int malas) {
        this.malas = malas;
    }

    public int getVacias() {
        return vacias;
    }

    public void setVacias(int vacias) {
        this.vacias = vacias;
    }

    public double getPuntajeobtenido() {
        return puntajeobtenido;
    }

    public void setPuntajeobtenido(double puntajeobtenido) {
        this.puntajeobtenido = puntajeobtenido;
    }
}
