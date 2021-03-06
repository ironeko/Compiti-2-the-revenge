package Ironeko;

public class Main {


    public static void main(String[] args) {

        Passeggeri a = new Passeggeri("gisadgiuaysg",100,"luchi",2003,"4H",50,50);
        Merci b = new Merci("iouhdafshuios",100,"cianiforni",6000,1000,1000,1000);
        Coda<Vagoni> treno = new Coda<Vagoni>(a);
        treno.enqueue(b);

        System.out.println(pesoTotale(treno));

    }

    private static double pesoTotale(Coda<Vagoni> treno){
        double tot=0;
        for(Vagoni i:treno){
            if (i instanceof Passeggeri){
                tot +=  ((Passeggeri) i).getPostiOccupati() * 65;
            }
            else if (i instanceof Merci){
                tot +=  ((Merci) i).getPeso();
            }
            tot+= treno.dequeue().getTara();
        }
        return tot;
    }
}
