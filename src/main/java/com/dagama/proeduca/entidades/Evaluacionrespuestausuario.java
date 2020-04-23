package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evaluacionrespuestausuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idevaluacionrespuestausuario;
    private int idevaluacion;
    private int idpregunta;
    private int idrespuesta;
    private int idusuario;
    private double puntaje;
    private int orden;

    public Evaluacionrespuestausuario(){

    }

    public Evaluacionrespuestausuario(Long idevaluacionrespuestausuario, int idevaluacion, int idpregunta, int idrespuesta, int idusuario, double puntaje, int orden) {
        this.idevaluacionrespuestausuario = idevaluacionrespuestausuario;
        this.idevaluacion = idevaluacion;
        this.idpregunta = idpregunta;
        this.idrespuesta = idrespuesta;
        this.idusuario = idusuario;
        this.puntaje = puntaje;
        this.orden = orden;
    }

    public Long getIdevaluacionrespuestausuario() {
        return idevaluacionrespuestausuario;
    }

    public void setIdevaluacionrespuestausuario(Long idevaluacionrespuestausuario) {
        this.idevaluacionrespuestausuario = idevaluacionrespuestausuario;
    }

    public int getIdevaluacion() {
        return idevaluacion;
    }

    public void setIdevaluacion(int idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public int getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
