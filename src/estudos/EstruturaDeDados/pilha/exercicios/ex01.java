package estudos.EstruturaDeDados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + ". Digite um numero: ");
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Numero par! Emplilhando..." + stack.push(numero));
            } else {
                if (stack.isEmpty()) {
                    System.out.println("A pilha esta vazia!");
                } else {
                    System.out.println("Numero Impar! Desimpilhando..." + stack.pop());
                }
            }
            System.out.println("Pilha agora: " + stack);
            System.out.println("--------------------");
        }
        System.out.println("\n   FIM DA LEITURA  ");
        if (stack.isEmpty()) {
            System.out.println("A pilha esta vazia!");
        } else {
            System.out.println("Desempilhando todos os itens que sobraram:");
            while (!stack.isEmpty()) {
                System.out.println("Saiu: " + stack.pop());
            }
        }
        scan.close();
    }
}
