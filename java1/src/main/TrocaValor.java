package main;

import java.util.Scanner;

public class TrocaValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.println("Informe o primeiro n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		n2 = sc.nextInt();
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("Agora o primeiro n�mero � "+n1);
		System.out.println("Agora o segundo n�mero � "+n2);
			
		
		sc.close();
	}

}
