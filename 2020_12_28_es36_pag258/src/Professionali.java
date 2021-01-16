
public class Professionali extends Scuola{

	public static int contributoClasse = 2400;
	public static int contributoLaboratorio = 3000;
	
	public Professionali(String condiceAlfanumerico, String denominazione, String indirizzo, String città, int studenti,
			int classi, int sedi, int laboratori) {
		super(condiceAlfanumerico, denominazione, indirizzo, città, studenti, classi, sedi, laboratori);
	}

	public static int getContributoClasse() {
		return contributoClasse;
	}

	public static void setContributoClasse(int contributoClasse) {
		Professionali.contributoClasse = contributoClasse;
	}

	public static int getContributoLaboratorio() {
		return contributoLaboratorio;
	}

	public static void setContributoLaboratorio(int contributoLaboratorio) {
		Professionali.contributoLaboratorio = contributoLaboratorio;
	}
	
	public double contributi() {
		return contributoClasse*classi+contributoLaboratorio*laboratori;
	}
	
	@Override
	public String toString() {
		return "Professionali [contributi()=" + contributi() + super.toString() + "]";
	}
}
