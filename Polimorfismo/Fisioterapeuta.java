package Polimorfismo;

public abstract class Fisioterapeuta  extends ProfissionalSaude{
	private String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	@Override
	public abstract void agendarConsulta();
	public void exibirInfo() {
		System.out.println("Crefito: " + crefito);

	}


}
