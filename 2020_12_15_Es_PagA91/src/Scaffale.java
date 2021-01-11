
public class Scaffale {

	private Mensola ripiani[];
	private static final int NUM_RIPIANI = 15;
	
	public Scaffale(Mensola[] ripiani) {
		super();
		this.ripiani = ripiani;
	}
	
	public Scaffale(Scaffale scaf) {
		this.ripiani = scaf.ripiani;
	}

	public int setLibro(Libro lib, int ripiano, int posizione) {
		int ret=0;
		
		if (ripiano < this.NUM_RIPIANI && ripiano >= 0 && posizione >= 0 && posizione <= ripiani[ripiano].getNUMERO_MASSIMO_VOLUMI()) {
			ret = -1;
			if (ripiani[ripiano].getVolumi(posizione)==null) {
				ret =-2;
				ripiani[ripiano].setVolumi(lib, posizione);
			}
		}
		return ret;
	}
	
	public int rimuoviLibro(int ripiano, int posizione) {
		int a=0;
		if ((ripiano<0)||(ripiano>=NUM_RIPIANI))
			a= -1;
	    if (ripiani[ripiano].rimuoviVolume(posizione)<0)
	        a= -2;
	    return a;
	}
	
	public int getNumRipiani() {
		return NUM_RIPIANI;
	}
	
	public int getNumMaxLibri() {
	   int ripiano, n=0;
	   for (ripiano=0; ripiano<NUM_RIPIANI; ripiano++) {
		   n += ripiani[ripiano].getNUMERO_MASSIMO_VOLUMI();
	   }
	   return n;
	}
	
	 public int getNumLibri() {
		 int ripiano, n=0;
		 for (ripiano=0; ripiano<NUM_RIPIANI; ripiano++) {
			 n += ripiani[ripiano].getNumVolumi();
		 }
		 return n;
	 }
	 
	 public int getNumLibri(int ripiano) {
		 if ((ripiano<0)||(ripiano>=NUM_RIPIANI))
			 return -1;
		 return ripiani[ripiano].getNumVolumi();
	 }
	
}
