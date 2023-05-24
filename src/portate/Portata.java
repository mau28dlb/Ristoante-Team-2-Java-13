package src.portate;

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
        while (descrizione.length() <= 70){
            descrizione += " ";
        }
        //TODO 70 - descr.lenght 10 = 60
       //Lorenzo sistare
        System.out.println(descrizione + prezzo + " €");
    }


}
