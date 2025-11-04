package estudos.EstruturaDeDados.pilha.testes;

import estudos.EstruturaDeDados.pilha.Pilha;

public class teste02 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 0; i < 10; i++) {
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
