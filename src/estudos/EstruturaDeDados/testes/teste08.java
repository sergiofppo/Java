package estudos.EstruturaDeDados.testes;

import estudos.EstruturaDeDados.vetorObjetos;

public class teste08 {
    public static void main(String[] args) {
        vetorObjetos vetor = new vetorObjetos(3);
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }
}
