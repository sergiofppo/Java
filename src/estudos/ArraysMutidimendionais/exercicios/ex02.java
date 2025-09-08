package estudos.ArraysMutidimendionais.exercicios;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {

        int [][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random(); // import de gerar numeros aleatorios
        int maior = Integer.MIN_VALUE; // inicializa a variavel com o menor valor possivel de um int
        int linha = 0;
        int coluna =  0;

        for (int i = 0; i < numerosAleatorios.length; i++) { // vai gerar pra cada linha e coluna um numero aleatorio
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                    if (numerosAleatorios[i][j]> maior) { // pega o maior numero da matriz e setta o a linha e coluna dele
                        maior = numerosAleatorios[i][j];
                        linha = i;
                        coluna = j;
                    }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print( numerosAleatorios[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("Maior Valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }
}
