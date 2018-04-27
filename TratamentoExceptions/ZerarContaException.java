package tratamento.excecoes;

public class ZerarContaException extends Exception{
	
	public ZerarContaException() {
		super("Necessário zerar conta antes de encerrar");
	}
}
