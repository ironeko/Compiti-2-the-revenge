
public class Parallelepipedo extends FiguraSolida {

	float altezza=0;
	float l1 =0;
	float l2 =0;
	
	public Parallelepipedo(float altezza, float l1, float l2) {
		super();
		this.altezza = altezza;
		this.l1 = l1;
		this.l2 = l2;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getL1() {
		return l1;
	}

	public void setL1(float l1) {
		this.l1 = l1;
	}

	public float getL2() {
		return l2;
	}

	public void setL2(float l2) {
		this.l2 = l2;
	}

	@Override
	public float volume() {
		return l1*l2*altezza;
	}

	@Override
	public float area() {
		return 2*l1*l2+2*l1*altezza+2*l2*altezza;
	}

	@Override
	public String toString() {
		return "Parallelepipedo [altezza=" + altezza + ", l1=" + l1 + ", l2=" + l2 + ", volume()=" + volume()
				+ ", area()=" + area() + "]";
	}

	
}
