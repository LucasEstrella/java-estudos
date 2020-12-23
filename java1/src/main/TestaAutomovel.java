package main;

import java.util.Scanner;

import model.Carro;
import model.Moto;

public class TestaAutomovel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		System.out.println("Qual tipo de autom�vel: c= carro / m= moto");
		res = sc.next();
		if(res.equals("c") ) {
			Carro carro = new Carro();
			
			System.out.println("Nome: ");
			carro.setNome(sc.next());
			System.out.println("Cor: ");
			carro.setCor(sc.next());
			System.out.println("Motor: ");
			carro.setMotor(sc.nextDouble());
			System.out.println("Ano de F�brica��o: ");
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
			System.out.println("Ano de F�brica��o: ");
			moto.setAno(sc.nextInt());
			System.out.println("T�m carenagem: s= sim / n= n�o");
			moto.setCarenagem(sc.next());
			System.out.println();	
			System.out.println(moto.toString());
		}
		sc.close();
	}
}
