package seguradora;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.cadastrarCliente();
		System.out.println(cliente.getNome());
		
	}
}
