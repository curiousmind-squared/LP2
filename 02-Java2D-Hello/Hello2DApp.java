import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(600, 600);
       	this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
	g2d.setFont(new Font("Purisa", Font.PLAIN, 13));
        int w = getWidth();
        int h = getHeight();
	String s = Integer.toString(getWidth());
	String f = String.join(s,"Esse quadro tem ", " Pixels de largura");
	String t = Integer.toString(getHeight());
	String i = String.join(t,"Esse quadro tem ", " Pixels de comprimento");

	g2d.fillRect(0, 0, w, h); // O background deve ser preto, então não preciso fazer nada aqui

	g2d.setPaint(Color.green); // As frases devem estar em  verde, à lá matrix.

        g2d.drawString("UM SIMPLES PROGRAMA QUE ATUALIZA O TAMANHO DO QUADRO", 20, 60);
	g2d.drawString(f, 20, 90);
	g2d.drawString(i, 20, 120);
	
    }
}
