
public class Linea extends Aereo{

	private String compagnia;
	private int biglietti;
	
	public Linea(String aereo, String destinazione, int partenza, int passeggeri, String compagnia, int biglietti) {
		super(aereo, destinazione, partenza, passeggeri);
		this.compagnia = compagnia;
		this.biglietti = biglietti;
	}

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}

	public int getBiglietti() {
		return biglietti;
	}

	public void setBiglietti(int biglietti) {
		this.biglietti = biglietti;
	};
	
	public double extra(int numero, double minimo, double pass) {
		if (this.biglietti >= numero) {
			return this.biglietti*pass+minimo;
		}
		return minimo;
		
	}

	@Override
	public String toString() {
		return "Linea [compagnia=" + compagnia + ", biglietti=" + biglietti + ", aereo=" + aereo + ", destinazione="
				+ destinazione + ", partenza=" + partenza + ", passeggeri=" + passeggeri + "]";
	}

}
