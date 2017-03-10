package restroom.premium;

public class Principal {

	public static void main(String[] args) {
		Restroom restroom = new Restroom();
		Thread convidado1 = new Thread(new TarefaNumero1(restroom), "Joao");
		Thread convidado2 = new Thread(new TarefaNumero2(restroom), "Pedro");
		//Thread convidado3 = new Thread(new TarefaNumero2(restroom), "Jose");
		//Thread convidado4 = new Thread(new TarefaNumero1(restroom), "Maria");
		Thread tarefaLimpeza = new Thread(new TarefaLimpeza(restroom), "Limpeza");
		//Lembrando que o método setDaemon(true) não substitui o start()
		tarefaLimpeza.setDaemon(true);
		
		
		convidado1.start();
		convidado2.start();
		//convidado3.start();
		//convidado4.start();
		tarefaLimpeza.start();
	}
}
