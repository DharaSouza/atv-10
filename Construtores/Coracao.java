package Construtores;

public class Coracao {

	String nome;
	String cor;
	int altura;
	int largura;

	public Coracao() { 

	}
	public Coracao(String nome, String cor, int altura, int largura) { 
		this.nome = nome; 
		this.cor = cor; 
		this.altura = altura; 
		this.largura = largura; 
	} 
	public static void main(String[] args) { 
		Coracao desenha = new Coracao("Coração","Vermelho", 40, 40); 
		System.out.println(desenha.nome); 
		System.out.println(desenha.cor);
		System.out.println(desenha.altura); 
		System.out.println(desenha.largura); 
	} 

} 
