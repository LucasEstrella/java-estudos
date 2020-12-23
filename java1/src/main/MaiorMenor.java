package main;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maior = Double.NEGATIVE_INFINITY ;
		double menor = Double.POSITIVE_INFINITY;
		int contador;
		int valor;
		final int constante = 50;
		
		for (contador = 0; contador <= constante; contador++) {
			
			System.out.println("Informe o valor: ");
			valor = sc.nextInt();
			
		if(valor > maior) {
			maior = valor;
		}
		else if(valor < menor) {
			menor = valor;
		}		
		
		}
		
		System.out.println("O maior valor digitado foi "+maior);
		System.out.println("O menor valor digitado foi "+menor);
		
	}

}
