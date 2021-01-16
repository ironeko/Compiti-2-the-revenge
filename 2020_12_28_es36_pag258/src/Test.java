import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Elementari scuola1 = new Elementari("c7c9s6dfsdfs6","Primo Levi","Via Como ","Prato",300,12,1,1);
		Media scuola2 = new Media("f89zdf789d7","Ivana Marcocci","Via Ardengo Soffici","Prato",150,6,1,3);
		Tecnici scuola3 = new Tecnici("vb8cx9b709cbv","Tullio Buzzi","Viale della Republica ","Prato",2000,80,1,30);
		
		System.out.println(scuola1.toString() + "\n" + scuola2.toString() + "\n" + scuola3.toString() + "\n");

	}

}