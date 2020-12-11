package main;

import java.util.Scanner;

import model.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa =  new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Informe seu sobrenome: ");
		pessoa.setSobrenome(sc.nextLine());
		
		
		//System.out.println("Nome Completo: "+pessoa.getNome()+ " " + pessoa.getSobrenome());
		
		System.out.println(pessoa.toString());
		
		sc.close();
	}

}
