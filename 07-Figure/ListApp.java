import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

import figures.*;


class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    //ArrayList<Rect> rs = new ArrayList<Rect>();
    //ArrayList<Ellipse> es = new ArrayList<Ellipse>();
    //ArrayList<Triangle> ts = new ArrayList<Triangle>();
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();


    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    if (evt.getKeyChar() == 'r') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(26)+25; // Evita que se criem linhas ao inves de figuras
                        int h = rand.nextInt(26)+25;
                        // rs.add(new Rect(x,y, w,h, new int[] {rand.nextInt(100), rand.nextInt(101)+155, rand.nextInt(100)}, new int[]{rand.nextInt(101)+155, rand.nextInt(100), rand.nextInt(100)}));
                        // repaint();  // outer.repaint()
                        figs.add(new Rect(x,y, w,h, new int[] {rand.nextInt(100), rand.nextInt(101)+155, rand.nextInt(100)}, new int[]{rand.nextInt(101)+155, rand.nextInt(100), rand.nextInt(100)}));
                    }
                    else if (evt.getKeyChar() == 'e') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(26)+25;
                        int h = rand.nextInt(26)+25;
                        // es.add(new Ellipse(x,y, w,h, new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(101)+155}, new int[] {rand.nextInt(100), rand.nextInt(101)+155, rand.nextInt(100)}));
                        // repaint();  // outer.repaint()
                        figs.add(new Ellipse(x,y, w,h, new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(101)+155}, new int[] {rand.nextInt(100), rand.nextInt(101)+155, rand.nextInt(100)}));
                    }
                    else if (evt.getKeyChar() == 't') {
                        int x1 = rand.nextInt(250);
                        int y1 = rand.nextInt(250);
                        //int tempx = (x1/2)*3;
                        //int tempy = (y1/2)*3;
                        int x2 = x1+50;
                        int y2 = y1-50;
                        int x3 = x1+100; 
                        int y3 = y1;
                        // ts.add(new Triangle(x1,y1, x2, y2, x3, y3, new int[] {rand.nextInt(101)+155, rand.nextInt(100), rand.nextInt(100)}, new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(101)+155}));
                        // repaint();  // outer.repaint()
                        figs.add(new Triangle(x1,y1, x2, y2, x3, y3, new int[] {rand.nextInt(101)+155, rand.nextInt(100), rand.nextInt(100)}, new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(101)+155}));
                    }
                    repaint();
                }
            }
        );

        this.setTitle("Lista de Retangulos,Elipses e Triangulos");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        // for (Rect r: this.rs) {
        //     r.paint(g);
        // }
        // for (Ellipse e: this.es) {
        //     e.paint(g);
        // }
        // for (Triangle t: this.ts) {
        //     t.paint(g);
        // }
        for (Figure fig: this.figs){
            fig.paint(g);
        }
    }
}
