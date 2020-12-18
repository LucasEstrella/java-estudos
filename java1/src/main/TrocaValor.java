package main;

import java.util.Scanner;

public class TrocaValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.println("Informe o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe o segundo número: ");
		n2 = sc.nextInt();
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("Agora o primeiro número é "+n1);
		System.out.println("Agora o segundo número é "+n2);
			
		
		sc.close();
	}

}
