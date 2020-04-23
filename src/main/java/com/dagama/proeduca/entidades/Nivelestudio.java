package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Nivelestudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idnivelestudio;
    @NotBlank
    private String nombrenivelestudio;
    private int iduniversidad;

    public Nivelestudio(){

    }

    public Nivelestudio(Long idnivelestudio, @NotBlank String nombrenivelestudio, int iduniversidad){
        this.idnivelestudio = idnivelestudio;
        this.nombrenivelestudio = nombrenivelestudio;
        this.iduniversidad = iduniversidad;
    }

    public Long getIdnivelestudio() {
        return idnivelestudio;
    }

    public void setIdnivelestudio(Long idnivelestudio) {
        this.idnivelestudio = idnivelestudio;
    }

    public String getNombrenivelestudio() {
        return nombrenivelestudio;
    }

    public void setNombrenivelestudio(String nombrenivelestudio) {
        this.nombrenivelestudio = nombrenivelestudio;
    }

    public int getIduniversidad() {
        return iduniversidad;
    }

    public void setIduniversidad(int iduniversidad) {
        this.iduniversidad = iduniversidad;
    }
}
