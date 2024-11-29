package Polimorfismo;

public abstract class ProfissionalSaude {
	protected String nome;
	protected String especialidade;
	protected int valorConsulta;

	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}

	public abstract void agendarConsulta();
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Especialidade: " + especialidade);
		System.out.println("Valor da consulta:  " + valorConsulta);
	}
}


