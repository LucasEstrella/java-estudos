package main;

import java.util.Scanner;

import model.Calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
		
		System.out.println("!!! CALCULADO !!!");
		System.out.println("Informe o primeiro n�mero: ");
		c1.setNumero1(sc.nextDouble());
		System.out.println("Informe o segundo n�mero: ");
		c1.setNumero2(sc.nextDouble());
		
		System.out.println("Qual opera��o matem�tica deseja fazer(+ - * /): ");
		String op;
		op = sc.next();
		
		switch(op){
			case "+": 
				c1.setResultado(c1.somar(c1.getNumero1(), c1.getNumero2()));
				System.out.println("Resultado da Soma: "+c1.getResultado());
				break;
			case "-":
				c1.setResultado(c1.subtrair(c1.getNumero1(), c1.getNumero2()));
				System.out.println("Resultado da Subtra��o: "+c1.getResultado());
				break;
			case "*":
				c1.setResultado(c1.multiplicar(c1.getNumero1(), c1.getNumero2()));
				System.out.println("Resultado da Multiplica��o: "+c1.getResultado());
				break;
			case "/":
				if(c1.getNumero2() != 0){
					c1.setResultado(c1.dividir(c1.getNumero1(), c1.getNumero2()));
					System.out.println("Resultado da Divis�o: "+c1.getResultado());
				}else {
					System.out.println("N�o � possivel dividir com divisor igual a ZERO!!!");
				}
					
			
		}
				
	}

}
