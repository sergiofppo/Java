package estudos.Excepitons;

public class ex04 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomidador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(
                        numeros[i] + "/" + denomidador[i] + " = " + (numeros[i] / denomidador[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por 0");
            }
        }
    }
}
