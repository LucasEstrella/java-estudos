package main;

import java.util.Scanner;

import model.Pessoa;

public class ComparaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		int diferencaIdade;

		System.out.println("Informe seu nome: ");
		pessoa1.setNome(sc.next());
		System.out.println("Informe sua idade: ");
		pessoa1.setIdade(sc.nextInt());

		if (pessoa1.getIdade() >= 18) {
			System.out.println("Você é maior de idade!!!");
			System.out.println();
		} else {
			System.out.println("Você NÃO é maior de idade!!!");
			System.out.println();
		}

		System.out.println("Informe o nome da outra pessoa: ");
		pessoa2.setNome(sc.next());
		System.out.println("Informe a idade dessa pessoa: ");
		pessoa2.setIdade(sc.nextInt());

		if (pessoa2.getIdade() >= 18) {
			System.out.println("Você é maior de idade!!!");
			System.out.println();
		} else {
			System.out.println("Você NÃO é maior de idade!!!");
			System.out.println();
		}

		if (pessoa1.getIdade() > pessoa2.getIdade()) {
			System.out.println(pessoa1.getNome() + " é mais velho(a)!!!");
			System.out.println();
			diferencaIdade = pessoa1.getIdade() - pessoa2.getIdade();
			System.out.println("A diferença de idade entre eles é de " + diferencaIdade + " anos.");

		}
		else if (pessoa2.getIdade() > pessoa1.getIdade()) {
			System.out.println(pessoa2.getNome() + " é mais velho(a)!!!");
			System.out.println();
			diferencaIdade = pessoa2.getIdade() - pessoa1.getIdade();
			System.out.println("A diferença de idade entre eles é de " + diferencaIdade + " anos.");

		} else {
			System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " tem a mesma idade.");
		}

	}

}
