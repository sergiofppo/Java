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
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

        // && (and) - || (or) - !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystarionCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystarionCincoCompravel " + isPlaystarionCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);



    }
}
