package restroom;

public class TarefaNumero1 implements Runnable {

	private Restroom banheiro;
	
	public TarefaNumero1(Restroom banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		banheiro.fazNumero1();
	}
}
