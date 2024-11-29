package Polimorfismo;

public class PrincipalVeiculos {

	public static void main(String[] args) {

		Automovel carro1 = new Automovel("Ford", "gt", 2020,"azul", 4,"V8");
		Moto moto1 = new Moto("Honda","CB300f",2024,"Preto", 293);
		
		carro1.exibirInfo();
		moto1.exibirInfo();
	}

}
