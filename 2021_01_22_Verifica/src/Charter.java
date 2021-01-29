
public class Charter extends Aereo{
	
	private String cliente;
	private String  pilota;
	
	public Charter(String aereo, String destinazione, int partenza, int passeggeri, String cliente, String pilota) {
		super(aereo, destinazione, partenza, passeggeri);
		this.cliente = cliente;
		this.pilota = pilota;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPilota() {
		return pilota;
	}

	public void setPilota(String pilota) {
		this.pilota = pilota;
	}
	
	public double extra(int numero, double minimo, double pass) {
		return super.passeggeri*pass+minimo;
	}

	@Override
	public String toString() {
		return "Charter [cliente=" + cliente + ", pilota=" + pilota + ", aereo=" + aereo + ", destinazione="
				+ destinazione + ", partenza=" + partenza + ", passeggeri=" + passeggeri + "]";
	}
	

}
