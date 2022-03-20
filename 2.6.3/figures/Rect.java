package figures;

import java.awt.*;

public class Rect extends Figure {

    private int w, h;

    public Rect (int x, int y, int w, int h, int[] cc, int[] cf) {
        super(x, y, cc, cf);
        this.w = w;
        this.h = h;

    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
        
        for (int i = 0; i < 3; i++) {
         System.out.print(this.cc[i]);
        }
    }

    public void paint (Graphics g) {
        int rc = this.cc[0]; int gc = this.cc[1]; int bc = this.cc[2];
        int rf = this.cf[0]; int gf = this.cf[1]; int bf = this.cf[2];


        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fillRect(this.x, this.y, this.w, this.h);
        g.setColor(new Color(rc, gc, bc));
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
}
