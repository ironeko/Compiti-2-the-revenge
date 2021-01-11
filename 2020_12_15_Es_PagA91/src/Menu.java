
public class Menu {
	public static void menu() {
		
		Scaffale scaf[] = new Scaffale [presentazione()];
		int scelta = 0;
		
		
		System.out.println("perfetto fatto\n");
		scelta = ConsoleInput.readInt("Menu' Generale:\n1)non lo so\nscelta:");
		do {
			switch(scelta) {
			case 1:break;
			/*case 1:break;
			case 1:break;
			case 1:break;*/
			case 8:break;
			default: scelta = ConsoleInput.readInt("Menu' Generale:\n1)non lo so\nscelta:");
			}
		}while (scelta == 8);
		
	}
	
	public static int presentazione() {
		return ConsoleInput.readInt("Benvenuto nel menu', \nsarà creato automaticamente uno scaffale vuoto con cui potrai interagire,\nse vuoi dopo ne potrai creare quanti ne vuoi, anzi \ndimmi quanti scaffali vorresti avere: ");
	}
}
