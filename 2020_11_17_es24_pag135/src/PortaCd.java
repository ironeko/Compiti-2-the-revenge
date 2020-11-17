import java.util.Arrays;

public class PortaCd {

	public int n = 0;
	private CD cd[];

	public PortaCd(int n) {
		this.n=n;
		cd=new CD [n];
	}
	
	public CD getCd(int num) {
		return cd[num];
	}
	
	public Boolean setCd(int num, CD cd1) {
		Boolean ret = true;
		if (num <0 || num >= n) {
			ret = false;
		}
		else {
			cd[num]=cd1;
		}
		return ret;
	}
	
	public Boolean killCd(int num) {
		Boolean  res = true;
		if (cd[num]!=null) {
			cd[num]=null;
		}
		else {
			res = false;
		}
		return res;
	}
	
	public int getN() {
		return n;
	}
	
	public int cercaCdPerTitolo(String nome) {
		for (int i=0;i<n;i++) {
			if (cd[i].getTitolo() == nome) {
				return i;
			}
		}
		return -1;
	}
	
	public int confrontaCollezione(PortaCd cd1) {
		int count = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<cd1.getN();j++) {
				if (cd[i]==cd1.getCd(j)) {
					count++;
				}
			}
		}
		return count;
	}

	public String toString() {
		return "PortaCd [n=" + n + ", cd=" + Arrays.toString(cd) + "]";
	}
}
