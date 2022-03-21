package figures;

import java.awt.*;

public class Pentagono extends Figure {

	private int x2, x3, x4, x5;
	private int y2, y3, y4, y5;
    

	public Pentagono (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
		super(x1, y1);
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;
		this.x4 = x4; this.y4 = y4;
		this.x5 = x5; this.y5 = y5;
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawPolygon(new int[] {this.x, this.x2, this.x3, this.x4, this.x5}, new int[] {this.y, this.y2, this.y3, this.y4, this.y5}, 5);
	}

}
