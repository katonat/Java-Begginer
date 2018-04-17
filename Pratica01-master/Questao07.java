import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		float nota1 = 0;
		float nota2 = 0;
		float mediaIndividual = 0;
		float somaNotas = 0;
		int i = 0;
		int aprovados, exame, reprovados;
		aprovados = exame = reprovados = 0;
		Scanner leitor = new Scanner(System.in);
		
		for(i = 0; i < 6; i++) {
			System.out.println("Informe a primeira nota:");
			nota1 = leitor.nextFloat();
			System.out.println("Informe a segunda nota:");
			nota2 = leitor.nextFloat();
			mediaIndividual = (nota1 + nota2)/2;
			
			//MENSAGEM
			System.out.println("Média do aluno: "+mediaIndividual);
			if(mediaIndividual < 3) {
				System.out.println("> REPROVADO!\n");
				reprovados += 1;
			} else if(mediaIndividual >= 3 & mediaIndividual <= 7) {
				System.out.println("> EXAME.\n");
				exame += 1;
			} else if(mediaIndividual > 7 & mediaIndividual <= 10) {
				System.out.println("> APROVADO!\n");
				aprovados += 1;
			} else
				System.out.println("Notas inválidas. Tente novamente.\n");
			
			
			somaNotas += mediaIndividual;
		}
		
		System.out.println("Total de alunos aprovados: "+aprovados);
		System.out.println("Total de alunos que irão fazer exame: "+exame);
		System.out.println("Total de alunos reprovados: "+reprovados);
		System.out.printf("Média da turma: %.2f %n", (somaNotas/6));
		
		
		leitor.close();
	}
	
}
	