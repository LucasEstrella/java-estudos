package main;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		
		System.out.println("!!! CALCULADO !!!");
		System.out.println("Informe o primeiro n�mero: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		n2 = sc.nextDouble();
		
		System.out.println("Qual opera��o matem�tica deseja fazer(+ - * /): ");
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
				System.out.println("Resultado da Subtra��o: "+res);
				break;
			case "*":
				res= n1 * n2;
				System.out.println("Resultado da Multiplica��o: "+res);
				break;
			case "/":
				if(n2 != 0){
					res = n1 / n2;
					System.out.println("Resultado da Divis�o: "+res);
				}else {
					System.out.println("N�o � possivel dividir com divisor igual a ZERO!!!");
				}
					
			
		}
				
	}

}
