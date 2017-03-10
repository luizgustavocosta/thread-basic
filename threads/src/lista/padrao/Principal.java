package lista.padrao;

import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		//List<String> lista = new ArrayList<>();
		//List<String> lista = Collections.synchronizedList(new ArrayList<>());
		List<String> lista = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElementos(lista, i)).start();
		}
		Thread.sleep(20000);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}