import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		float salario = 0;
		String nome = "";
		Scanner leitor = new Scanner(System.in);
		
		while(!(nome.equals("fim"))) {
			System.out.println("\nNome do funcionário: ");
			nome = leitor.next();
			if(!(nome.equals("fim"))) {
				System.out.println("Informe o salário: ");
				salario = leitor.nextFloat();
				
				if(salario < 500) {
					salario *= 1.2;
					System.out.println("Salário reajustado: R$"+salario);
				} else {
					System.out.println("Funcionário não tem direito a aumento.");
				}
				System.out.println("\nDigite \"fim\" para sair.");				
			}

		}
		leitor.close();
	}
}
