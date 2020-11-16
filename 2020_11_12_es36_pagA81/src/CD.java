
public class CD {

	private String titolo;
	private String autore;
	private double numero_brani;
	private double durata;
	
	//costruttore
	public CD (String titolo, String autore, double numero_brani, double durata) {
		this.titolo=titolo;
		this.autore=autore;
		this.numero_brani=numero_brani;
		this.durata=durata;
	}
	//get & set
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(Sstring titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getNumero_brani() {
		return numero_brani;
	}

	public void setNumero_brani(double numero_brani) {
		this.numero_brani = numero_brani;
	}

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}
	
	//toString
	public String toString() {
		return "CD [titolo=" + titolo + ", autore=" + autore + ", numero brani=" + numero_brani + ", durata=" + durata + "s]";
	}
	
	//compare durata
	
	public double compareDurata(CD cd2) {
		return(durata-cd2.getDurata());
	}
}
