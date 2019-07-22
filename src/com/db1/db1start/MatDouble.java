package com.db1.db1start;

public class MatDouble {
	
	// M�todo que exibe qual � o menor valor entre dois doubles  
	public double menorDois (double num1, double num2) {
		double menorDois = Math.min(num1, num2);
		return menorDois;
	}

	// M�todo que exibe qual � o menor valor entre tr�s doubles
	public double menorTres (double num1, double num2, double num3) {
		double menorTres = Math.min(Math.min(num1, num2), num3);
		return menorTres;
	}
	
	// M�todo que exibe a m�dia de tr�s n�meros
	public double mediaTres (double num1, double num2, double num3) {
		double media = (num1 + num2 + num3) / 3;
		return media;
	}
	
	// M�todo que calcula a �rea de um triangulo
	public double areaTriangulo (double lado1, double lado2, double lado3) {
		double area = 0;
		double s = (lado1 + lado2 + lado3) / 2;
		area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		return area;
	}
}
