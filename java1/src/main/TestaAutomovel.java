package main;

import java.util.Scanner;

import model.Carro;
import model.Moto;

public class TestaAutomovel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		System.out.println("Qual tipo de automóvel: c= carro / m= moto");
		res = sc.next();
		if(res.equals("c") ) {
			Carro carro = new Carro();
			
			System.out.println("Nome: ");
			carro.setNome(sc.next());
			System.out.println("Cor: ");
			carro.setCor(sc.next());
			System.out.println("Motor: ");
			carro.setMotor(sc.nextDouble());
			System.out.println("Ano de Fábricação: ");
			carro.setAno(sc.nextInt());
			System.out.println("Que tipo de cambio: ");
			carro.setCambio(sc.next());
			System.out.println();
			System.out.println(carro.toString());
			
		}else if(res.equals("m")) {
			Moto moto = new Moto();
			
			System.out.println("Nome: ");
			moto.setNome(sc.next());
			System.out.println("Cor: ");
			moto.setCor(sc.next());
			System.out.println("Motor: ");
			moto.setMotor(sc.nextDouble());
			System.out.println("Ano de Fábricação: ");
			moto.setAno(sc.nextInt());
			System.out.println("Têm carenagem: s= sim / n= não");
			moto.setCarenagem(sc.next());
			System.out.println();	
			System.out.println(moto.toString());
		}
		sc.close();
	}
}
