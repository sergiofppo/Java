package estudos.ArraysMutidimendionais.exercicios;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do Jogador 1. Escolha linha e coluna (1 a 3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do Jogador 2. Escolha linha e coluna (1 a 3).");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com uma linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada Invalida! Tente Novamente.");
                }
            }
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com uma coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada Invalida! Tente Novamente.");
                }
            }
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posicao ja foi usada! coloque outra.");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                if (jogoVelha[i][0] == sinal && jogoVelha[i][1] == sinal &&
                        jogoVelha[i][2] == sinal) {
                    ganhou = true;
                }
            }

            for (int j = 0; j < 3; j++) {
                if (jogoVelha[0][j] == sinal && jogoVelha[1][j] == sinal &&
                        jogoVelha[2][j] == sinal) {
                    ganhou = true;
                }
            }

            if (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) {
                ganhou = true;
            }
            if (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal) {
                ganhou = true;
            }
            if (ganhou) {
                System.out.println("Parabens! Jogador " + (sinal == 'X' ? "1" : "2") + " venceu!");
            }

        }

    }
}
