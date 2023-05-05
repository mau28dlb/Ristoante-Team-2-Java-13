package src.portate;

public class Dessert {
    private String descrizione;
    private double prezzo;

    public Dessert(String piatto, double prezzo) {
        this.descrizione = piatto;
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

    public void printDessert(){
        System.out.println("- " + descrizione + "        € " + prezzo);
    }
}
