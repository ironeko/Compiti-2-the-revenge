import java.util.ArrayList;

public class Menù {
	
	public static void start() {
		ArrayList<Aereo> voli = new ArrayList<Aereo>();
		int choose=0;
		int esc=0;
		
		
		//dati per test
		int minimoLinea = 1000; //costo minimo soggiorno aereo di linea
		int minimoCharter = 2000; //costo minimo soggiorno aereo Charter
		int passLinea = 10; //costo passeggero aereo di linea
		int passCharter = 20; //costo passeggero aereo Charter
		int minimoPassLinea = 100; //costo minimo passeggeri aereo di linea per pagare
		//facilmente implementabili con un input prima del men�
		
		System.out.println("Buongiorno e benvenuto all'areoporto inter-planetario di San Giusto");
		do {
			choose=ConsoleInput.readInt("1) Inserire un nuovo volo\r\n" + "2) Eliminare un volo\r\n" + 
					"3) Stampare tutti i voli in partenza per una certa destinazione\r\n" + 
					"4) Calcolare il totale fatturato per i voli di un dato anno\r\n"+
					"5) Exit ");
			switch(choose) {
				case 1:choose = ConsoleInput.readInt("Perfetto, di che tipo? \r\n"+
						"1)Linea\r\n"+
						"2)charter\r\n"+ 
						"3)esci\r\n");
					switch(choose) {
					case 1:
						voli.add(new Linea(ConsoleInput.readString("Inserire nome aereo:"), 
								ConsoleInput.readString("Inserire Destinazione aereo:"), 
								ConsoleInput.readInt("Inserire data di partenza nel formato AAAAMMGG:"), 
								ConsoleInput.readInt("Inserire numero passeggeri"),
								ConsoleInput.readString("Inserire Compagnia aereo:"), 
								ConsoleInput.readInt("Inserire numero biglietti venduti")));
						break;
					case 2:
						voli.add(new Charter(ConsoleInput.readString("Inserire nome aereo:"), 
								ConsoleInput.readString("Inserire Destinazione aereo:"), 
								ConsoleInput.readInt("Inserire data di partenza nel formato AAAAMMGG:"), 
								ConsoleInput.readInt("Inserire numero passeggeri"),
								ConsoleInput.readString("Inserire Nome Cliente:"), 
								ConsoleInput.readString("Inserire Nome Pilota")));
						break;
					case 3:
						break;
					default:System.out.println("ERRORE NUMERO INCOMPATIBILE");
					}
					break;
				case 2:
					if (voli.size()>0) {
						for (int i=0;i<voli.size();i++) {
							System.out.println(i+") "+voli.get(i).toString());
						}
						choose = ConsoleInput.readInt("Inserire numero da eliminare:");
						voli.remove(choose);
					}
					else {
						System.out.println("ERRORE NUMERO AEREI INCOMPATIBILE");
					}
					break;
				case 3:
					if (voli.size()>0) {
						String nome = ConsoleInput.readString("inserire destinazione:");
						
						for (int i=0;i<voli.size();i++) {
							if (nome.matches(voli.get(i).getDestinazione())) {
								System.out.println(voli.get(i).toString());
							}
						}
					}
					else {
						System.out.println("ERRORE NUMERO AEREI INCOMPATIBILE");
					}
					break;
				case 4:
					int anno = ConsoleInput.readInt("Inserire anno:");
					double tot=0;
					anno*=10000;
					for (int i=0;i<voli.size();i++) {
						if (voli.get(i).getPartenza()>=anno && voli.get(i).getPartenza()<=(anno+100000)) {
							if (voli.get(i) instanceof Linea) {
								tot+=voli.get(i).extra(minimoPassLinea, minimoLinea, passLinea);
							}
							else {
								tot+=voli.get(i).extra(minimoPassLinea, minimoCharter, passCharter);//minimoPassLinea viene ignorato
							}
						}
					}
					System.out.println(tot);
					break;
				case 5:esc=1;
					break;
				default:System.out.println("ERRORE NUMERO INCOMPATIBILE");
			}
		}while(esc==0);
	}
}

