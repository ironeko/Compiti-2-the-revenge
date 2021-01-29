
public abstract class Aereo {

	protected String aereo;
	protected String destinazione;
	protected int partenza;
	protected int passeggeri;
	
	public Aereo(String aereo, String destinazione, int partenza, int passeggeri) {
		this.aereo = aereo;
		this.destinazione = destinazione;
		this.partenza = partenza;
		this.passeggeri = passeggeri;
	}

	public String getAereo() {
		return aereo;
	}

	public void setAereo(String aereo) {
		this.aereo = aereo;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public int getPartenza() {
		return partenza;
	}

	public void setPartenza(int partenza) {
		this.partenza = partenza;
	}

	public int getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(int passeggeri) {
		this.passeggeri = passeggeri;
	}
	
	abstract public double extra(int numero, double minimo, double pass);

	@Override
	public String toString() {
		return "Aereo [aereo=" + aereo + ", destinazione=" + destinazione + ", partenza=" + partenza + ", passeggeri="
				+ passeggeri + "]";
	}
	
}
