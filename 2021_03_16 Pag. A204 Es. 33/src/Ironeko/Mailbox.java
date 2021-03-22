package Ironeko;

import java.io.Serializable;
import java.util.ArrayList;

public class Mailbox implements Serializable {
    private ArrayList<Mail> mails= new ArrayList<>();

    public Mailbox() {}

    public ArrayList<Mail> getMails() {
        return mails;
    }

    public void setMails(ArrayList<Mail> mails) {
        this.mails = mails;
    }

    public boolean addMail(Mail mail){
        return this.mails.add(mail);
    }

    public boolean remMail(int i){
        return this.mails.remove(i)!=null;
    }

    public Mail seaMail(String con){
        return mails.stream().filter(mail -> mail.getOggetto().contains(con)).findAny().orElse(null);
    }

    @Override
    public String toString() {
        String test= "Mils:\n";
        for (int i=0; i< mails.size(); i++){
            test += i + ") " + mails.get(i).toString() + "\n";
        }
        return test;
    }
}
