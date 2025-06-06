package exercicios;
import java.util.Scanner;

public class taxa_compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da sua compra: ");
        double valorCompras = scanner.nextDouble();

        double valorTaxaCompras = (valorCompras*20)/100;

        System.out.printf("O valor da sua taxa sera de: R$%.2f%n", valorTaxaCompras);
    }
}
