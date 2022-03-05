package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    private int x, y;
    private int w, h;
    private int rc, gc, bc; // c == contorno
    private int rf, gf, bf; // f == fundo

    public Ellipse (int x, int y, int w, int h, int rc, int gc, int bc, int rf, int gf, int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rc = rc; this.gc = gc; this.bc = bc;
        this.rf = rf; this.gf = gf; this.bf = bf;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g.setColor(new Color(rc, gc, bc));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}
