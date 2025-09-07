package estudos.Arrays.exercicios;

import java.util.Scanner;

import static estudos.Arrays.exercicios.ex01.imprimirVetor;
import static estudos.Arrays.exercicios.ex01.lerVetor;
import static java.lang.Math.*;

public class ex04 {

    public static double[] calcularRaiz(double[] vetor) {
        double [] resultado = new double[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = sqrt(vetor[i]);
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[4];


        lerVetor(vetorA, scan);
        double[] vetorB = calcularRaiz(vetorA);
        imprimirVetor(vetorB);

    }
}
