
public class Abbigliamento extends Merce{

	private static double scontoUomo = 10;
	private static double scontoDonna = 10;
	private String sesso;
	private String taglia;
	private String tipologia;
	
	
	public Abbigliamento(String codice, double prezzoUnitario, String sesso, String taglia, String tipologia) {
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


	public String getSesso() {
		return sesso;
	}


	public void setSesso(String sesso) {
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
		
		if (sesso == "F") {
			var = super.getPrezzoUnitario() * scontoDonna/100;
		}
		
		else if (sesso == "M") {
			var = super.getPrezzoUnitario() * scontoUomo/100;
		}
		
		return var;
		
	}

	@Override
	public String toString() {
		return "Abbigliamento{" +
				"sesso=" + sesso +
				", taglia='" + taglia + '\'' +
				", tipologia='" + tipologia + '\'' +
				"} " + super.toString();
	}
}
