public class Pilha<X> {
    private X[] elemento;
    private int ultimo = -1;
    private int tamanho;

    public Pilha(int tamanho) {
        this.ultimo = -1;
        elemento = (X[]) new Object[tamanho];
    }

    public void guardeUmItem(X i) throws Exception {
        if (this.isCheia())
            throw new Exception("Pilha cheia");

        this.ultimo++;
        this.elemento[this.ultimo] = i;
    }

    public X getUmItem() throws Exception {
        if (this.isVazia())
            throw new Exception("Pilha vazia");

        return this.elemento[this.ultimo];
    }

    public X removaUmItem() throws Exception {
        if (this.isVazia())
            throw new Exception("Pilha vazia");

        return this.elemento[this.ultimo--];
    }

    public boolean isVazia() {
        return this.ultimo == -1;
    }

    public boolean isCheia() {
        return this.ultimo == this.elemento.length - 1;
    }
}
