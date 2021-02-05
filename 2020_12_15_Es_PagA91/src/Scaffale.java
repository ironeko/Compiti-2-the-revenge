import java.util.ArrayList;

public class Scaffale {
	
	private ArrayList<Mensola> ripiani = new  ArrayList<Mensola>();
	
	
	public Scaffale() {
		
	}

	public Mensola getRipiano(int num) {
		return ripiani.get(num);
	}

	public void setRipiano(Mensola ripiano) {
		this.ripiani.add(ripiano);
	}

	public int getNumRipiani() {
		return ripiani.size();
	}
	
	public int getNumLibri(int nMensola) {
		return ripiani.get(nMensola).getNumVolumi();
	}
	
	public boolean rimuoviLibro(int nMensola, int nLibro) {
		return ripiani.get(nMensola).rimuoviVolume(nLibro);
	}
}
