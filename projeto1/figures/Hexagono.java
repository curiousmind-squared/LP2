package figures;

import java.awt.*;

public class Hexagono extends Figure {

	private int x2, x3, x4, x5, x6;
	private int y2, y3, y4, y5, y6;
    

	public Hexagono (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6) {
		super(x1, y1);
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;
		this.x4 = x4; this.y4 = y4;
		this.x5 = x5; this.y5 = y5;
		this.x6 = x6; this.y6 = y6;

	}

	public void print () {
        System.out.format("Hexagono: (%d,%d),(%d,%d),(%d,%d),(%d, %d),(%d, %d).\n", 
							this.x, this.y, this.x2, this.y2, this.x3, this.y3, this.x4, this.y4, this.x5, this.y5, this.x6, this.y6);
    }

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawPolygon(new int[] {this.x, this.x2, this.x3, this.x4, this.x5, this.x6}, new int[] {this.y, this.y2, this.y3, this.y4, this.y5, this.y6}, 6);
	}

}
