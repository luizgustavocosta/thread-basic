package restroom.premium;

public class TarefaNumero2 implements Runnable {

	private Restroom banheiro;
	
	public TarefaNumero2(Restroom banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		banheiro.fazNumero2();
	}
}
