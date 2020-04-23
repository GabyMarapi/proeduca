package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Evaluacionpregunta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idevaluacionpregunta;
    private Long idevaluacion;
    private Long numeropregunta;
    private Long idcurso;
    private double puntajebuena;
    private double puntajemala;
    private double puntajevacia;
    private int idpregunta;

	public Evaluacionpregunta() {

	}

	public Evaluacionpregunta(Long idevaluacionpregunta, Long idevaluacion, Long numeropregunta, Long idcurso, double puntajebuena, double puntajemala, double puntajevacia) {
		this.idevaluacionpregunta = idevaluacionpregunta;
		this.idevaluacion = idevaluacion;
		this.numeropregunta = numeropregunta;
		this.idcurso = idcurso;
		this.puntajebuena = puntajebuena;
		this.puntajemala = puntajemala;
		this.puntajevacia = puntajevacia;
		this.idpregunta = 1;
	}

	public Long getIdevaluacionpregunta() {
		return idevaluacionpregunta;
	}

	public void setIdevaluacionpregunta(Long idevaluacionpregunta) {
		this.idevaluacionpregunta = idevaluacionpregunta;
	}

	public Long getIdevaluacion() {
		return idevaluacion;
	}

	public void setIdevaluacion(Long idevaluacion) {
		this.idevaluacion = idevaluacion;
	}

	public Long getNumeropregunta() {
		return numeropregunta;
	}

	public void setNumeropregunta(Long numeropregunta) {
		this.numeropregunta = numeropregunta;
	}

	public Long getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Long idcurso) {
		this.idcurso = idcurso;
	}

	public double getPuntajebuena() {
		return puntajebuena;
	}

	public void setPuntajebuena(double puntajebuena) {
		this.puntajebuena = puntajebuena;
	}

	public double getPuntajemala() {
		return puntajemala;
	}

	public void setPuntajemala(double puntajemala) {
		this.puntajemala = puntajemala;
	}

	public double getPuntajevacia() {
		return puntajevacia;
	}

	public void setPuntajevacia(double puntajevacia) {
		this.puntajevacia = puntajevacia;
	}

	public int getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(int idpregunta) {
		this.idpregunta = idpregunta;
	}
}
