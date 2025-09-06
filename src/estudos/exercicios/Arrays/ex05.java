package estudos.exercicios.Arrays;

import java.util.Scanner;

import static estudos.exercicios.Arrays.ex01.imprimirVetor;
import static estudos.exercicios.Arrays.ex01.lerVetor;

public class ex05 {

    public static double[] calcular(double [] vetor) {
        double [] resultado = new double[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i] * i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[4];


        lerVetor(vetorA, scan);
        double[] vetorB = calcular(vetorA);
        imprimirVetor(vetorB);

    }
}
