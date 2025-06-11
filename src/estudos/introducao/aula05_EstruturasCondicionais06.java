package estudos;

public class aula05_EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e Dado os valores de 1a7 imprima se e doa util ou final de semana
        // considerando 1 como domingo
        byte opcao = 7;
        switch (opcao) {
            case 1:
                System.out.println("Domingo, final de semana");
                break;
            case 2:
                System.out.println("Segunda, dia util");
                break;
            case 3:
                System.out.println("Terca, dia util");
                break;
            case 4:
                System.out.println("Quarta, dia util");
                break;
            case 5:
                System.out.println("Quinta, dia util");
                break;
            case 6:
                System.out.println("Sexta, dia util");
                break;
            case 7:
                System.out.println("Sabado, final de semana");
                break;
            default:
                System.out.println("Opcao Invalida!");
        }
    }
}
