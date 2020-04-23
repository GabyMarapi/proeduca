package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idalumno;
	@NotBlank
    private String nombrealumno;
	private String idusuario;
	private int idnivelestudio;

	public Alumno() {

	}

	public Alumno(Long idalumno, @NotBlank String nombrealumno, String idusuario, int idnivelestudio) {
		this.idalumno = idalumno;
		this.nombrealumno = nombrealumno;
		this.idusuario = idusuario;
		this.idnivelestudio = idnivelestudio;
	}

	public Long getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}

	public String getNombrealumno() {
		return nombrealumno;
	}

	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdnivelestudio() {
		return idnivelestudio;
	}

	public void setIdnivelestudio(int idnivelestudio) {
		this.idnivelestudio = idnivelestudio;
	}
}
