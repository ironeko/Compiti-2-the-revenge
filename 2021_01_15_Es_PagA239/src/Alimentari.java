
public abstract class Alimentari extends Merce{

	private String descrizione;
	private double peso;
	private double calorieUnitarie;

	public Alimentari(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie) {
		super(codice, prezzoUnitario);
		this.descrizione = descrizione;
		this.peso = peso;
		this.calorieUnitarie = calorieUnitarie;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getcalorieUnitarie() {
		return calorieUnitarie;
	}

	public void setcalorieUnitarie(double calorieUnitarie) {
		this.calorieUnitarie = calorieUnitarie;
	}
	
	public double calcolaImporto(){
		return super.getPrezzoUnitario()*peso;
		
	}
	
	public double calcolaCalorie(){
		return calorieUnitarie*peso;
	}

	@Override
	public String toString() {
		return "Alimentari [descrizione=" + descrizione + ", peso=" + peso + ", calorieUnitarie=" + calorieUnitarie
				+ "]";
	}
	
}
