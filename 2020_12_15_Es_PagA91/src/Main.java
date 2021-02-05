public class Main {
	
	private static void Start() {
		Scaffale scaffale= new Scaffale();
		
		Mensola m1 = new Mensola();
		Mensola m2 = new Mensola();
		
		Libro libro = new Libro("Hello", "World", 100);
		m1.setVolumi(libro);
		
		libro = new Libro("Giorno", "Notte", 50);
		m1.setVolumi(libro);
		
		libro = new Libro("Mela", "Freccia", 10);
		m2.setVolumi(libro);
		
		libro = new Libro("Albero", "Foglia", 200);
		m2.setVolumi(libro);
		
		scaffale.setRipiano(m1);
		scaffale.setRipiano(m2);
		
		Menu menu = new Menu(scaffale);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start();
	}
	
	
}
