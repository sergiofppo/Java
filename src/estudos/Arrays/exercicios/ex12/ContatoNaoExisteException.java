package estudos.Arrays.exercicios.ex12;

public class ContatoNaoExisteException extends Exception {
    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " nao existe na agenda! \n";
    }
}
