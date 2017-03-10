package restroom.premium;

public class TarefaLimpeza implements Runnable {

    private Restroom banheiro;

    public TarefaLimpeza(Restroom banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
            this.banheiro.limpa();
            try {
                Thread.sleep(15000);//limpando cada 15s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}