package estudos.Arrays.exercicios;

import java.util.Scanner;

import static estudos.Arrays.exercicios.ex01.imprimirVetor;
import static estudos.Arrays.exercicios.ex01.lerVetor;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[5];
        double soma = 0;

        System.out.println("Escreva os numeros do vetorA: ");
        lerVetor(vetorA, scan);

        for (int i = 0; i < vetorA.length; i++) {
             soma += vetorA[i];
        }
        imprimirVetor(vetorA);
        System.out.println(" ");
        System.out.println("Soma: " + soma);
    }
}
