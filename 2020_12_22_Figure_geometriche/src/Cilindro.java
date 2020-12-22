
public class Cilindro extends FiguraSolida{

	float altezza =0;
	float raggio =0;
	
	public Cilindro(float altezza, float raggio) {
		super();
		this.altezza = altezza;
		this.raggio = raggio;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getRaggio() {
		return raggio;
	}

	public void setRaggio(float raggio) {
		this.raggio = raggio;
	}

	@Override
	public float volume() {
		return (float) (raggio*raggio*Math.PI*altezza);
	}

	@Override
	public float area() {
		return (float) (raggio*raggio*Math.PI*2+2*Math.PI*raggio*altezza);
	}

	@Override
	public String toString() {
		return "Cilindro [altezza=" + altezza + ", raggio=" + raggio + ", volume()=" + volume() + ", area()=" + area()
				+ "]";
	}
	
	
}
