package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Validausuario {
    @Id
    private int idusuario;
    private int idtipo;
    private String nombrealumno;
    private int idnivelestudio;

    public Validausuario(){

    }

    public Validausuario(int idusuario, int idtipo, String nombrealumno, int idnivelestudio) {
        this.idusuario = idusuario;
        this.idtipo = idtipo;
        this.nombrealumno = nombrealumno;
        this.idnivelestudio = idnivelestudio;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public int getIdnivelestudio() {
        return idnivelestudio;
    }

    public void setIdnivelestudio(int idnivelestudio) {
        this.idnivelestudio = idnivelestudio;
    }
}
