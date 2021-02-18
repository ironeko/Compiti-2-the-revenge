package Ironeko;

/*
pag. A258 es. 38 con le seguenti ulteriori specifiche:
    -   prevedere un menu per l'utente che consenta di gestire il treno e contenga
        almeno le seguenti funzionalità: aggiungere un vagone, eliminare un vagone dato
        il codice, cercare tutti i vagoni di una certa azienda costruttrice, visualizzare
        le informazioni complete del treno, visualizzare il peso attuale del treno, salvare
        i dati e uscire dal programma (unico punto di menu per salvare ed uscire)

    -   salvare i dati del treno su un file di testo. Al momento del lancio del programma,
        prima di proporre il menu, vanno caricati i dati dal file di testo (se presente).
        Al momento dell'uscita, il programma salva lo stato del treno prima di chiudere,
        informando l'utente.
 */

public class Main {
    public static void main(String[] args) {
        Menu.start();
    }
}
