package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Reporteevaluacion;
import com.dagama.proeduca.repositorio.ReporteevaluacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteevaluacionNegocioService {
    @Autowired
    private ReporteevaluacionRepositorio reporteevaluacionRepositorio;

    public List<Reporteevaluacion> Reporteevaluacion(int idnivelestudio, int idevaluacion, int cantexam){
        List<Reporteevaluacion> listado = (List<Reporteevaluacion>)reporteevaluacionRepositorio.ConsultaReporteevaluacion(idnivelestudio, idevaluacion, cantexam);
        Reporteevaluacion consultaxEvaluacion = new Reporteevaluacion();
        for(Reporteevaluacion rep:listado){
            consultaxEvaluacion.setOrdenalumno(rep.getOrdenalumno());
            consultaxEvaluacion.setNombrealumno(rep.getNombrealumno());
            consultaxEvaluacion.setPorcentajeingreso(rep.getPorcentajeingreso());
            consultaxEvaluacion.setCurso1(rep.getCurso1());
            consultaxEvaluacion.setCurso2(rep.getCurso2());
            consultaxEvaluacion.setCurso3(rep.getCurso3());
            consultaxEvaluacion.setCurso4(rep.getCurso4());
            consultaxEvaluacion.setCurso5(rep.getCurso5());
            consultaxEvaluacion.setCurso6(rep.getCurso6());
            consultaxEvaluacion.setCurso7(rep.getCurso7());
            consultaxEvaluacion.setCurso8(rep.getCurso8());
            consultaxEvaluacion.setCurso9(rep.getCurso9());
            consultaxEvaluacion.setCurso10(rep.getCurso10());
            consultaxEvaluacion.setPuntajeobtenido(rep.getPuntajeobtenido());
            consultaxEvaluacion.setCantalumnos(rep.getCantalumnos());
            consultaxEvaluacion.setPromedioporcentaje(rep.getPromedioporcentaje());
        }
        return listado;
    }
}
