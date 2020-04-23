package com.dagama.proeduca;

import com.dagama.proeduca.entidades.*;
import com.dagama.proeduca.negocio.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProeducaApplicationTests {

	@Autowired
	private CursoNegocioService cursoNegocioService;
	@Autowired
	private NivelEstudioNegocioService nivelEstudioNegocioService;
	@Autowired
	private EvaluacionNegocioService evaluacionNegocioService;

	@Test
	public void probarRegistroCurso() {
		Curso curso = new Curso();
		curso.setNombrecurso("ANATOMIA");

		Curso c1 = cursoNegocioService.registrar(curso);
		Assert.assertNotNull(c1);
	}

	@Test
	public void probarRegistroNivelEstudio() {
		Nivelestudio nivelestudio = new Nivelestudio();
		nivelestudio.setNombrenivelestudio("BACHILLER");
		nivelestudio.setIduniversidad(1);

		Nivelestudio N1 = nivelEstudioNegocioService.registrar(nivelestudio);
		Assert.assertNotNull(N1);
	}

	@Test
	public void probarRegistroEvaluacion() {
		Evaluacion evaluacion = new Evaluacion();
		evaluacion.setTituloevaluacion("Evaluacion Inicial");
		evaluacion.setIdnivelestudio(1);
		evaluacion.setDescripcionevaluacion("Evaluacion para las pruebas");
		evaluacion.setDuracion(60);
		evaluacion.setNumeropreguntas(5);
		evaluacion.setFechainicio("22/04/2020");
		evaluacion.setFechafin("22/04/2020");
		evaluacion.setGradodificultad("N");
		evaluacion.setTipoevaluacion("E");
		evaluacion.setNotamaxima(20);
		evaluacion.setEsactivo(1);

		Evaluacion e1 = evaluacionNegocioService.registrar(evaluacion);
		Assert.assertNotNull(e1);
	}
}