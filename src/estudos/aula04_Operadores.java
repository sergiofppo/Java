package estudos;

public class aula04_Operadores {
    public static void main(String[] args) {
        //  + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 + numero01;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

    }
}
