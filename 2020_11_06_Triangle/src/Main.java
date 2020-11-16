
public class Main {

	public static void main(String[] args) {
		Triangle t1;
		Circle c1;
		
		Dot p1,p2,p3;
		
		p1= new Dot(0,1);
		p2= new Dot(20,2);
		p3= new Dot(15,3);
		
		t1= new Triangle(p1,p2,p3);
		c1= new Circle(p1,10);
		
		System.out.println(t1.area());
		System.out.println(t1.perimentro());
		System.out.println(t1.toString());
		
		System.out.println(c1.area());
		System.out.println(c1.perimetro());
		System.out.println(c1.toString());
	}

}
