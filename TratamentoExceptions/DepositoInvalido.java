package tratamento.excecoes;

public class DepositoInvalido extends Exception{
	public DepositoInvalido() {
		super("Valor invalido para deposito.");
	}
}
