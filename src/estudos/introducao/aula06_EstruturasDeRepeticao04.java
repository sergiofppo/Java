package estudos;

public class aula06_EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condicao = valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
        }
    }
}
