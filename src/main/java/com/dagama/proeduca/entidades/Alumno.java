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
	private String dni;
    private String nombrealumno;
	private int idnivelestudio;
	private int iduniversidad;

	public Alumno() {

	}

	public Alumno(Long idalumno, @NotBlank String dni, String nombrealumno, int idnivelestudio, int iduniversidad) {
		this.idalumno = idalumno;
		this.dni = dni;
		this.nombrealumno = nombrealumno;
		this.idnivelestudio = idnivelestudio;
		this.iduniversidad = iduniversidad;
	}

	public Long getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}
}
