package src.portate;

public class Antipasti {
    private String descrizione;
    private double prezzo;

    public Antipasti (String descrizione, double prezzo) {
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

    public void printAntipasti(){
        System.out.println("- " + this.descrizione + "       € " + this.prezzo);
    }
}
