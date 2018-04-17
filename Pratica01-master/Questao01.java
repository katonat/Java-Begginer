import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		float aumento, novoSalario, salario;
		aumento = novoSalario = salario = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário: ");
		salario = leitor.nextFloat();
		System.out.println("Informe o percentual do aumento: ");
		aumento = leitor.nextFloat();
		
		novoSalario = salario * (1 + aumento/100);
		
		System.out.println("O novo salario é R$ "+novoSalario);
		
		leitor.close();
	}
}
