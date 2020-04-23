package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcurso;
    @NotBlank
    private String nombrecurso;
    
    public Curso(){

    }

	public Curso(Long idcurso, @NotBlank String nombrecurso) {
		this.idcurso = idcurso;
		this.nombrecurso = nombrecurso;
	}

	public Long getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Long idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombrecurso() {
		return nombrecurso;
	}

	public void setNombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}
}