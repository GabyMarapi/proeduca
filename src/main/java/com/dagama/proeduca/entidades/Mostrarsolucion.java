package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CompositeKey2.class)
public class Mostrarsolucion {
    @Id
    private int numero;
    @Id
    private int flag;
    private String descripcion;
    private String enlace;

    public Mostrarsolucion(){

    }

    public Mostrarsolucion(int numero, int flag, String descripcion, String enlace) {
        this.numero = numero;
        this.flag = flag;
        this.descripcion = descripcion;
        this.enlace = enlace;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
