package Construtores;

public class ConstrutorMeusAnimais {
	
	public static void main(String[] args) {
		
		MeusAnimais animais1 = new MeusAnimais();
		MeusAnimais animais2 = new MeusAnimais(2,"preto");
		
		System.out.println(animais2.getTamanho());
		System.out.println(animais2.getCor());
		
	}

}
