package ironeko;

/*
Centro sportivo
Un centro sportivi deve gestire, con un sistema informatico, i propri clienti suddivisi per tipo
(agonisti, amatori); per ogni cliente devono essere memorizzate le seguenti informazioni:
 nome;
 cognome;
 data di nascita;
 disciplina;
 numero della tessera;
 data di scadenza dell’abbonamento.
Per gli atleti agonisti è inoltre necessario memorizzare la disciplina (sala pesi, nuoto, arti marziali)
e la categoria di appartenenza in base all’età: junior fino a 19 anni non compiuti, senior da 19 a 40
anni, gentleman oltre 40 anni.
Per i clienti amatori deve essere memorizzata la disciplina (sala pesi, nuoto, arti marziali) e il grado
di esperienza (principiante, medio, esperto).
Implementare in linguaggio Java la gerarchia di classi che consenta di rappresentare
adeguatamente la situazione descritta.
Sapendo che tutti i clienti devono pagare una tassa fissa (modificabile nel tempo), che hanno la
possibilità di scegliere tra diverse tipologie di abbonamento (mensile 50,00€, trimestrale 120,00€,
annuale 300,00€) e che tutti i clienti usufruiscono di alcuni sconti sul costo dell’abbonamento:
 atleti: junior 50% di sconto, senior 30% di sconto, gentleman 20% di sconto;
 amatori: esperti 15% di sconto;
implementare una classe Java che consenta la gestione degli abbonamenti ed il calcolo della quota
associativa.
Nel codice del test si gestisca, attraverso un menù, la possibilità di registrare un nuovo
abbonamento, rinnovare l’abbonamento di un cliente, cancellare un abbonamento, stampare la
situazione, salvare su file di testo, caricare da file di testo.
*/


public class Main{
    //chiamo il menu
    public static void main(String[] args) {
           Menu.start();
    }
}


