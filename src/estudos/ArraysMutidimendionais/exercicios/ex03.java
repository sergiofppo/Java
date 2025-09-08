package estudos.ArraysMutidimendionais.exercicios;

import java.util.Random;

public class ex03 {

    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        Random numerosAleatorios = new Random();

        // gera a matriz 10x10 com numeros aleatorios
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = numerosAleatorios.nextInt(10);
            }
        }
        // inicializa as variaveis com max e min valores de um int
        int maiorLinha = Integer.MIN_VALUE;
        int menorLinha = Integer.MAX_VALUE;
        int maiorColuna = Integer.MIN_VALUE;
        int menorColuna = Integer.MAX_VALUE;

        for (int j = 0; j < numeros[5].length; j++) {
            if (numeros[5][j] > maiorLinha) {
                maiorLinha = numeros[5][j];
            }
            if (numeros[5][j] < menorLinha) {
                   menorLinha = numeros[5][j];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i][7] > maiorColuna) {
                maiorColuna = numeros[i][7];
            }
            if (numeros[i][7] < menorColuna) {
                menorColuna = numeros[i][7];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMaior da Linha 5 = " + maiorLinha + ", Menor = " + menorLinha);
        System.out.println("Maior da Coluna 5 = " + maiorColuna + ", Menor = " + menorColuna);
    }
}

