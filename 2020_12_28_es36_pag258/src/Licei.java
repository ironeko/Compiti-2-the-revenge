
public class Licei extends Scuola{

	public static int contributoBase = 125;
	public static int contributoLaboratorio = 1100;
	
	public Licei(String condiceAlfanumerico, String denominazione, String indirizzo, String città, int studenti,
			int classi, int sedi, int laboratori) {
		super(condiceAlfanumerico, denominazione, indirizzo, città, studenti, classi, sedi, laboratori);
	}

	public static int getContributoBase() {
		return contributoBase;
	}

	public static void setContributoBase(int contributoBase) {
		Licei.contributoBase = contributoBase;
	}

	public static int getContributoLaboratorio() {
		return contributoLaboratorio;
	}

	public static void setContributoLaboratorio(int contributoLaboratorio) {
		Licei.contributoLaboratorio = contributoLaboratorio;
	}

	public double contributi() {
		return contributoBase*studenti+contributoLaboratorio*laboratori;
	}
	
	@Override
	public String toString() {
		return "Licei [contributi()=" + contributi() + super.toString() + "]";
	}
}
