package Polimorfismo;

public abstract  class Medico extends ProfissionalSaude{
	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	
	@Override
	public abstract void agendarConsulta();
	public void exibirInfo() {
		System.out.println("CRM: " + crm);
		System.out.println("Consulta com o medico: " + nome + "agendada");
	}
}



