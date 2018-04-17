import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		int totalPacientes, mulheres160_170_70kg, total18_25, idade, idadeH, contaH, idadeAnterior;
		float peso, altura, mediaIdadeH, alturaAnterior;
		String sexo = "";
		String nome = "";
		String maisVelho = "";
		String maisBaixa = "";
		peso = mediaIdadeH = altura = alturaAnterior = 0;
		totalPacientes = mulheres160_170_70kg = total18_25 = idade = idadeH = idadeAnterior = contaH = 0;
		Scanner leitor = new Scanner(System.in);
		
		while (!(nome.equals("fim"))) {
			System.out.println("Informe o nome do paciente ou digite \"fim\" para sair: ");
			nome = leitor.next();
			
			if(!(nome.equals("fim"))) {
				System.out.println("Informe o gênero do paciente: (F/M)");
				sexo = leitor.next();
				System.out.println("Informe o peso do paciente: ");
				peso = leitor.nextFloat();
				System.out.println("Informe a idade do paciente: ");
				idade = leitor.nextInt();
				System.out.println("Informa a altura do paciente: ");
				altura = leitor.nextFloat();
				
				totalPacientes++;
				
				if (sexo.equals("M")) {// Se for masculino
					idadeH += idade;
					contaH ++;
					mediaIdadeH = (float)idadeH/(float)contaH;
				}
				else if (sexo.equals("F")){				// Se for feminino	
					if (altura > 1.6 & altura < 1.7 & peso > 70)
						mulheres160_170_70kg += 1;
					if (altura < alturaAnterior || alturaAnterior == 0) {
						maisBaixa = nome;
						alturaAnterior = altura;
					}
				} else
					System.out.println("Informações de genêro incorretas.");
				
				if (idade > 18 & idade < 25)
					total18_25 += 1;
				
				if (idade > idadeAnterior) {
					maisVelho = nome;
					idadeAnterior = idade;
				}
			}

		}
		
		System.out.println("Quantidade de pacientes informados: "+totalPacientes);
		System.out.println("Média de idade dos homens: "+mediaIdadeH);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+mulheres160_170_70kg);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: "+total18_25);
		System.out.println("Nome do paciente mais velho: "+maisVelho);
		System.out.println("Nome da mulher mais baixa: "+maisBaixa);	
		
		leitor.close();
		
	}
}
