
public abstract class FiguraSolida extends FiguraGeometrica{

	int nFacce = 0;

	public int getnFacce() {
		return nFacce;
	}

	public abstract float volume();

	@Override
	public String toString() {
		return "FiguraSolida [nFacce=" + nFacce + "]";
	}
	
	
}
