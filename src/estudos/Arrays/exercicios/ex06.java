package estudos.Arrays.exercicios;

import java.util.Scanner;

import static estudos.Arrays.exercicios.ex01.imprimirVetor;
import static estudos.Arrays.exercicios.ex01.lerVetor;

public class ex06 {

    public static double[] calcularSoma(double[] vetor1, double[] vetor2) {
        double[] vetor3 = new double[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        return vetor3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[4];
        double[] vetorB = new double[vetorA.length];


        System.out.print("Digite os valores do vetor A");
        lerVetor(vetorA, scan);

        System.out.print("Digite os valores do vetor B:");

        lerVetor(vetorB, scan);
        double[] vetorC = calcularSoma(vetorA, vetorB);
        System.out.println("\nVetor A:");
        imprimirVetor(vetorA);

        System.out.println("\nVetor B:");
        imprimirVetor(vetorB);

        System.out.println("\nVetor C (soma de A e B):");
        imprimirVetor(vetorC);
    }
}
