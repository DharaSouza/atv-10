package Polimorfismo;

public abstract class Dentista extends ProfissionalSaude {
	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}
	@Override
	public abstract void agendarConsulta();
	public void exibirInfo() {
		System.out.println("CRO: " + cro);

	}
}


