package main;

import java.util.Scanner;

public class MediaPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somapar = 0 ;
		double nota = 0;
		double media;
		int contador = 0;
		
		System.out.println("Calculador de Média !!!");
		do {
		System.out.println("Informe o valor da Nota, ou -1 para Encerrar: ");
		nota = sc.nextDouble();
		if(nota % 2 == 0){
			somapar += nota;
			contador++;
		}
		}while(nota != -1);
		media = somapar / contador;
		System.out.println("Média: "+media);
	}

	
}
