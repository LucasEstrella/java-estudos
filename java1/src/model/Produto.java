package model;

public class Produto {
	
	//Fa�a um algoritmo que leia o nome de um produto, seu pre�o e se h� desconto. Se a resposta for afirmativa, solicite o percentual, calcule o desconto e apresente o novo pre�o
	
	private String nome;
	private double preco;
	private double desconto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto /100;
	}

}
