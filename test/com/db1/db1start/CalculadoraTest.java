package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisValores() {
		Calculadora calculadora = new Calculadora(12, 13);
		int soma = calculadora.somar();
		Assert.assertEquals(25, soma);
	}

}