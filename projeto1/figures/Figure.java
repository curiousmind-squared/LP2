package figures;

import java.awt.Graphics;

public abstract class Figure {
	int x;
	int y;
	

    public Figure(int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    public abstract void print();

	public abstract void paint(Graphics g);
}