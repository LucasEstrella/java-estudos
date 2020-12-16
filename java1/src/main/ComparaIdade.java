package main;

import java.util.Scanner;

public class ComparaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1;
		String n2;
		int i1;
		int i2;
		int diferencaIdade;

		System.out.println("Informe seu nome: ");
		n1 = sc.next();
		System.out.println("Informe sua idade: ");
		i1 = sc.nextInt();

		if (i1 >= 18) {
			System.out.println("Você é maior de idade!!!");
			System.out.println();
		} else {
			System.out.println("Você NÃO é maior de idade!!!");
			System.out.println();
		}

		System.out.println("Informe o nome da outra pessoa: ");
		n2 = sc.next();
		System.out.println("Informe a idade dessa pessoa: ");
		i2 = sc.nextInt();

		if (i2 >= 18) {
			System.out.println("Você é maior de idade!!!");
			System.out.println();
		} else {
			System.out.println("Você NÃO é maior de idade!!!");
			System.out.println();
		}

		if (i1 > i2) {
			System.out.println(n1 + " é mais velho(a)!!!");
			System.out.println();
			diferencaIdade = i1 - i2;
			System.out.println("A diferença de idade entre eles é de " + diferencaIdade + " anos.");

		}
		else if (i2 > i1) {
			System.out.println(n2 + " é mais velho(a)!!!");
			System.out.println();
			diferencaIdade = i2 - i1;
			System.out.println("A diferença de idade entre eles é de " + diferencaIdade + " anos.");

		} else {
			System.out.println(n1 + " e " + n2 + " tem a mesma idade.");
		}

	}

}
