
public class Angolo {
	private double g=0,p=0,s=0;
	
	//costruttore
	public Angolo(double g,double p,double s) {
		this.g=g;
		this.p=p;
		this.s=s;
		controlloGradi();
		controlloPrimi();
		controlloSecondi();
		
	}
	
	//get & set
	public double getG() {
		return g;
	}
	public double getP() {
		return p;
	}
	public double getS() {
		return s;
	}
	
	public void setG(double g) {
		this.g=g;
		controlloGradi();
		
	}
	public void setP(double p) {
		this.p=p;
		controlloPrimi();
		
	}
	public void setS(double s) {
		this.s=s;
		controlloSecondi();
		
	}
	
	
	//toString
	public String toString() {
		return "g: "+g+"\tp: "+p+"\ts: "+s;
	}
	
	//aggiungi gradi
	public void aggiungiGradi (double g){
		this.g+=g;
		controlloGradi();
		
	}
	
	//aggiungi primi
	public void aggiungiPrimi (double p){
		this.p+=p;
		controlloPrimi();
		
	}
	
	//aggiungi secondi
	public void aggiungiSecondi (double s){
		this.s+=s;
		controlloSecondi();
		
	}
	
	//angolo Secondi
	public double angoloSecondi (){
		return s+p*60+g*3600;	
	}
	
	//differenza Secondi
	public double differenzaSecondi (Angolo a2){
		return angoloSecondi()-a2.angoloSecondi();
	}
	
	//somma angolo
	public double sommaAngolo (Angolo a2){
		return angoloSecondi()+a2.angoloSecondi();
	}
	
	//-----------------------//
	
	//controlli
	private void controlloGradi (){
		if (g>360) {
			g-=360;
			controlloGradi();
		}
		if (g<0) {
			g=360-g;
			controlloGradi();
		}
		
	}
	
	private void controlloPrimi(){
		if (p>60) {
			p-=60;
			g++;
			controlloGradi();
			controlloPrimi();
		}
		if (p<0) {
			p=60-g;
			s--;
			controlloSecondi();
			controlloPrimi();
		}
		
	}
	
	private void controlloSecondi (){
		if (s>60) {
			s-=60;
			p++;
			controlloPrimi();
			controlloSecondi();
		}
		if (g<0) {
			g=60-g;
			controlloSecondi();
		}		
	}		
}
