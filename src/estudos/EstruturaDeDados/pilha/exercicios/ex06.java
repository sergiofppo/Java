package estudos.EstruturaDeDados.pilha.exercicios;

import estudos.EstruturaDeDados.pilha.Pilha;


public class ex06 {
    public static void main(String[] args) {
        imprimeResulatdo("A + B");
        imprimeResulatdo("A + B (C-D)");
        imprimeResulatdo("A + B (C-D}");
        imprimeResulatdo("{A + B (C-D)} * Z");
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void imprimeResulatdo(String expressao) {
        System.out.println(expressao + " esta balanceada? " + verificaSimbolosBalanceados(expressao));
    }

    public static boolean verificaSimbolosBalanceados(String expressao) {

        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);

            } else if (FECHA.indexOf(simbolo) > -1) {

                if (pilha.isEmpty()) {
                    return false;

                } else {

                    char topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            index++;
        }
        return pilha.isEmpty();
    }

}
