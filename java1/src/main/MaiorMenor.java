package main;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int menor = 100;
		int contador;
		int valor;
		int constante = 50;
		
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
