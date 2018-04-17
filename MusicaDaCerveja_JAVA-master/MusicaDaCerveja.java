import java.util.Scanner;

public class MusicaDaCerveja {
	public static void main(String[] args) {
		int cervejas = 99;
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);			
		
		while (cervejas > 1) {
			System.out.println(cervejas + " cervejas no freezer");
			System.out.println("Pego uma garrafa, passo pra frente");
			cervejas -= 1;
			System.out.println("Agora são " + (cervejas - 1) + " cervejas no freezer.");
			
			if(cervejas == 1) {
				System.out.println("\nQuer beber mais? Escolha:");
				System.out.println("(1) Sim\n(2) Não");
				opcao = leitor.nextInt();
				
				if(opcao == 1) {
					cervejas = quantasCervejas(cervejas, leitor);
				} else{
					System.out.println("Acabaram as cervejas :(");
				}
			}
		}
		leitor.close();
	}

	public static int quantasCervejas(int cervejas, Scanner leitor){
		int qntdCervejas = 0;
		if(cervejas == 1){
			System.out.println("Quantas cervejas?");
			qntdCervejas = leitor.nextInt();
		}
		return qntdCervejas;
	}	
}
