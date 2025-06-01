package estudos;

public class aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Eu ainda nao tenho condicoes, mas vou ter";
        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
