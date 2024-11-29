package Polimorfismo;

public  abstract class PrincipalSaude {

		protected String nome;
		protected String especialidade;
		protected int valorConsulta;
		
		public PrincipalSaude(String nome, String especialidade, int valorConsulta) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
		}
		
		public abstract void agendarConsulta();
		
	}
	
		
