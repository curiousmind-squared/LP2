public class RectApp {
	public static void main (String[] args) {
		int area;
		Rect r1 = new Rect(1, 1, 10, 10);
		r1.print();
		area = r1.area();
		r1.printArea();
		System.out.format("A area do Retangulo, acessada a partir da variavel retornada pelo método é: %d\n", area);
		r1.drag(10, 10);
	}
}

class Rect {
	int x, y;
	int w, h;
	int area;
	Rect (int xi, int yi, int wi, int hi) {
		this.x = xi;
		this.y = yi;
		this.w = wi;
		this.h = hi;	
	}
	
	void print() {
		System.out.format("Retangulo de tamanho (%d, %d) na posição (%d, %d)\n", this.w, this.h, this.x, this.y);
	}

	void printArea() {
		System.out.format("A area do Retangulo, acessada a partir de um atributo criado é: %d\n", this.area);
	}

	void printMovimento() {
		System.out.format("O retangulo se moveu! Agora está na posição (%d, %d)\n", this.x, this.y);
	}

	int area() {
		this.area = this.w*this.h; // Criamos um atributo para ser acessado por possíveis outros métodos da classe
		return (this.area); // Retornamos o valor para onde ele foi chamado, nesse caso a "main()"
	}

	void drag(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
		this.printMovimento(); // Chamando o método 'printMovimento' a partir do método 'drag' é melhor pois evita que na main
				       // seja chamada sem ter ocorrido movimento algum.
	}
}
