
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd1,cd2;
		
		cd1= new CD("See You In The Future","Robert DeLong",4,760);
		cd2= new CD("American Beauty/American Psycho","Fall Out Boy",11,2341);
		
		System.out.println(cd1.getAutore());
		System.out.println(cd2.toString());
		if (cd1.compareDurata(cd2)>0) {
			System.out.println("il cd:"+cd1.getTitolo()+" è più lungo");
		}
		else if(cd1.compareDurata(cd2)==0) {
			System.out.println("hanno la stessa durata");
		}
		else {
			System.out.println("il cd:"+cd2.getTitolo()+" è più lungo");
		}
	}

}
