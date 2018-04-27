package tratamento.excecoes;

public class Main {
	
	public static void main(String[] args) throws ErroChecado, DepositoInvalido, SaldoInsuficienteException, ZerarContaException {
			
		ContaCorrente conta = new ContaCorrente();
		//conta.sacar(100.0f); //erro: exception não tratada/lançada
		conta.depositar(10f);
		System.out.println(conta.getValor());
		
		conta.encerrarConta();
		
		
		
		ErroChecado erro = new ErroChecado("Mensagemmmm");
		//throw erro;	// ao lançar a exceção, a execução é interrompida
		
		
		

	}

}
