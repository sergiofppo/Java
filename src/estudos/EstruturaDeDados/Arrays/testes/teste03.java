package estudos.EstruturaDeDados.Arrays.testes;

import estudos.EstruturaDeDados.Arrays.Vetor;

public class teste03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca(2));
    }
}
