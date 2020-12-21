package main;

import java.util.Scanner;

public class CalculaVotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		int cand4 = 0;
		int nulo = 0;
		int branco = 0;
		int op = -1;		
		int contador = 0;
		
		System.out.println("!!!Votação !!!");
		System.out.println("1- Candidato 1");
		System.out.println("2- Candidato 2");
		System.out.println("3- Candidato 3");
		System.out.println("4- Candidato 4");
		System.out.println("5- Voto Nulo");
		System.out.println("6- Voto em Branco");
		System.out.println("0- Encerrar Votação");
		System.out.println();
		
		while(op != 0) {
			System.out.println("Escolha uma opção: ");
			op = sc.nextInt();
			contador++;
			switch(op) {
				case 1:
					cand1 += contador;
				break;
				
				case 2:
					cand2 += contador;
				break;
				
				case 3:
					cand3 += contador;
				break;	
				
				case 4:
					cand4 += contador;
				break;
				
				case 5:
					nulo += contador;
				break;
				
				case 6:
					branco += contador;
				break;	
				
				default:
					System.out.println("Opção inválida!!!");
					System.out.println();
				break;
			}
			contador = 0;
		}
		System.out.println("Total Votação");
		System.out.println("Candidato 1 totalizou "+cand1+" votos.");
		System.out.println("Candidato 2 totalizou "+cand2+" votos.");
		System.out.println("Candidato 3 totalizou "+cand3+" votos.");
		System.out.println("Candidato 4 totalizou "+cand4+" votos.");
		System.out.println("Votos Nulos "+nulo+".");
		System.out.println("Votos em Branco "+branco+".");
		sc.close();
	}

}
