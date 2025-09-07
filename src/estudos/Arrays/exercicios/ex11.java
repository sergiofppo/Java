package estudos.Arrays.exercicios;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[3];
        double media = 0;
        double soma = 0;

        System.out.println("Valores do vetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Escreva o valor numero " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                soma += vetorA[i];
                media = soma / vetorA.length;
            }
        }
        System.out.println(media);
    }
}
