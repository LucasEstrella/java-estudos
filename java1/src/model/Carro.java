package model;

public class Carro extends Automovel{
	private String cambio;

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String toString() {
		return super.toString() + "\nCambio: "+this.cambio;
		
	}

}
