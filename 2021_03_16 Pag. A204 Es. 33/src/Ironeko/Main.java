package Ironeko;

import java.sql.Timestamp;

public class Main{
    public static void main(String[] args) {
        Mailbox test= new Mailbox();
        Timestamp data=new Timestamp(2020,6,23,11,54,52,0);
        Mail testtest= new Mail("Luchi","lasciamoci",data,"non voglio più essere il tuo compagno di banco (perchè c'è il covid)");
        test.addMail(testtest);

        try {
            System.out.println(test.seaMail("moci"));
        }
        catch (Exception e){
            System.out.println("unc'è");
        }
    }
}
