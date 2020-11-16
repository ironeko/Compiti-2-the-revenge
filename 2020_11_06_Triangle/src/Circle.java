
public class Circle {
	private Dot p;
	private double r;
	
	//costruttore
		public Circle(Dot p,double r) {
			this.p=p;
			this.r=r;
		}
		
	//get & set
		public Dot getP() {
			return p;
		}
		public double getR() {
			return r;
		}
		public void setR(double r) {
			this.r=r;
		}
		public void setP(Dot p) {
			this.p=p;
		}
		
	//perimetro
		public double perimetro() {
			return 2*Math.PI*r;
		}
	//area
		public double area() {
			return Math.PI*r*r;
		}
	//controllo triangolo
		public boolean controllo() {
			if (r>0) {
				return true;
			}
			else {return false;}
		}
		
	//toString
		public String toString() {
			return "p= " + p.toString() + "\nR= " + r;
		}
}
