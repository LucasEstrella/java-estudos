package model;

public class Calculadora {
	private double numero1;
	private double numero2;
	private double resultado;
	

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public double somar(double n1, double n2) {
		resultado = n1 + n2;
		return resultado;
	}
	public double subtrair(double n1, double n2) {
		resultado = n1 - n2;
		return resultado;
	}
	public double multiplicar(double n1, double n2) {
		resultado = n1 * n2;
		return resultado;
	}
	public double dividir(double n1, double n2) {
		resultado = n1/n2;
		return resultado;
	}
}
