package estudos.Arrays.exercicios;

import java.util.Scanner;

import static estudos.Arrays.exercicios.ex01.imprimirVetor;
import static estudos.Arrays.exercicios.ex01.lerVetor;

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

        double[] vetorA = new double[4];

        lerVetor(vetorA, scan);
        double [] vetorB = calcularQuadrado(vetorA);
        imprimirVetor(vetorB);

    }
}
