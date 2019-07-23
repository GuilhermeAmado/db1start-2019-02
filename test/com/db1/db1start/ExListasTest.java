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
		List<String> coresOrdenadas = exListas.ordenaArrayList();
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
		List<String> coresOrdemInversa = exListas.inverteArrayList();
		Assert.assertEquals("Verde", coresOrdemInversa.get(0));
		Assert.assertEquals("Preto", coresOrdemInversa.get(1));
		Assert.assertEquals("Azul", coresOrdemInversa.get(2));
	}
	
	@Test
	public void deveSomarNumerosEmUmaLista() {
		ExListas exListas = new ExListas();
		List<Integer> listaNum = exListas.meusNumeros();
		int soma = exListas.somaLista(listaNum);
		Assert.assertEquals(15, soma);
	}
}
	
	
