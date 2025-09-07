package estudos.ArraysMutidimendionais.exercicios;

public class ex01 {



    public static void main(String[] args) {

        double[][] notasAlunos = {{10, 9, 8, 9.5}, {9, 8, 7, 9}, {8, 9, 10, 7}};

        for (int i = 0; i < notasAlunos.length; i++) {
//            System.out.print(notasAlunos[i]+" ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j]+" ");
            }
            System.out.println(" ");
        }
        double soma;
        System.out.println("Calculando a media de cada aluno");
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;

            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Media do aluno " + i+ " e = "+ (soma/4));
        }

    }
}
