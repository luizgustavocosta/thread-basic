package lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Lista lista = new Lista();

		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElementos(lista, i)).start();
		}
		Thread.sleep(20000);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.println(lista.pegaElemento(i));
		}
	}
}