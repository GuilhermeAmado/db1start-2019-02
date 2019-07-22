package com.db1.db1start;

public class MatDouble {
	
	// Método que exibe qual é o menor valor entre dois doubles  
	public double menorDois (double num1, double num2) {
		double menorDois = Math.min(num1, num2);
		return menorDois;
	}

	// Método que exibe qual é o menor valor entre três doubles
	public double menorTres (double num1, double num2, double num3) {
		double menorTres = Math.min(Math.min(num1, num2), num3);
		return menorTres;
	}
	
	// Método que exibe a média de três números
	public double mediaTres (double num1, double num2, double num3) {
		double media = (num1 + num2 + num3) / 3;
		return media;
	}
	
	// Método que calcula a área de um triangulo
	public double areaTriangulo (double lado1, double lado2, double lado3) {
		double area = 0;
		double s = (lado1 + lado2 + lado3) / 2;
		area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		return area;
	}
}
