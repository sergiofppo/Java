package estudos.ArraysMutidimendionais.exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] compromissos = new String[31][24];
        boolean sair = false;
        int opcao;

        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    int dia = 0;
                    int hora = 0;


                    boolean diaValido = false;
                    while (!diaValido) {
                        System.out.println("Entre com o dia do mês (1 - 31): ");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido! Digite novamente.");
                        }
                    }


                    boolean horaValida = false;
                    while (!horaValida) {
                        System.out.println("Entre com a hora do compromisso (0 - 23): ");
                        hora = scan.nextInt();
                        if (hora >= 0 && hora < 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida! Digite novamente.");
                        }
                    }


                    scan.nextLine();


                    System.out.println("Digite o compromisso: ");
                    compromissos[dia - 1][hora] = scan.nextLine();
                    break;

                case 2:
                    dia = 0;
                    hora = 0;

                    diaValido = false;
                    while (!diaValido) {
                        System.out.println("Entre com o dia do mês (1 - 31): ");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido! Digite novamente.");
                        }
                    }

                    horaValida = false;
                    while (!horaValida) {
                        System.out.println("Entre com a hora do compromisso (0 - 23): ");
                        hora = scan.nextInt();
                        if (hora >= 0 && hora < 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida! Digite novamente.");
                        }
                    }

                    System.out.println("O compromisso agendado é: ");
                    System.out.println(compromissos[dia - 1][hora]);
                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        }
    }
}


