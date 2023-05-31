package src.portate;

import src.enums.ColorEnum;

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

    //TODO come facciamo a stampare colori diversi ? metodo che prende un enumerato

   public void printPortata() {
       int maxDescriptionValue = 80;
       int stringlenghtleft;
       String spaziatura = " ";

       if (descrizione.length() <= maxDescriptionValue) {
           stringlenghtleft = maxDescriptionValue - descrizione.length();
           for (int i = 0; i < stringlenghtleft; i++) {
               spaziatura += " ";
           }
               descrizione += spaziatura;
       }
       //Lorenzo sistare
        System.out.println(descrizione + prezzo + " €");
    }


}
