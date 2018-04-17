import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		Scanner leitor = new Scanner(System.in);
		
		for(i = 1; i <= 10; i++){
			System.out.println("Digite um número: ");
			num = leitor.nextInt();
			parOuImpar(num);
		}
		System.out.println("Fim da execução.");
		
		
		leitor.close();
	}
	
	public static void parOuImpar(int numero) {
		if(numero % 2 == 0)
			System.out.println("É par.");
		else
			System.out.println("É ímpar.");
	}
}
