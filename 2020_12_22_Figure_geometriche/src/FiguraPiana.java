
public abstract class FiguraPiana extends FiguraGeometrica{

	protected int nLati = 0;

	public int getnLati() {
		return nLati;
	}

	public abstract float perimetro();

	@Override
	public String toString() {
		return "FiguraPiana [nLati=" + nLati + "]";
	}
	
	
}
