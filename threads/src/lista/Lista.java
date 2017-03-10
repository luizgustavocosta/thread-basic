package lista;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    public void adicionaElementos(String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;
    }

    public int tamanho() {
        return this.indice;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }
}
