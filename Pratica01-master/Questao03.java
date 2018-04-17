import java.util.Scanner;

public class Testando {
	public static void main(String[] args) {
		int numero = 0;
		int opcao = 1;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("*** TABUADA ***");
		while (opcao != 0) {
			System.out.println("Digite a tabuada que deseja visualizar: ");
			numero = leitor.nextInt();
			
			tabuada(numero);
			System.out.println("\nDigite 1 para continuar ou 0 para sair.");
			opcao = leitor.nextInt();
		}
		leitor.close();
		
	}
	
	public static void tabuada(int num){
		int i = 0;
		
		for(i = 0; i <= 10; i++){
			System.out.println(num+" x "+i+" = "+(i*num));
		}
	}
}
