package model;

public class Automovel {
	private double motor;
	private String nome;
	private String cor;
	private int ano;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return "Nome: "+this.nome+ "\nCor: "+this.cor+"\nMotor: "+this.motor+"\nAno de Fabricação: "+this.ano;
	}

}
