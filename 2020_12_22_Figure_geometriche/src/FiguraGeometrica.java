
public abstract class FiguraGeometrica {

	protected int nVertici = 0;

	public FiguraGeometrica() {
		super();
	}

	public int getnVertici() {
		return nVertici;
	}

	public abstract float area();

	@Override
	public String toString() {
		return "FiguraGeometrica [nVertici=" + nVertici + "]";
	}	
	
}
