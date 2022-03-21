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

                        figs.add(new Rect(x,y, w,h));
                    }
                    else if (evt.getKeyChar() == 'e') {
                        int x = rand.nextInt(350);
                        int y = rand.nextInt(350);
                        int w = rand.nextInt(26)+25;
                        int h = rand.nextInt(26)+25;
                        
                        figs.add(new Ellipse(x,y, w,h));
                    }
                    else if (evt.getKeyChar() == 't') {
                        int x1 = rand.nextInt(350);
                        int y1 = rand.nextInt(350);
                        int x2 = x1+50;
                        int y2 = y1-50;
                        int x3 = x1+100; 
                        int y3 = y1;
                        
                        figs.add(new Triangle(x1,y1, x2, y2, x3, y3));
                    }
                    else if (evt.getKeyChar() == 'p') {
                        int x1 = rand.nextInt(350); int y1 = rand.nextInt(350);
                        int x2 = x1-20; int y2 = y1+20;
                        int x3 = x1-20; int y3 = y1+50;
                        int x4 = x1+20; int y4 = y1+50;
                        int x5 = x1+20; int y5 = y1+20;

                        figs.add(new Pentagono(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5));
                    }
                    else if (evt.getKeyChar() == 'h') {
                        int x1 = rand.nextInt(350); int y1 = rand.nextInt(350);
                        int x2 = x1-20; int y2 = y1+20;
                        int x3 = x1-20; int y3 = y1+50;
                        int x4 = x1; int y4 = y1+70;
                        int x5 = x1+20; int y5 = y1+50;
                        int x6 = x1+20; int y6 = y1+20;

                        figs.add(new Hexagono(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6));   
                    }                       
                    
                    repaint();
                }
            }
        );

        this.setTitle("Lista de Figuras");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs){
            fig.paint(g);
        }
    }
}
