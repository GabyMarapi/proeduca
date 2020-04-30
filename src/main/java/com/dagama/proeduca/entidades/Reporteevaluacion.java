package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reporteevaluacion {
    @Id
    private int ordenalumno;
    private String nombrealumno;
    private double porcentajeingreso;
    private String curso1;
    private String curso2;
    private String curso3;
    private String curso4;
    private String curso5;
    private String curso6;
    private String curso7;
    private String curso8;
    private String curso9;
    private String curso10;
    private double puntajeobtenido;
    private int cantcursos;
    private int cantalumnos;
    private double promedioporcentaje;


    public Reporteevaluacion(){

    }

    public Reporteevaluacion(int ordenalumno, String nombrealumno, double porcentajeingreso, String curso1, String curso2, String curso3, String curso4, String curso5, String curso6, String curso7, String curso8, String curso9, String curso10, double puntajeobtenido, int cantcursos, int cantalumnos, double promedioporcentaje) {
        this.ordenalumno = ordenalumno;
        this.nombrealumno = nombrealumno;
        this.porcentajeingreso = porcentajeingreso;
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
        this.curso4 = curso4;
        this.curso5 = curso5;
        this.curso6 = curso6;
        this.curso7 = curso7;
        this.curso8 = curso8;
        this.curso9 = curso9;
        this.curso10 = curso10;
        this.puntajeobtenido = puntajeobtenido;
        this.cantcursos = cantcursos;
        this.cantalumnos = cantalumnos;
        this.promedioporcentaje = promedioporcentaje;
    }

    public int getOrdenalumno() {
        return ordenalumno;
    }

    public void setOrdenalumno(int ordenalumno) {
        this.ordenalumno = ordenalumno;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public double getPorcentajeingreso() {
        return porcentajeingreso;
    }

    public void setPorcentajeingreso(double porcentajeingreso) {
        this.porcentajeingreso = porcentajeingreso;
    }

    public String getCurso1() {
        return curso1;
    }

    public void setCurso1(String curso1) {
        this.curso1 = curso1;
    }

    public String getCurso2() {
        return curso2;
    }

    public void setCurso2(String curso2) {
        this.curso2 = curso2;
    }

    public String getCurso3() {
        return curso3;
    }

    public void setCurso3(String curso3) {
        this.curso3 = curso3;
    }

    public String getCurso4() {
        return curso4;
    }

    public void setCurso4(String curso4) {
        this.curso4 = curso4;
    }

    public String getCurso5() {
        return curso5;
    }

    public void setCurso5(String curso5) {
        this.curso5 = curso5;
    }

    public String getCurso6() {
        return curso6;
    }

    public void setCurso6(String curso6) {
        this.curso6 = curso6;
    }

    public String getCurso7() {
        return curso7;
    }

    public void setCurso7(String curso7) {
        this.curso7 = curso7;
    }

    public String getCurso8() {
        return curso8;
    }

    public void setCurso8(String curso8) {
        this.curso8 = curso8;
    }

    public String getCurso9() {
        return curso9;
    }

    public void setCurso9(String curso9) {
        this.curso9 = curso9;
    }

    public String getCurso10() {
        return curso10;
    }

    public void setCurso10(String curso10) {
        this.curso10 = curso10;
    }

    public double getPuntajeobtenido() {
        return puntajeobtenido;
    }

    public void setPuntajeobtenido(double puntajeobtenido) {
        this.puntajeobtenido = puntajeobtenido;
    }

    public int getCantcursos() {
        return cantcursos;
    }

    public void setCantcursos(int cantcursos) {
        this.cantcursos = cantcursos;
    }

    public int getCantalumnos() {
        return cantalumnos;
    }

    public void setCantalumnos(int cantalumnos) {
        this.cantalumnos = cantalumnos;
    }

    public double getPromedioporcentaje() {
        return promedioporcentaje;
    }

    public void setPromedioporcentaje(double promedioporcentaje) {
        this.promedioporcentaje = promedioporcentaje;
    }
}
