
public class Abbigliamento extends Merce{

	private static double scontoUomo;
	private static double scontoDonna;
	private char sesso;
	private String taglia;
	private String tipologia;
	
	
	public Abbigliamento(String codice, double prezzoUnitario, char sesso, String taglia, String tipologia) {
		super(codice, prezzoUnitario);
		this.sesso = sesso;
		this.taglia = taglia;
		this.tipologia = tipologia;
	}


	public static double getScontoUomo() {
		return scontoUomo;
	}


	public static void setScontoUomo(double scontoUomo) {
		Abbigliamento.scontoUomo = scontoUomo;
	}


	public static double getScontoDonna() {
		return scontoDonna;
	}


	public static void setScontoDonna(double scontoDonna) {
		Abbigliamento.scontoDonna = scontoDonna;
	}


	public char getSesso() {
		return sesso;
	}


	public void setSesso(char sesso) {
		this.sesso = sesso;
	}


	public String getTaglia() {
		return taglia;
	}


	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}


	public String getTipologia() {
		return tipologia;
	}


	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	
	public double calcolaImporto() {
		double var = 0;
		
		if (sesso == 'F') {
			var = super.getPrezzoUnitario() * scontoDonna/100;
		}
		
		if (sesso == 'M') {
			var = super.getPrezzoUnitario() * scontoUomo/100;
		}
		
		return var;
		
	}

	@Override
	public String toString() {
		return "Abbigliamento [sesso=" + sesso + ", taglia=" + taglia + ", tipologia=" + tipologia + "]";
	}
	
	
}
