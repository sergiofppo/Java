package estudos.Arrays.exercicios.ex12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) {
                // consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                // add contato
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informacoes\n");
            String nome = lerInformacao(scan, "Entre com o nome do contato: ");
            String telefone = lerInformacao(scan, "Entre com o telefone do contato: ");
            String email = lerInformacao(scan, "Entre com o email do contato: ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);

        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da Agenda");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacao(scan, "Entre com o nome do contato: ");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato Existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacao(Scanner scan, String msg) {
        System.out.print(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1: CONSULTAR CONTATO");
            System.out.println("2: ADICIONAR CONTATO");
            System.out.println("3: SAIR");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada Invalida");
                }

            } catch (Exception e) {
                System.out.println("Entrada Invalida, Digite novamente.\n");
            }
        }

        return opcao;
    }
}

