package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consultanotas {
    @Id
    private int puesto;
    private String nombrealumno;
    private double puntaje;

    public Consultanotas(){

    }

    public Consultanotas(int puesto, String nombrealumno, double puntaje) {
        this.puesto = puesto;
        this.nombrealumno = nombrealumno;
        this.puntaje = puntaje;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
