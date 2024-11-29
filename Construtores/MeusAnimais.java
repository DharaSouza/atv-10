package Construtores;

public class MeusAnimais {

	private float tamanho;
	private String cor;

	public MeusAnimais () {
	}
	public MeusAnimais(String cor) {
		this.cor = cor;
	}
	public MeusAnimais(float tamanho, String cor) {
		this.tamanho = tamanho ;
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}


