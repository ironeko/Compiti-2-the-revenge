
public class Mensola {
	private Libro volumi[];
	private static final int NUMERO_MASSIMO_VOLUMI = 15;
	
	
	public Mensola(Libro[] volumi) {
		super();
		this.volumi = volumi;
	}
	
	public Mensola(Mensola men) {
		super();
		this.volumi = men.volumi;
	}

	public Libro getVolumi(int a) {
		return volumi[a];
	}

	public int setVolumi(Libro volume, int pos) {
		int ret = -1;
		if (pos > 0 && pos < this.NUMERO_MASSIMO_VOLUMI) {
			ret=-2;
			if (this.volumi[pos]==null) {
				this.volumi[pos] = volume;
				ret=0;
			}
		}
		return ret;
	}
	
	public int rimuoviVolume(int pos) {
		int ret = -1;
		if (pos > 0 && pos < this.NUMERO_MASSIMO_VOLUMI) {
			ret=-2;
			if (this.volumi[pos]!=null) {
				this.volumi[pos] = null;
				ret=0;
			}
		}
		return ret;
	}

	public int getNUMERO_MASSIMO_VOLUMI() {
		return NUMERO_MASSIMO_VOLUMI;
	}
	
	public int getNumVolumi() {
		int a = 0;
		for (int i=0;i<this.NUMERO_MASSIMO_VOLUMI;i++) {
			if (volumi[i]!= null) {
				a++;
			}
		}
		return a;
	}
	
	
	
	
}
