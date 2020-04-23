package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduniversidad;
    @NotBlank
    private String nombreuniversidad;

    public Universidad(){

    }

	public Universidad(Long iduniversidad, @NotBlank String nombreuniversidad) {
		this.iduniversidad = iduniversidad;
		this.nombreuniversidad = nombreuniversidad;
	}

	public Long getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(Long iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getNombreuniversidad() {
		return nombreuniversidad;
	}

	public void setNombreuniversidad(String nombreuniversidad) {
		this.nombreuniversidad = nombreuniversidad;
	}
}
