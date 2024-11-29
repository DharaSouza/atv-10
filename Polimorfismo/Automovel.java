package Polimorfismo;

public class Automovel extends Veiculos{
	private int numPortas;
	private String motor;
	
	
	public Automovel(String marca, String modelo, int ano, String cor, int numPortas, String motor) {
		super(marca, modelo, ano, cor);
		this.numPortas = numPortas;
		this.motor = motor;
	}
 @Override
 
 public void exibirInfo() {
	 super.exibirInfo();
	 System.out.println("Numero de portas: " + numPortas);
	 System.out.println("motor: " + motor);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
