package tratamento.excecoes;

public class ZerarContaException extends Exception{
	
	public ZerarContaException() {
		super("Necess�rio zerar conta antes de encerrar");
	}
}
