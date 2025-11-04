package estudos.EstruturaDeDados.pilha.testes;

import estudos.EstruturaDeDados.pilha.Pilha;

public class teste03 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topo());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
