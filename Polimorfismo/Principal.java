package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Horista horista = new Horista ();
		System.out.println("Salario Horista:");
		System.out.println(horista.calcularSalario(35, 10));
		
		Jornada jornada = new Jornada ();
		System.out.println("Salario Jornada");
		System.out.println(jornada.calcularSalario(150, 20));
		
		PessoaJuridica Pj = new PessoaJuridica();
		System.out.println( "Salario Pessoa Juridica");
		System.out.println(Pj.calcularSalario(10000, 1000));
		
	}
}