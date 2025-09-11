package estudos.Excepitons;

public class ex10 extends Exception {
    private int num;
    private int denominador;

    public ex10(int num, int denominador) {
        this.num = num;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denominador + " nao e um inteiro!";
    }
}
