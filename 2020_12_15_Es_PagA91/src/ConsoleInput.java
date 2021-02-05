import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*public ConsoleInput() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}*/
	static int readInt(String messaggio) {
		System.out.println(messaggio);
		return readInt();
	}
	
	static int readInt(){
		boolean ok = false;
		int number = 0;
		
		while(!ok) {
			try {
				number = Integer.parseInt(reader.readLine());
				ok = true;
			}
			catch(IOException e1){
				System.out.println("non � un numero");
			}
			catch (NumberFormatException e2) {
				System.out.println("non � un numero");
			}
		}
		return number;
	}
	
	static double readDouble(String messaggio) {
		System.out.println(messaggio);
		return readDouble();
	}
	
	static double readDouble(){
		boolean ok = false;
		double number = 0;
		
		while(!ok) {
			try {
				number = Double.parseDouble(reader.readLine());;
				ok = true;
			}
			catch(IOException e1){
				System.out.println("non � un numero");
			}
			catch (NumberFormatException e2) {
				System.out.println("non � un numero");
			}
		}
		return number;
	}
	
	static String readString(String messaggio) {
		System.out.println(messaggio);
		return readString();
	}
	
	static String readString(){
		boolean ok = false;
		String str = "";
		
		while(!ok) {
			try {
				str = reader.readLine();
				ok = true;
			}
			catch(IOException e1){
				System.out.println("non � una stringa");
			}
		}
		return str;
	}
}