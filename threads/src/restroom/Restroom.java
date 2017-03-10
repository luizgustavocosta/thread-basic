package restroom;

public class Restroom {

	public void fazNumero1(){
		String name = Thread.currentThread().getName();
		System.out.println(name +" batendo na porta");
		synchronized (Restroom.class) {
			System.out.println(name +" entra no banheiro");
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
	
	public void fazNumero2(){
		String name = Thread.currentThread().getName();
		System.out.println(name +" batendo na porta");
		synchronized (Restroom.class) {
			System.out.println(name +" entra no banheiro");
			System.out.println(name +" usa o banheiro");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name +" da descarga");
			System.out.println(name +" lava a mao");
			System.out.println(name +" sai do banheiro");			
		}
	}
}
