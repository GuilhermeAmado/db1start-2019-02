package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSimplesTest {
	
	@Test
	public void deveSomarDoisValores() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int soma = calculadoraSimples.somar(10, 15);
		Assert.assertEquals(25, soma);
	}
	
	@Test
	public void deveSubtrairDoisNumeros() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int subtracao = calculadoraSimples.subtrair(25, 5);
		Assert.assertEquals(20, subtracao);
		
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int multiplicacao = calculadoraSimples.multiplicar(2, 2);
		Assert.assertEquals(4, multiplicacao);
	}
	
	@Test
	public void deveDividirDoisNumeros() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int divisao = calculadoraSimples.dividir(10, 2);
		Assert.assertEquals(5, divisao);
	}

	@Test
	public void deveVerificarSePar() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		boolean verifica = calculadoraSimples.verificaPar(2);
		Assert.assertTrue(verifica);
	}
	
	@Test
	public void deveRetornarNumeroMaior() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int maior = calculadoraSimples.verificaMaiorNum(99, 19);
		Assert.assertEquals(99, maior);
	}
	
	@Test
	public void deveRetornarQuantidadeImpares() {
		CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
		int impares = calculadoraSimples.contagemImpares(1);
		Assert.assertEquals(50, impares);
	}
}












