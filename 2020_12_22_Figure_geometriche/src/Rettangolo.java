
public class Rettangolo extends FiguraPiana {
	float base = 0;
	float altezza = 0;
	
	public Rettangolo(float base, float altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	@Override
	public float perimetro() {
		
		return (base+altezza)*2;
	}

	@Override
	public float area() {
		return base*altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro()=" + perimetro() + ", area()="
				+ area() + "]";
	}
	
}
