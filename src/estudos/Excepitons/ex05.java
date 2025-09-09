package estudos.Excepitons;

public class ex05 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomidador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(
                        numeros[i] + "/" + denomidador[i] + " = " + (numeros[i] / denomidador[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao do Array invalida");
            }
            finally {
                System.out.println("Essa linha e impressa sempre apos o try ou o catch");
            }
        }
    }
}
