package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse extends Figure {
    
    private int w, h;
    
    public Ellipse (int x, int y, int w, int h, int[] cc, int[] cf) {
        super(x, y, cc, cf);
        this.w = w;
        this.h = h;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        int rc = this.cc[0]; int gc = this.cc[1]; int bc = this.cc[2];
        int rf = this.cf[0]; int gf = this.cf[1]; int bf = this.cf[2];



        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g.setColor(new Color(rc, gc, bc));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}
