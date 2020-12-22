
public class Main {

	public static void main(String[] args) {
		
		Cilindro p1;
		Parallelepipedo p2;
		Cerchio p3;
		Rettangolo p4;
		
		p1 = new Cilindro(10, 10);
		p2 = new Parallelepipedo(10,10,10);
		p3 = new Cerchio(10);
		p4 = new Rettangolo (10,10);
		
		FiguraGeometrica arr[] = new FiguraGeometrica [4];
		
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=p4;
		
		for (int i=0;i<4;i++) {
			System.out.println("Area " + arr[i].getClass().getSimpleName() + " = "+ arr[i].area());
			if (arr[i] instanceof FiguraPiana) {
				System.out.println("Perimetro = "+ (((FiguraPiana) arr[i]).perimetro()));
			}
			else if (arr[i] instanceof FiguraSolida){
				System.out.println("volume = "+ (((FiguraSolida) arr[i]).volume()));
			}
			System.out.println("\n");
		}

	}

}
