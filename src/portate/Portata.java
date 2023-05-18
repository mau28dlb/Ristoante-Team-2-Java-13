package src.portate;

import src.ColorEnum;

public abstract class Portata {

    private String descrizione;
    private double prezzo;


    public Portata(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public void printPortata() {
        //TODO si calcolaa la lungghezza della descrizione e del prezzo e poi si aggiunge un valore fisso che deve
        //portare sempre alla stessa lunghezza 60= 10+ 48 + 2
        //Il 60 va sostituito con il valore della lunghezza massima
       System.out.println("Stampare le info"+prezzo+ descrizione);
    }

    //TODO
    public void printPortata(ColorEnum colorEnum) {
       System.out.println("Stampare le info"+prezzo+ descrizione);
    }


}
