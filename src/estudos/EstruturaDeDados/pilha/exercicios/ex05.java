package estudos.EstruturaDeDados.pilha.exercicios;

import java.util.Stack;

public class ex05 {
    public static void main(String[] args) {

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");

    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " is palindromo? " + isPalindromo(palavra));
    }

    public static boolean isPalindromo (String palavra) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            stack.add(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!stack.isEmpty()) {
            palavraInversa += stack.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }
}
