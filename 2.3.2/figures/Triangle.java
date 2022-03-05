package figures;

import java.awt.*;

public class Triangle {
	private int x1, x2, x3;
	private int y1, y2, y3;
	private int rc, gc, bc; // c == contorno
    private int rf, gf, bf; // f == fundo


	public Triangle (int x1, int y1, int x2, int y2, int x3, int y3, int rc, int gc, int bc, int rf, int gf, int bf) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
		this.x3 = x3; this.y3 = y3;
		this.rc = rc; this.gc = gc; this.bc = bc;
        this.rf = rf; this.gf = gf; this.bf = bf;
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(rf, gf, bf));
        g2d.fillPolygon(new int[] {this.x1, this.x2, this.x3}, new int[] {this.y1, this.y2, this.y3}, 3);
        g.setColor(new Color(rc, gc, bc));
		g2d.drawPolygon(new int[] {this.x1, this.x2, this.x3}, new int[] {this.y1, this.y2, this.y3}, 3);
	}

}
