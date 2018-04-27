package tratamento.excecoes;

public class ContaCorrente {
	private float valor = 100.0f;

	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void sacar(float valorSaque) throws SaldoInsuficienteException{
		if(this.valor > valorSaque)
			this.valor -= valorSaque;
		else
			throw new SaldoInsuficienteException();
	}
	
	public void depositar(float valorDeposito) throws DepositoInvalido {
		
		if(valorDeposito < 0)
			throw new DepositoInvalido();
		else
			this.valor += valorDeposito;
	}
	
	
	public void encerrarConta() throws SaldoInsuficienteException, ZerarContaException {
		
		if(this.valor < 0)
			throw new SaldoInsuficienteException();
		else if(this.valor > 0)
			throw new ZerarContaException();
	}
		
}
