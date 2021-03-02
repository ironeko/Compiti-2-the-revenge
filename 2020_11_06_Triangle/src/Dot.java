public class Dot {
	//attributi
	private double x;
	private double y;
	
	//costruttore
	public Dot(double x,double y) {
		this.x=x;
		this.y=y;	
	}
	
	//get & set
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	//distance
	
	public double distance(Dot p2) {
		return Math.sqrt(Math.pow(p2.getX()-x,2 )+Math.pow(p2.getY()-y,2 ));
	}
	
	//toString
	public String toString() {
		String app;
		app="x: "+x+"\ty: "+y;
		return app; //return "x: "+x+"\ty: "+y;
	}
}
