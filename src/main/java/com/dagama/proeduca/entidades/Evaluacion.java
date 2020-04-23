package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idevaluacion;
    @NotBlank
    private String tituloevaluacion;
    private int idnivelestudio;
    private String descripcionevaluacion;
    private int duracion;
    private int numeropreguntas;
    private String fechainicio;
    private String fechafin;
    private String gradodificultad;
    private String tipoevaluacion;
    private int notamaxima;
    private int esactivo;

	public Evaluacion() {

	}

	public Evaluacion(Long idevaluacion, @NotBlank String tituloevaluacion, int idnivelestudio,
			String descripcionevaluacion, int duracion, int numeropreguntas, String fechainicio, String fechafin,
			String gradodificultad, String tipoevaluacion, int notamaxima, int esactivo) {
		this.idevaluacion = idevaluacion;
		this.tituloevaluacion = tituloevaluacion;
		this.idnivelestudio = idnivelestudio;
		this.descripcionevaluacion = descripcionevaluacion;
		this.duracion = duracion;
		this.numeropreguntas = numeropreguntas;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.gradodificultad = gradodificultad;
		this.tipoevaluacion = tipoevaluacion;
		this.notamaxima = notamaxima;
		this.esactivo = esactivo;
	}

	public Long getIdevaluacion() {
		return idevaluacion;
	}

	public void setIdevaluacion(Long idevaluacion) {
		this.idevaluacion = idevaluacion;
	}

	public String getTituloevaluacion() {
		return tituloevaluacion;
	}

	public void setTituloevaluacion(String tituloevaluacion) {
		this.tituloevaluacion = tituloevaluacion;
	}

	public int getIdnivelestudio() {
		return idnivelestudio;
	}

	public void setIdnivelestudio(int idnivelestudio) {
		this.idnivelestudio = idnivelestudio;
	}

	public String getDescripcionevaluacion() {
		return descripcionevaluacion;
	}

	public void setDescripcionevaluacion(String descripcionevaluacion) {
		this.descripcionevaluacion = descripcionevaluacion;
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

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	public String getGradodificultad() {
		return gradodificultad;
	}

	public void setGradodificultad(String gradodificultad) {
		this.gradodificultad = gradodificultad;
	}

	public String getTipoevaluacion() {
		return tipoevaluacion;
	}

	public void setTipoevaluacion(String tipoevaluacion) {
		this.tipoevaluacion = tipoevaluacion;
	}

	public int getNotamaxima() {
		return notamaxima;
	}

	public void setNotamaxima(int notamaxima) {
		this.notamaxima = notamaxima;
	}

	public int getEsactivo() {
		return esactivo;
	}

	public void setEsactivo(int esactivo) {
		this.esactivo = esactivo;
	}
}
