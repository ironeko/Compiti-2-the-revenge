
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd1,cd2;
		PortaCd pcd1,pcd2;
		
		cd1= new CD("See You In The Future","Robert DeLong",4,760);
		cd2= new CD("American Beauty/American Psycho","Fall Out Boy",11,2341);
		pcd1 = new PortaCd(15);
		pcd2 = new PortaCd(20);
		
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
		
		pcd1.setCd(10, cd1);
		pcd2.setCd(11, cd1);
		pcd2.setCd(10, cd2);
		
		System.out.println(pcd2.cercaCdPerTitolo("See You In The Future"));
		System.out.println(pcd1.confrontaCollezione(pcd2));
		System.out.println(pcd2.toString());
		
		
	}

}
