
public class Media extends Scuola{

	public static int contributoBase = 125;
	public static int contributoSede = 9000;
	public static int contributoLaboratorio = 1100;
	
	public Media(String condiceAlfanumerico, String denominazione, String indirizzo, String città, int studenti,
			int classi, int sedi, int laboratori) {
		super(condiceAlfanumerico, denominazione, indirizzo, città, studenti, classi, sedi, laboratori);
	}

	public static int getContributoBase() {
		return contributoBase;
	}

	public static void setContributoBase(int contributoBase) {
		Media.contributoBase = contributoBase;
	}

	public static int getContributoSede() {
		return contributoSede;
	}

	public static void setContributoSede(int contributoSede) {
		Media.contributoSede = contributoSede;
	}

	public static int getContributoLaboratorio() {
		return contributoLaboratorio;
	}

	public static void setContributoLaboratorio(int contributoLaboratorio) {
		Media.contributoLaboratorio = contributoLaboratorio;
	}
	
	public double contributi() {
		return contributoSede*sedi+contributoBase*studenti+contributoLaboratorio*laboratori;
	}

	@Override
	public String toString() {
		return "Media [contributi()=" + contributi() + super.toString() + "]";
	}
	
	
}
