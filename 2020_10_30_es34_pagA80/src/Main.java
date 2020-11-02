
public class Main {

	public static void main(String[] args) {
		Angolo a1,a2;
		
		a1= new Angolo(190,42,53);
		a2= new Angolo(0,260,891);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		a1.aggiungiSecondi(900);
		
		System.out.println(a1.toString());
		
		System.out.println(a1.angoloSecondi());
		System.out.println(a2.angoloSecondi());
		System.out.println(a1.differenzaSecondi(a2));
		System.out.println(a1.sommaAngolo(a2));	
	}

}
