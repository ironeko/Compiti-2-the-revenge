public class MainDot {

	public static void main(String[] args) {
		Dot p1,p2,p3;
		
		p1= new Dot(1,1);
		p2= new Dot(62,62);
		p3= new Dot(21,32);
		
		System.out.println(p1.toString()+"\n"+p2.toString());
		System.out.println(p3.distance(p2));
		
	}
}
