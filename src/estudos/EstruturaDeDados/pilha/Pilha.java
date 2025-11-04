package estudos.EstruturaDeDados.pilha;

import estudos.EstruturaDeDados.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
       super.adiciona(elemento);
    }

    public T topo() {
        if (this.isEmpty()){
            return null;
        }
        return this.elementos[tamanho-1];
    }


}
