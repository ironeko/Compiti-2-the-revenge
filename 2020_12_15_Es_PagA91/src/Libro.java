public class Libro {
	private String titolo;
	private String autore;
	private int numeroPag;
	private double costoPagine = 0.05;
	private final double costoFisso = 5.5;
	
	public Libro(String titolo, String autore, int numeroPag) {
		this.titolo = titolo;
		this.autore = autore;
		this.numeroPag = numeroPag;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getNumeroPag() {
		return numeroPag;
	}

	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}

	public double getCostoPagine() {
		return costoPagine;
	}

	public void setCostoPagine(double costoPagine) {
		this.costoPagine = costoPagine;
	}

	public double getCostoFisso() {
		return costoFisso;
	}
	
	public String toString() {
		String str = "titolo: " + titolo + " autore: " + autore + " numero Pagine: " + numeroPag+ " costo Pagine: " + costoPagine + " costo Fisso: " + costoFisso ;
		return str;
	}
	
}
