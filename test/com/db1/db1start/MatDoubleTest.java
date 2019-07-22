package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class MatDoubleTest {
	
	@Test
	public void deveRetornarMenorDeDois() {
		MatDouble matDouble = new MatDouble();
		double menor2 = matDouble.menorDois(1.9, 3.5);
		Assert.assertEquals(1.9, menor2, 0.0001);
	}
	
	@Test
	public void deveRetornarMenorDeTres() {
		MatDouble matDouble = new MatDouble();
		double menor3 = matDouble.menorTres(3.4, 3.14, 5.7);
		Assert.assertEquals(3.14, menor3, 0.0001);
	}
	
	@Test
	public void deveRetornarMediaDeTres() {
		MatDouble matDouble = new MatDouble();
		double media3 = matDouble.mediaTres(8.0, 7.0, 6.0);
		Assert.assertEquals(7.0, media3, 0.0001);
	}
	
	@Test
	public void deveRetornarAreaTriangulo() {
		MatDouble matDouble = new MatDouble();
		double area = matDouble.areaTriangulo(10, 15, 20);
		Assert.assertEquals(72.61, area, 0.01);
	}
	
}












