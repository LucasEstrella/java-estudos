package main;

import java.util.Scanner;

import model.Produto;

public class Test {
	
	//Faça um algoritmo que leia o nome de um produto, seu preço e se há desconto. Se a resposta for afirmativa, solicite o percentual, calcule o desconto e apresente o novo preço

	public static void main(String[] args) {
		
		 String res;
		 
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Qual o nome do produto??  ");
		p.setNome(sc.next());
		
		System.out.println("Qual valor?? ");
		p.setPreco(sc.nextDouble());
		
		System.out.println("O produto informado, tem desconto? ");
		res = sc.next();
		
		if(res.equals("s")) {
			System.out.println("Qual valor do desconto?? ");
			p.setDesconto(sc.nextDouble());
			
			System.out.println(p.getPreco() -  (p.getPreco() * p.getDesconto()));
		
			
		} else {
			System.out.println("Produto sem desconto!!");
			
		}
		
		
		

	}

}
