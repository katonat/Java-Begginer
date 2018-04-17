import java.util.Scanner;

public class Testando {
	public static void main(String[] args) {
		float litrosGaso = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Abasteceu com quantos litros de gasolina? ");
		litrosGaso = leitor.nextFloat();
		
		System.out.println("   EXTRATO");
		System.out.println("Conveniência\t R$ 6,00\nGasolina\t R$ "+contaGaso(litrosGaso));
		System.out.println("  Total\t\t R$ "+(contaGaso(litrosGaso)+6));
		
		leitor.close();
	}
	
	public static float contaGaso(float litros) {
		return (float) (litros*2.5);
	}
}
