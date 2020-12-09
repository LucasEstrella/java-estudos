package main;

import java.util.Scanner;

import model.Livro;

public class TestaLivro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Livro l = new Livro();
		
		System.out.println("Nome do Livro: ");
		l.setNome(sc.nextLine());
		System.out.println("Autor do Livro: ");
		l.setAutor(sc.nextLine());
		System.out.println("Edição do Livro: ");
		l.setEdicao(sc.nextInt());	
		
		sc.close();
		
	}

}
