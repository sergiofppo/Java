package estudos.Arrays.exercicios.ex12;

public class AgendaCheiaException extends Exception {
    @Override
    public String getMessage() {
        return "\n Agenda ja esta cheia";
    }
}
