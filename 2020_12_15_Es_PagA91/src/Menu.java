public class Menu {
	Scaffale scaffale = new Scaffale();
	
	public Menu(Scaffale scaffale){
		this.scaffale = scaffale;
		Start();
	}
	
	private void Start() {
		int n = 0;
		
		do {
			n = ConsoleInput.readInt("---------SCAFFALE---------\n"
								+ " 1)Prendi Libro\n"
								+ " 2)Lista libri in una mensola\n"
								+ " 3)Vedi numero mensole\n"
								+ " 4)Aggiungi libro in una mensola\n"
								+ " 5)Aggiungi mensola\n"
								+ " 6)Modifica Libro\n"
								+ " 7)Sposta Libro\n"
								+ " 8)Elimina Libro\n"
								+ " 0)Exit\n"
								+ "-->");
			//classe creata per salvare 2 valori
			ResearchResult res = new ResearchResult();
			int nInput = 0;
			String str="";
			int check = 0;
			boolean contrl = false;
			
			switch(n) {
			
				case 1:	
					nInput = ConsoleInput.readInt("ricerca per:\n1)titolo/autore\n2)numero libro e mensola\n-->");
					
					if(nInput == 1) {
						str = ConsoleInput.readString("inserire autore o titolo: ");
						check = ricercaLibro(str, res);
					}
					else {
					
						int nLibro = ConsoleInput.readInt("inserire numero libro: ");
						check = ricercaLibro(nLibro, res);
					}
					
					if(check == -1) {
						System.out.println("Il libro che cerca non esiste");
					}
					break;
					
				case 2:
					int nMensola = ConsoleInput.readInt("inserire numero Mensola: ");
					System.out.println("Lista:\n" + scaffale.getRipiano(nMensola).toString());
					break;
					
				case 3:
					System.out.println("numero mensole: " + scaffale.getNumRipiani());
					break;
					
				case 4:
					nMensola = ConsoleInput.readInt("inserire numero Mensola: ");
					String autore = ConsoleInput.readString("inserire nome autore: ");
					String titolo = ConsoleInput.readString("inserire il titolo: ");
					int numPagine = ConsoleInput.readInt("inserire numero Pagine: ");
					
					Libro libro = new Libro(titolo, autore, numPagine);
					
					scaffale.getRipiano(nMensola).setVolumi(libro);
					break;
					
				case 5:
					Mensola mensola = new Mensola();
					scaffale.setRipiano(mensola);
					break;
					
				case 6:
					res = new ResearchResult();

					Boolean esc =  true;

					do {
						nInput = ConsoleInput.readInt("--Cerca il libro da modificare--\n"
													  + "1)Per Titolo/autore\n"
													  + "2)Per numero\n"
													  + "-->");
						if (nInput == 1 || nInput == 2){
							esc = false;
						}
					}while(esc == true);
					
					if(nInput == 1) {
						str = ConsoleInput.readString("inserire autore o titolo: ");
						check = ricercaLibro(str, res);
					}
					else {
						
						int nLibro = ConsoleInput.readInt("inserire numero libro: ");
						check = ricercaLibro(nLibro, res);
					}
					
					int choose = ConsoleInput.readInt("Cosa vuoi modificare del libro:\n"
												      + " 1)Autore\n"
												      + " 2)Titolo\n"
												      + " 3)Numero Pagine\n"
												      + " 4)Costo Pagine\n"
												      + "--> ");
					
					if(check != -1 ) {
						switch(choose) {
							case 1:
								str = ConsoleInput.readString("inserire nuovo autore");
								scaffale.getRipiano(res.getValue2()).getVolumi(res.getValue1()).setAutore(str);
								break;
								
							case 2:
								str = ConsoleInput.readString("inserire nuovo Titolo");
								scaffale.getRipiano(res.getValue2()).getVolumi(res.getValue1()).setTitolo(str);
								break;
								
							case 3:
								nInput = ConsoleInput.readInt("inserire nuovo numero pagine");
								scaffale.getRipiano(res.getValue2()).getVolumi(res.getValue1()).setNumeroPag(nInput);
								break;
								
							case 4:
								double costo = ConsoleInput.readDouble("inserire nuovo costo pagine");
								scaffale.getRipiano(res.getValue2()).getVolumi(res.getValue1()).setCostoPagine(costo);
								break;
								
							default:
								break;
						}
					}
					break;
					
				case 7:
					nInput = ConsoleInput.readInt("inserire nuova posizione del libro");
					nMensola = ConsoleInput.readInt("in quale mensola vuoi spostare un libro");
					int pos = ConsoleInput.readInt("scegli il libro da spostare:\n" + scaffale.getRipiano(nMensola).toString());
					contrl = spostaLibro(pos, nMensola);
					if(contrl == false)
						System.out.println("impossibile spostare libro");
					break;
					
				case 8:
					nInput = ConsoleInput.readInt("inserire numero del libro da eliminare");
					nMensola = ConsoleInput.readInt("in quale mensola �:");
					contrl = deleteLibro(nInput, nMensola);
					
					if(contrl == false)
						System.out.println("impossibile eliminare libro");
					break;
					
				default:
					break;
			}
		}while(n != 0);
	}
	
	private int ricercaLibro(String str, ResearchResult res) {
		int n;
		for(int i=0; i<scaffale.getNumRipiani(); i++) {
			
			for(int k=0; k<scaffale.getRipiano(i).getNumVolumi(); k++) {
				
				if( scaffale.getRipiano(i).getVolumi(k).getAutore().equals(str) || scaffale.getRipiano(i).getVolumi(k).getTitolo().equals(str) ) {
					n = ConsoleInput.readInt("libro trovato\n" + scaffale.getRipiano(i).getVolumi(k).toString() + "\n � questo quello che cercava?\n"
																													+ "1)Si\n"
																													+ "2)No\n-->");
					
					if(n == 1) {
						res.setValue1(k);
						res.setValue2(i);
						return k;
					}
				}
			}
		}
		return -1;
	}
	
	private int ricercaLibro(int numLib, ResearchResult res) {
		for(int i=0; i<scaffale.getNumRipiani(); i++) {
			if(scaffale.getRipiano(i).getVolumi(numLib) != null) {
				ConsoleInput.readInt("libro trovato\n" + scaffale.getRipiano(i).getVolumi(numLib).toString());
				res.setValue2(i);
				return numLib;
			}
		
		}
		return -1;
	}
	
	private boolean spostaLibro(int numLibro, int numMensola) {
		int newPos = ConsoleInput.readInt("inserire la nuova posizione del libro");
		if(scaffale.getRipiano(numMensola).getVolumi(newPos) == null) {
			scaffale.getRipiano(numMensola).setVolumi( scaffale.getRipiano(numMensola).getVolumi(numLibro), newPos);
			return true;
		}
		else {
			int n =  ConsoleInput.readInt("Posizione gi� occupata, proseguire comunque?\nil libro che occupa quella posizione sar� spostato alla prima\n"
										  + "1)Si\n"
										  + "2)No");
			if(n == 1 && newPos != 0) {
				Libro lib =scaffale.getRipiano(numMensola).getVolumi(newPos);
				scaffale.getRipiano(numMensola).setVolumi( scaffale.getRipiano(numMensola).getVolumi(numLibro), newPos);
				scaffale.getRipiano(numMensola).setVolumi(lib);
				return true;
			}
			
		}
		return false;
	}
	
	private boolean deleteLibro(int numLibro, int numMensola) {
		scaffale.getRipiano(numMensola).setVolumi(null, numLibro);
		return true;
	}
	
}