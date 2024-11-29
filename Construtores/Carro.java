package Construtores;

public class Carro {
	private String placa;
	private int NumChassi;
	
	public Carro () {
	}
	public Carro(String placa) {
		this.placa = placa;
	}
	public Carro(String placa, int NumChassi) {
		this.placa = placa ;
		this.NumChassi = NumChassi;
	}

	public String getPacla() {
		return placa;
	}
	public void setPacla(String pacla) {
		this.placa = pacla;
	}
	public int getNumChassi() {
		return NumChassi;
	}
	public void setNumChassi(int numChassi) {
		NumChassi = numChassi;
	}

}
