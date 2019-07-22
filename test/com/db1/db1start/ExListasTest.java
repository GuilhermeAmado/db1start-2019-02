package com.db1.db1start;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ExListasTest {
	
	@Test
	public void deveMinhasCoresFavoritas() {
		ExListas exListas = new ExListas();
		
		List<String> cores = exListas.minhasCores();
		
		Assert.assertEquals(3, cores.size());
		Assert.assertTrue(cores.contains("Verde"));
		Assert.assertTrue(cores.contains("Preto"));
		Assert.assertTrue(cores.contains("Azul"));
	}

}
