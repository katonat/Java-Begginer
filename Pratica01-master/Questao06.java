import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		float salario = 0;
		float prestacao = 0;
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("*** SIMULADOR DE EMPRÉSTIMOS ***");
		
		while(opcao != 2) {
			System.out.println("\nInsira o valor do salário bruto: ");
			salario = leitor.nextFloat();
			System.out.println("Insisa o valor da prestação: ");
			prestacao = leitor.nextFloat();
			
			if(prestacao > salario*0.3)
				System.out.println("Empréstimo negado.");
			else
				System.out.println("Parabéns, empréstimo concedido.");
			
			System.out.println("\n\tEscolha:\n(1) Nova simulação\n(2) Sair");
			opcao = leitor.nextInt();
		}
		
		leitor.close();
	}
}