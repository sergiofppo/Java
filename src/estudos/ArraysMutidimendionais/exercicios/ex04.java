package estudos.ArraysMutidimendionais.exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int qntdPares = 0;
        int qntdImpares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Escreva o valor da posicao ["+ i+ ","+ j+"]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 ==0) {
                    qntdPares++;
                } else {
                    qntdImpares++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("\nQuantidade de numeros Pares: " + qntdPares);
        System.out.print("Quantidade de numeros Impares: " + qntdImpares);
    }
}
