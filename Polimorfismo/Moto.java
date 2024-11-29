package Polimorfismo;

public class Moto extends Veiculos {
	
	private int cilindrada;
	
	public Moto(String marca, String modelo, int ano, String cor, int cilindrada) {
		super(marca, modelo, ano, cor);
		this.cilindrada = cilindrada;
	}
	 @Override
	 
	 public void exibirInfo() {
		 super.exibirInfo();
		 System.out.println("Cilindrada: " + cilindrada);
				

}
}