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

    public Nivelestudio(){

    }

    public Nivelestudio(Long idnivelestudio, @NotBlank String nombrenivelestudio){
        this.idnivelestudio = idnivelestudio;
        this.nombrenivelestudio = nombrenivelestudio;
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
}
