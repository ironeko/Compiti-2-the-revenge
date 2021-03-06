import java.util.ArrayList;

public class Carrello {
	final public int MAX_OGGETTI = 100;

	ArrayList<Merce> contenutoCarrello = new ArrayList<Merce>();

	public Carrello() {}

	public int getMAX_OGGETTI() {
		return MAX_OGGETTI;
	}

	public ArrayList<Merce> getContenutoCarrello() {
		return contenutoCarrello;
	}

	public void setContenutoCarrello(ArrayList<Merce> contenutoCarrello) {
		this.contenutoCarrello = contenutoCarrello;
	}

	public void inserisciProdotto (Merce cosa){
		this.contenutoCarrello.add(cosa);
	}

	public 	double calcolaCalorieTotali(){
		double tot=0;
		for ( int i = 0; i < this.contenutoCarrello.size(); i++){
			if (this.contenutoCarrello.get(i) instanceof Alimentari){
				tot += ((Alimentari) contenutoCarrello.get(i)).calcolaCalorie();
			}
		}
		return tot;
	}

	public 	double calcolaPrezzoTotale(){
		double tot=0;
		for ( int i = 0; i < this.contenutoCarrello.size(); i++){
			tot += this.contenutoCarrello.get(i).calcolaImporto();
		}
		return tot;
	}


	@Override
	public String toString() {
		return "Carrello{" +
				", contenutoCarrello=" + contenutoCarrello.toString()+
				'}';
	}
}
