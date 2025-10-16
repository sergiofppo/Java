package estudos.EstruturaDeDados.testes;

import estudos.EstruturaDeDados.Lista;

public class teste11 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("D"));
        System.out.println(lista.contem("C"));
        lista.remove("A");
        System.out.println(lista);
    }
}
