import java.util.ArrayList;

public class Mensola {
	

	private ArrayList<Libro> volumi = new ArrayList<Libro>();

	public Mensola() {
		
	}

	public Libro getVolumi(int pos) {
		return volumi.get(pos);
	}

	public void setVolumi(Libro volume) {
		this.volumi.add(volume);
	}
	
	public void setVolumi(Libro volume, int pos) {
		this.volumi.add(pos, volume);;
	}
	
	public boolean rimuoviVolume(int pos) {
		
		if(volumi.get(pos) != null) {
			volumi.remove(pos);
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getNumVolumi() {
		int cont = 0;
		
		for(int i=0; i<volumi.size(); i++) {
			if(volumi.get(i) != null) {
				cont++;
			}
		}
		return cont;
	}
	
	public String toString(){
		String str = "";
		for(int i=0; i<volumi.size(); i++) {
			if(volumi.get(i) != null) {
				str += "Autore: " + volumi.get(i).getAutore() + " Titolo " + volumi.get(i).getTitolo() + "\n";
			}
		}
		return str;
	}
}
