package restroom.premium;

public class Restroom {

	private boolean dirty = true;
	
	public void fazNumero1(){
		String name = Thread.currentThread().getName();
		System.out.println(name +" batendo na porta");
		synchronized (Restroom.class) {
			System.out.println(name +" entra no banheiro");
			
			while (dirty){
				esperaLaForCabra();
			}
			
			System.out.println(name +" usa o banheiro");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name +" da descarga");
			System.out.println(name +" lava a mao");
			System.out.println(name +" sai do banheiro");			
		}
	}
	
	public void limpa(){
		String nome = Thread.currentThread().getName();

	    System.out.println(nome + " batendo na porta");

	    synchronized (this) {

	        System.out.println(nome + " entrando no banheiro");

	        if (!this.dirty) {
	            System.out.println(nome + ", não está sujo, vou sair");
	            return;
	        }

	        System.out.println(nome + " limpando o banheiro");
	        this.dirty = false;

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        this.notifyAll();

	        System.out.println(nome + " saindo do banheiro");
	    }
	}
	
	public void fazNumero2(){
		String name = Thread.currentThread().getName();
		System.out.println(name +" batendo na porta");
		synchronized (Restroom.class) {
			System.out.println(name +" entra no banheiro");
			
			while (dirty){
				esperaLaForCabra();
			}
			
			System.out.println(name +" usa o banheiro");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Apos limpar o banheira, avisa geral q pode usar
			this.notifyAll();
			
			System.out.println(name +" saindo do banheiro");			
		}
	}
	
	private void esperaLaForCabra() {
		System.out.println("Banheiro sujo pacas");
		try {
			this.wait(); 
			// Sai do bloco e espera alguma acao
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
