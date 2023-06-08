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
        System.out.println(descrizione + prezzo + " €");
    }

    public void printPortataColorata(ColorEnum color) {
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
        System.out.println(color.getAnsiCode() + descrizione + prezzo + " €" + ColorEnum.RESET.getAnsiCode());
    }
}
