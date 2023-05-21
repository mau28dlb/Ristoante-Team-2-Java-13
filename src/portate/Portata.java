package src.portate;

import src.ColorEnum;

public abstract class Portata {

    protected String descrizione;
    protected Double prezzo;


    public Portata(String descrizione, Double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }


   public void printPortata() {
        while (descrizione.length() <= 70){
            descrizione += " ";
        }
        System.out.println(descrizione + prezzo + " €");
    }


}
