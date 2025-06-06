package exercicios;
import java.util.Scanner;

public class crianca_esperanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("| Crianca Esperanca |");
        System.out.println("---------------------");
        System.out.println("   Faca sua doacao!  ");
        System.out.println("1- Doar R$10");
        System.out.println("2- Doar R$20");
        System.out.println("3- Doar R$30");
        System.out.println("4- Doar outro valor");
        System.out.println("5- Cancelar");

        System.out.print("Digite uma opcao: ");
        int opcaoMenu = scanner.nextInt();
        switch (opcaoMenu) {
            case 1:
                System.out.println("Voce doou R$10!");
                break;
            case 2:
                System.out.println("Voce doou R$20!");
                break;
            case 3:
                System.out.println("Voce doou R$30!");
                break;
            case 4:
                System.out.print("Digite o valor que voce quer doar: ");
                double outroValor = scanner.nextDouble();
                System.out.println("Voce doou R$" + outroValor);
                break;
            case 5:
                System.out.println("Doacao cancelada!");
                break;
        }
        if (opcaoMenu != 5) {
            System.out.println("Muito obrigado pela doacao!");
        }else {
            System.out.println("Doe assim que puder!");
        }
    }
}
