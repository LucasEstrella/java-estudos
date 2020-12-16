package main;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		
		System.out.println("!!! CALCULADO !!!");
		System.out.println("Informe o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println("Qual operação matemática deseja fazer(+ - * /): ");
		String op;
		double res;
		op = sc.next();
		
		switch(op){
			case "+": 
				res = n1 + n2;
				System.out.println("Resultado da Soma: "+res);
				break;
			case "-":
				res = n1 - n2;
				System.out.println("Resultado da Subtração: "+res);
				break;
			case "*":
				res= n1 * n2;
				System.out.println("Resultado da Multiplicação: "+res);
				break;
			case "/":
				if(n2 != 0){
					res = n1 / n2;
					System.out.println("Resultado da Divisão: "+res);
				}else {
					System.out.println("Não é possivel dividir com divisor igual a ZERO!!!");
				}
					
			
		}
				
	}

}
