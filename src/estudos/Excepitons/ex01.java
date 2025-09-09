package estudos.Excepitons;

public class ex01 {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1;

            System.out.println("Easse texto nao sera impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excecao ao acessar um indice do vetor que nao existe");
        }
        System.out.println("Apos a Exception");
    }
}