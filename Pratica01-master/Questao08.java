import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		int diarias = 0;
		int opcao = 0;
		float contaIndividual = 0;
		float totalPousada = 0;
		String nome = "";
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("  *** Caixa Pousada ***");
		while (opcao != 2) {
			System.out.println("\n    Selecione uma opção:\n(1) Consultar conta individual\n(2) Sair");
			opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.println("Nome do cliente: ");
				nome = leitor.next();
				System.out.println("Dias de permanência: ");
				diarias = leitor.nextInt();	
				
				if (diarias < 10)
					contaIndividual = diarias*40 + 15;
				else
					contaIndividual = diarias*40 + 8;
				
				totalPousada += contaIndividual;
				
				System.out.println("\nCliente: "+nome);
				System.out.println("Valor da conta: "+contaIndividual);
			} else if (opcao != 2 & opcao != 1)
				System.out.println("Opção inválida. Tente novamente.");
		}
		System.out.printf("Total arreacadado: %.2f %n", totalPousada);

		leitor.close();
	}
}
