import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		float salario = 0;
		float prestacao = 0;
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("*** SIMULADOR DE EMPR�STIMOS ***");
		
		while(opcao != 2) {
			System.out.println("\nInsira o valor do sal�rio bruto: ");
			salario = leitor.nextFloat();
			System.out.println("Insisa o valor da presta��o: ");
			prestacao = leitor.nextFloat();
			
			if(prestacao > salario*0.3)
				System.out.println("Empr�stimo negado.");
			else
				System.out.println("Parab�ns, empr�stimo concedido.");
			
			System.out.println("\n\tEscolha:\n(1) Nova simula��o\n(2) Sair");
			opcao = leitor.nextInt();
		}
		
		leitor.close();
	}
}