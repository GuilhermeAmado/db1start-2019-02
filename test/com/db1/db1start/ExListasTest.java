package com.db1.db1start;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ExListasTest {
	
	@Test
	public void deveRetornarMinhasCoresFavoritas() {
		ExListas exListas = new ExListas();
		
		List<String> cores = exListas.minhasCores();
		
		Assert.assertEquals(3, cores.size());
		Assert.assertTrue(cores.contains("Verde"));
		Assert.assertTrue(cores.contains("Preto"));
		Assert.assertTrue(cores.contains("Azul"));
	}
	
	@Test 
	public void deveContarItensLista() {
		ExListas exListas = new ExListas();
		List<String> cores = exListas.minhasCores();
		int contagem = exListas.contaArray(cores);
		Assert.assertEquals(3, contagem);
	}

	@Test
	public void deveInserir3ItensListaERemoverSegundo() {
		ExListas exListas = new ExListas();
		List<String> itens = exListas.addListArray("Bola", "Raquete", "Tênis");
		Assert.assertEquals(2, itens.size());
		Assert.assertTrue(itens.contains("Bola"));
		Assert.assertTrue(itens.contains("Tênis"));
	}
	
	@Test
	public void deveOrdenarMinhasCoresFavoritas() {
		ExListas exListas = new ExListas();
		List<String> cores = exListas.minhasCores();
		List<String> coresOrdenadas = exListas.ordenaArrayList(cores);
		Assert.assertEquals("Azul", coresOrdenadas.get(0));
		Assert.assertEquals("Preto", coresOrdenadas.get(1));
		Assert.assertEquals("Verde", coresOrdenadas.get(2));
	}
	
	@Test 
	public void deveReceberUmaListaEDeletarUmItem() {
		ExListas exListas = new ExListas();
		List<String> cores = exListas.minhasCores();
		List<String> coresAtualizadas = exListas.recebeListaDeletaItem(cores, "Azul");
		Assert.assertEquals(2, coresAtualizadas.size());
		Assert.assertTrue(coresAtualizadas.contains("Verde"));
		Assert.assertTrue(coresAtualizadas.contains("Preto"));
	}
	
	@Test
	public void deveOrdenarInvertidoMinhasCoresFavoritas() {
		ExListas exListas = new ExListas();
		List<String> cores = exListas.minhasCores();
		List<String> coresOrdemInversa = exListas.inverteArrayList(cores);
		Assert.assertEquals("Verde", coresOrdemInversa.get(0));
		Assert.assertEquals("Preto", coresOrdemInversa.get(1));
		Assert.assertEquals("Azul", coresOrdemInversa.get(2));
	}
	
	@Test // teste da lista dentro da lista
	public void deveRetornarListaDentroLista() {
		ExListas exListas = new ExListas();
		List<Integer> numeros = exListas.meusNumeros();
		List<List<Integer>> listaNum = exListas.separaParesImpares(numeros);
		Assert.assertTrue(listaNum.get(0).contains(2));
		Assert.assertTrue(listaNum.get(0).contains(4));
		Assert.assertTrue(listaNum.get(1).contains(5));
		Assert.assertTrue(listaNum.get(1).contains(3));
		Assert.assertTrue(listaNum.get(1).contains(1));
				
	}
	
	@Test
	public void deveSomarNumerosEmUmaLista() {
		ExListas exListas = new ExListas();
		List<Integer> listaNum = exListas.meusNumeros();
		int soma = exListas.somaLista(listaNum);
		Assert.assertEquals(15, soma);
	}
	
	@Test
	public void deveSomarNumerosEmUmaListaDouble() {
		ExListas exListas = new ExListas();
		List<Double> listaNumDouble = exListas.meusNumerosDouble();
		Double somaDouble = exListas.somaListaDouble(listaNumDouble);
		Assert.assertEquals(9.1, somaDouble, 0.001);
	}
	
	@Test
	public void deveRetornarMenorIntEmUmaLista() {
		ExListas exListas = new ExListas();
		List<Integer> numeros = exListas.meusNumeros();
		int menor = exListas.retornaMenorValorEmUmaLista(numeros);
		Assert.assertEquals(1, menor);
	}
	
	@Test
	public void deveRetornarMaiorIntEmUmaLista() {
		ExListas exListas = new ExListas();
		List<Integer> numeros = exListas.meusNumeros();
		int maior = exListas.retornaMaiorValorEmUmaLista(numeros);
		Assert.assertEquals(5, maior);
	}
	
	@Test
	public void deveRemoverNumerosImpares() {
		ExListas exListas = new ExListas();
		List<Integer> numeros = exListas.meusNumeros();
		List<Integer> numerosPares = exListas.removeNumerosImpares(numeros);
		Assert.assertEquals(2, numerosPares.size());
		Assert.assertTrue(numerosPares.contains(2));
		Assert.assertTrue(numerosPares.contains(4));
	}
	
	
}
	
	
