package estudos.exercicios.Arrays;

import java.util.Scanner;

public class ex01 {

    public static void lerVetor(double[] vetor, Scanner scan) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva o valor " + i + " : ");
            vetor[i] = scan.nextInt();
        }
    }

    public static void imprimirVetor(double[] vetor) {
        for (double valor : vetor) {
            System.out.println(valor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i< vetorA.length; i++) {
            System.out.print("Digite o valor " + i + " : ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int j : vetorA) {
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int j : vetorB) {
            System.out.print(j + " ");
        }

        System.out.println(" ");
    }
}
