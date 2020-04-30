package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Evaluacionmostrar;
import com.dagama.proeduca.entidades.Mostrarsolucion;
import com.dagama.proeduca.repositorio.MostrarSolucionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarSolucionNegocioService {
    @Autowired
    private MostrarSolucionRepositorio mostrarSolucionRepositorio;

    public List<Mostrarsolucion> MostrarSolucion(int idevaluacion, int idusuario){
        List<Mostrarsolucion> listado = (List<Mostrarsolucion>)mostrarSolucionRepositorio.ConsultaMostrarSolucion(idevaluacion, idusuario);
        Mostrarsolucion mostrarsolucion = new Mostrarsolucion();
        for(Mostrarsolucion rep:listado){
            mostrarsolucion.setNumero(rep.getNumero());
            mostrarsolucion.setFlag(rep.getFlag());
            mostrarsolucion.setDescripcion(rep.getDescripcion());
            mostrarsolucion.setEnlace(rep.getEnlace());
        }
        return listado;
    }
}
