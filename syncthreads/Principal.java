package br.unipe.java.syncthreads;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(9000.0f);
		
		CanalAtendimento atm = new CanalAtendimento("ATM", cc);
		CanalAtendimento net = new CanalAtendimento("Internet", cc);
		CanalAtendimento pessoal = new CanalAtendimento("Pessoal", cc);
		
		Thread t1 = new Thread(atm);
		Thread t2 = new Thread(net);
		Thread t3 = new Thread(pessoal);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Saldo Final: " + cc.getSaldo());
		

	}
}
