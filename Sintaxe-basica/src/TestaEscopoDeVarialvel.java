
public class TestaEscopoDeVarialvel {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			
			 acompanhado = true;
			
		} else {
			
			 acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);

		if //(idade >= 18 || quantidadePessoas >= 2)
		   //(idade >= 18 && quantidadePessoas >= 2)
		
			(idade >= 18 && acompanhado) {

			System.out.println("Boa noite, seja bem vindo!");

		} else {

			System.out.println("Infelizmete você não pode entrar");
		}

	}
}

