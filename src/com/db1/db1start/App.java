package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		int tamanhoDoNome = Nome.quantidadeDeCaractes("Guilherme Amado");
		System.out.println("Tamanho do nome: " + tamanhoDoNome);
		
		int soma = Inteiro.somaDois(2, 2);
		System.out.println("A soma dos dois n�meros �: " + soma);
		
		int subtracao = Inteiro.subtraiDois(5, 2);
		System.out.println("A subtra��o dos dois n�meros �: " + subtracao);
		
		String textoUpper = Texto.upper("este texto foi digitado em lowercase");
		System.out.println(textoUpper);
		
		String textoLower = Texto.lower("este texto foi digitado em uppercase");
		System.out.println(textoLower);
		
		Double menor2 = Matematica.menorDois(8.5, 7.3);
		System.out.println("O menor entre os dois n�meros foi: " + menor2);
		
		Double menor3 = Matematica.menorTres(8.5, 7.3, 2.5);
		System.out.println("O menor entre os tr�s n�meros foi: " + menor3);
		
		// m�todo de instancia objeto (comportamentos ao objeto)
		CalculadoraSimples calculadora = new CalculadoraSimples();
		System.out.println(calculadora.somar(10,  15));
		System.out.println(calculadora.subtrair(25,  15));
		
	} 

}