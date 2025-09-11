package estudos.Excepitons;

public class ex09 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denomi = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new ex10(numeros[i], denomi[i]);
                }
                System.out.println(
                        numeros[i] + "/" + denomi[i] + " = " + (numeros[i] / denomi[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | ex10 e) {
                System.out.println("Ocorreu um erro!");
                e.printStackTrace();
            }
        }
    }
}
