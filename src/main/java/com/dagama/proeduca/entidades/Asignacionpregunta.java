package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asignacionpregunta {
    @Id
    private int valor;

    public Asignacionpregunta(){

    }

    public Asignacionpregunta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
