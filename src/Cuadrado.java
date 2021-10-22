import java.awt.*;

public class Cuadrado extends Figura {
    public Cuadrado(int lado) {
        super(lado);
    }
    public double getArea() {
        return (double) (this.lado * this.lado);
    }

    public void dibujar(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.drawRect(x, y, lado, lado);
    }
}