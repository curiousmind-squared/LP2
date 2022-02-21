import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    Ellipse e1; Ellipse e2; Ellipse e3;

    RectEllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Ellipse");
        this.setSize(350, 350);
        this.e1 = new Ellipse(50,100, 100,30, 0, 255, 0, 255, 0, 0);
        this.e2 = new Ellipse(50,140, 100,30, 0, 0, 255, 0, 255, 0);
        this.e3 = new Ellipse(180,100, 100,30, 255, 0, 0, 0, 0, 255);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);

    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        g.drawRect(this.x,this.y, this.w,this.h);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    int rc, gc, bc; // c == contorno
    int rf, gf, bf; // f == fundo

    Ellipse (int x, int y, int w, int h, int rc, int gc, int bc, int rf, int gf, int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rc = rc; this.gc = gc; this.bc = bc;
        this.rf = rf; this.gf = gf; this.bf = bf;       	
    }

    void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
	g.setColor(new Color(rf, gf, bf));
	g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
	g.setColor(new Color(rc, gc, bc));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}
