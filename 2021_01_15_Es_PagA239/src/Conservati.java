
public class Conservati extends Alimentari{
	
	private String Marca;

	public Conservati(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie,
			String marca) {
		super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
		Marca = marca;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double calcolaImporto() {
		double tot = super.getPrezzoUnitario() * super.peso;

		return tot;
	}

	@Override
	public String toString() {
		return "Conservati [Marca=" + Marca + "]";
	}

}
