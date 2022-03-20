package figures;

import java.awt.*;

public class Triangle extends Figure {
	private int x2, x3;
	private int y2, y3;
    

	public Triangle (int x1, int y1, int x2, int y2, int x3, int y3, int[] cc, int[] cf) {
		super(x1, y1, cc, cf);
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;

	}

	public void paint(Graphics g) {
		int rc = this.cc[0]; int gc = this.cc[1]; int bc = this.cc[2];
        int rf = this.cf[0]; int gf = this.cf[1]; int bf = this.cf[2];

		
		Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fillPolygon(new int[] {this.x, this.x2, this.x3}, new int[] {this.y, this.y2, this.y3}, 3);
        g.setColor(new Color(rc, gc, bc));
		g2d.drawPolygon(new int[] {this.x, this.x2, this.x3}, new int[] {this.y, this.y2, this.y3}, 3);
	}

}
