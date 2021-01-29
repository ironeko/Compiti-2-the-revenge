
public abstract class Merce {

	private String codice;
	private double prezzoUnitario;
	
	public Merce(String codice, double prezzoUnitario) {
		super();
		this.codice = codice;
		this.prezzoUnitario = prezzoUnitario;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	abstract public double calcolaImporto();

	@Override
	public String toString() {
		return "Merce [codice=" + codice + ", prezzoUnitario=" + prezzoUnitario + "]";
	}
	
}
