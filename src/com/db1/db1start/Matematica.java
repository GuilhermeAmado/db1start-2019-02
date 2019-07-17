package com.db1.db1start;

public class Matematica {
	public static double menorDois (double num1, double num2) {
		double menorDois = Math.min(num1, num2);
		return menorDois;
	}

	public static double menorTres (double num1, double num2, double num3) {
		double menorTres = Math.min(Math.min(num1, num2), num3);
		return menorTres;
	}
}
