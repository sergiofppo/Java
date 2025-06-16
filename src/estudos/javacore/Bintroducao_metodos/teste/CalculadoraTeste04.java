package estudos.javacore.Bintroducao_metodos.teste;

import estudos.javacore.Bintroducao_metodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CaculadoraTeste04");
        System.out.println("Num 1: " +num1);
        System.out.println("Num 2: " +num2);
    }
}
