package Ironeko;

public class Main {
    public static Pila<Vagoni> treno = new Pila<Vagoni>();

    public static void main(String[] args) {

        Passeggeri a = new Passeggeri("gisadgiuaysg",100,"luchi",2003,"4H",50,50);
        Merci b = new Merci("iouhdafshuios",100,"cianiforni",6000,1000,1000,1000);
        treno.push(a);
        treno.push(b);

        System.out.println(pesoTotale());

    }

    private static double pesoTotale(){
        double tot=0;
        for(Vagoni i:treno){
            if (i instanceof Passeggeri){
                tot +=  ((Passeggeri) treno.letturaInTesta()).getPostiOccupati() * 65;
            }
            else if (i instanceof Merci){
                tot +=  ((Merci) treno.letturaInTesta()).getPeso();
            }
            tot+= treno.pop().getTara();
        }
        return tot;
    }
}
