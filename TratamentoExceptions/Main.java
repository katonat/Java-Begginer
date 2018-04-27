package tratamento.excecoes;

public class Main {
	
	public static void main(String[] args) throws ErroChecado, DepositoInvalido, SaldoInsuficienteException, ZerarContaException {
			
		ContaCorrente conta = new ContaCorrente();
		//conta.sacar(100.0f); //erro: exception n�o tratada/lan�ada
		conta.depositar(10f);
		System.out.println(conta.getValor());
		
		conta.encerrarConta();
		
		
		
		ErroChecado erro = new ErroChecado("Mensagemmmm");
		//throw erro;	// ao lan�ar a exce��o, a execu��o � interrompida
		
		
		

	}

}
