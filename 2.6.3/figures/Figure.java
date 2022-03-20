package figures;

import java.awt.Graphics;

public abstract class Figure {
	int x;
	int y;
	
	int[] cc; // c == contorno
    int[] cf; // f == fundo

    public Figure(int x, int y, int[] cc, int[] cf) {
    	this.x = x;
    	this.y = y;
    	this.cc = cc;
    	this.cf = cf;
    }

	public abstract void paint(Graphics g);
}