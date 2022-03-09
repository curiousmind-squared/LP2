package figures;

import java.awt.*;

public class Triangle {
	private int x1, x2, x3;
	private int y1, y2, y3;
    private int[] cc; // c == contorno
    private int[] cf; // f == fundo



	public Triangle (int x1, int y1, int x2, int y2, int x3, int y3, int[] cc, int[] cf) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;
		this.cc = cc;
        this.cf = cf;

	}

	public void paint(Graphics g) {
		int rc = this.cc[0]; int gc = this.cc[1]; int bc = this.cc[2];
        int rf = this.cf[0]; int gf = this.cf[1]; int bf = this.cf[2];

		
		Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fillPolygon(new int[] {this.x1, this.x2, this.x3}, new int[] {this.y1, this.y2, this.y3}, 3);
        g.setColor(new Color(rc, gc, bc));
		g2d.drawPolygon(new int[] {this.x1, this.x2, this.x3}, new int[] {this.y1, this.y2, this.y3}, 3);
	}

}
