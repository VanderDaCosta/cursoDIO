public class DvisaoPorZeroException extends Exception {
    private int denominador;

    public DvisaoPorZeroException(String message, int denominador) {
        super(message);
        this.denominador = denominador;
    }
}
