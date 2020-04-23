package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CompositeKey.class)
public class Evaluacionmostrar {
    @Id
    private int idpregunta;
    @Id
    private int numero;
    @Id
    private int idrespuesta;
    private String descripcion;

    public Evaluacionmostrar(){

    }

    public Evaluacionmostrar(int idpregunta, int numero, int idrespuesta, String descripcion) {
        this.idpregunta = idpregunta;
        this.numero = numero;
        this.idrespuesta = idrespuesta;
        this.descripcion = descripcion;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
