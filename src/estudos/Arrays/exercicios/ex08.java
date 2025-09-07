package estudos.Arrays.exercicios;

import java.util.Scanner;

import static estudos.Arrays.exercicios.ex01.lerVetor;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[3];
        int contador = 0;

        System.out.println("Escreva os numeros do vetorA: ");
        lerVetor(vetorA, scan);

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contador++;
                System.out.println("O numero: "+ vetorA[i]+ " e par!");
            } else {
                System.out.println("O numero: "+ vetorA[i]+ " nao e par!");
            }
        }
        System.out.println("Nesse Array, " + contador + " numeros sao pares!");
    }
}
