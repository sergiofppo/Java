package estudos.EstruturaDeDados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class ex02 {
    public static void main(String[] args) {
        Stack<Integer> pilhaPar = new Stack<Integer>();
        Stack<Integer> pilhaImpar = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + ". Escreva um numero: ");
            int numero = scan.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("Numero adicionado a pilha par!");
                    pilhaPar.push(numero);
                } else {
                    System.out.println("Numero adicionado a pilha impar!");
                    pilhaImpar.push(numero);
                }
            } else {
                System.out.println("Desimpilhando um numero de cada pilha!");
                pilhaPar.pop();
                pilhaImpar.pop();
            }
        }
        System.out.println("Pilha agora: " + pilhaPar);
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Pilha agora: " + pilhaImpar);
        System.out.println("--------------------");

        while (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()) {
            System.out.println("Saiu: " + pilhaPar.pop());
            System.out.println("Saiu: " + pilhaImpar.pop());
        }
        scan.close();
    }
}
