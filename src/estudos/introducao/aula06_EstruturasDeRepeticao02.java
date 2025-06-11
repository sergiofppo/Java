package estudos;

public class aula06_EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 1000000
        for (int numero = 0 ; numero<=1000000 ; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
