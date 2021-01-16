
public class Elementari extends Scuola{

	public static int contributoBase = 125;
	public static int contributoSede = 9000;
	
	public Elementari(String condiceAlfanumerico, String denominazione, String indirizzo, String città, int studenti,
			int classi, int sedi, int laboratori) {
		super(condiceAlfanumerico, denominazione, indirizzo, città, studenti, classi, sedi, laboratori);
	}

	public static int getContributoBase() {
		return contributoBase;
	}

	public static void setContributoBase(int contributoBase) {
		Elementari.contributoBase = contributoBase;
	}

	public static int getContributoSede() {
		return contributoSede;
	}

	public static void setContributoSede(int contributoSede) {
		Elementari.contributoSede = contributoSede;
	}
	
	public double contributi() {
		return contributoSede*sedi+contributoBase*studenti;
	}

	@Override
	public String toString() {
		return "Elementari [contributi()=" + contributi() + super.toString() +"]";
	}

}
