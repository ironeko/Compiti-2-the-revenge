
public class Tecnici extends Scuola{

	public static int contributoClasse = 3500;
	public static int contributoLaboratorio = 6000;
	
	public Tecnici(String condiceAlfanumerico, String denominazione, String indirizzo, String città, int studenti,
			int classi, int sedi, int laboratori) {
		super(condiceAlfanumerico, denominazione, indirizzo, città, studenti, classi, sedi, laboratori);
	}

	public static int getContributoClasse() {
		return contributoClasse;
	}

	public static void setContributoClasse(int contributoClasse) {
		Tecnici.contributoClasse = contributoClasse;
	}

	public static int getContributoLaboratorio() {
		return contributoLaboratorio;
	}

	public static void setContributoLaboratorio(int contributoLaboratorio) {
		Tecnici.contributoLaboratorio = contributoLaboratorio;
	}
	
	public double contributi() {
		return contributoClasse*classi+contributoLaboratorio*laboratori;
	}
	
	@Override
	public String toString() {
		return "Tecnici [contributi()=" + contributi() + super.toString() + "]";
	}
}
