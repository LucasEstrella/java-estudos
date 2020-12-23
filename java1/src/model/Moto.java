package model;

public class Moto extends Automovel {
	private String carenagem;

	public String getCarenagem() {
		return carenagem;
	}

	public void setCarenagem(String carenagem) {
		this.carenagem = carenagem;
	}
	public String toString() {
		return super.toString() + "\nCarenagem: "+this.carenagem;
	}

}
