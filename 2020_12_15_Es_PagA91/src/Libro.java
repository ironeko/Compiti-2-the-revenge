
public class Libro {
	private String titolo;
	private String autore;
	private int numeroPagine;
	private static double costoPagina = 0.05;
	private final double COSTO_FISSO = 5.5;
	
	
	public Libro(String titilo, String autore, int numeroPagine) {
		super();
		this.titolo = titilo;
		this.autore = autore;
		this.numeroPagine = numeroPagine;
	}
	
	public Libro(Libro lib) {
		this.titolo = lib.getTitolo();
		this.autore = lib.getAutore();
		this.numeroPagine = lib.getNumeroPagine();
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titilo) {
		this.titolo = titilo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	public double prezzo() {
		return this.costoPagina*this.numeroPagine+this.COSTO_FISSO;
	}

	public double getCostoPagina() {
		return costoPagina;
	}

	public void setCostoPagina(double costoPagina) {
		this.costoPagina = costoPagina;
	}
	
	
}
