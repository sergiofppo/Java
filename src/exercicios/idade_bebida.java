package exercicios;
import java.util.Scanner;

public class idade_bebida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos anos voce tem? ");
        int idadeUsuario = scanner.nextInt();
        if (idadeUsuario < 18) {
            System.out.println("Voce nao pode comprar bebidas!");
        } else {
            System.out.println("Voce pode comprar bebidas!");
        }
    }
}
