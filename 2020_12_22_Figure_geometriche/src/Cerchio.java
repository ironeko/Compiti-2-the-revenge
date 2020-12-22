
public class Cerchio extends FiguraPiana{

	float raggio = 0;
	
	public Cerchio(float raggio) {
		super();
		this.raggio = raggio;
	}

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

	@Override
	public float perimetro() {
		
		return (float) (2*Math.PI*raggio);
	}

	@Override
	public float area() {
		
		return (float) (raggio*raggio*Math.PI);
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", perimetro()=" + perimetro() + ", area()=" + area() + "]";
	}
	

}
