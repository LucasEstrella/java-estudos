package main;

import java.util.Scanner;

import model.Calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
		
		System.out.println("!!! CALCULADO !!!");
		System.out.println("Informe o primeiro número: ");
		c1.setNumero1(sc.nextDouble());
		System.out.println("Informe o segundo número: ");
		c1.setNumero2(sc.nextDouble());
		
		System.out.println("Qual operação matemática deseja fazer(+ - * /): ");
		String op;
		double res;
		op = sc.next();
		
		switch(op){
			case "+": 
				res = c1.getNumero1() + c1.getNumero2();
				System.out.println("Resultado da Soma: "+res);
				break;
			case "-":
				res = c1.getNumero1() - c1.getNumero2();
				System.out.println("Resultado da Subtração: "+res);
				break;
			case "*":
				res = c1.getNumero1() * c1.getNumero2();
				System.out.println("Resultado da Multiplicação: "+res);
				break;
			case "/":
				if(c1.getNumero2() != 0){
					res = c1.getNumero1() / c1.getNumero2();
					System.out.println("Resultado da Divisão: "+res);
				}else {
					System.out.println("Não é possivel dividir com divisor igual a ZERO!!!");
				}
					
			
		}
				
	}

}
