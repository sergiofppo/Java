package estudos.exercicios.Arrays;

import java.util.Scanner;

import static estudos.exercicios.Arrays.ex01.imprimirVetor;
import static estudos.exercicios.Arrays.ex01.lerVetor;

public class ex03 {

    public static double[] calcularQuadrado(double[] vetor) {
        double[] resultado = new double[vetor.length];
        for (int i = 0; i < vetor.length ; i++) {
            resultado[i] = vetor[i] * vetor[i];
        }
        return resultado;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[15];

        lerVetor(vetorA, scan);
        double [] vetorB = calcularQuadrado(vetorA);
        imprimirVetor(vetorB);

    }
}
