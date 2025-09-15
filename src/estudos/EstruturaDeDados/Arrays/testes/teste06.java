package estudos.EstruturaDeDados.Arrays.testes;

import estudos.EstruturaDeDados.Arrays.Vetor;

public class teste06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor);
    }
}
