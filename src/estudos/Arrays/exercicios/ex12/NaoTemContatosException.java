package estudos.Arrays.exercicios.ex12;

public class NaoTemContatosException extends Exception {
    @Override
    public String getMessage() {
        return "\nNao existem contatos.";
    }
}
