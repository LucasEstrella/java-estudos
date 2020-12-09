package model;

public class Livro {
	private String nome;
	private String autor;
	private int edicao;
	
	public Livro (String nome, String autor, int edicao) {
		this.nome = nome;
		this.autor = autor;
		this.edicao = edicao;
	}
	
	public Livro() {
		
	}
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", edicao=" + edicao + "]";
	}



}
