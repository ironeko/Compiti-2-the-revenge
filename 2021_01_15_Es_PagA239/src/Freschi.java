
public class Freschi extends Alimentari{

	private static double costoSacchetto;
	private Boolean confezionato;
	
	public Freschi(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie,
			Boolean confezionato) {
		super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
		this.confezionato = confezionato;
	}

	public static double getCostoSacchetto() {
		return costoSacchetto;
	}

	public static void setCostoSacchetto(double costoSacchetto) {
		Freschi.costoSacchetto = costoSacchetto;
	}

	public Boolean getConfezionato() {
		return confezionato;
	}

	public void setConfezionato(Boolean confezionato) {
		this.confezionato = confezionato;
	}
	
	public double calcolaImporto(){
		double totale = super.getPrezzoUnitario()*peso;
		
		if (confezionato) {
			totale += costoSacchetto;
		}
		
		return totale;
	}

	@Override
	public String toString() {
		return "Freschi [confezionato=" + confezionato + "]";
	}
	
}
