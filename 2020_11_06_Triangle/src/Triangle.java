
public class Triangle {
	
	private Dot p1,p2,p3;
	
	//costruttore
		public Triangle(Dot p1,Dot p2,Dot p3) {
			this.p1=p1;
			this.p2=p2;
			this.p3=p3;
		}
	//get & set
		public Dot getP1() {
			return p1;
		}
		public Dot getP2() {
			return p2;
		}
		public Dot getP3() {
			return p3;
		}
	
		public void setP1(Dot p1) {
			this.p1=p1;	
		}
		public void setP2(Dot p2) {
			this.p2=p2;	
		}
		public void setP3(Dot p3) {
			this.p3=p3;	
		}
		
	//perimetro 
		public double perimentro() {
			
			return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
		}
		
	//area
		public double area() {
			
			return Math.sqrt(perimentro()/2*(perimentro()/2-p1.distance(p2))*(perimentro()/2-p2.distance(p3))*(perimentro()/2-p3.distance(p1)));
		}
		
	//controllo triangolo
		public boolean controllo() {
			if (area()>0) {
				return true;
			}
			else {return false;}
		}
	//toString
		public String toString() {
			return "p1= " + p1.toString() +"\np2= " + p2.toString() +"\np3= " + p3.toString();
			}
}