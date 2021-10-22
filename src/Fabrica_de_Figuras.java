public class Fabrica_de_Figuras {
    public static final int CUADRADO = 0;
    public static final int CIRCULO = 1;
    public Figura getFigura(int tipo, int lado) {
        if (tipo == CUADRADO) {
            return (new Cuadrado(lado));
        } else {
            return (new Circulo(lado));
        }
    }
}
