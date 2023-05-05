package portate;

public class Bevande {

    private String descrizione;
    private double prezzo;

    public Bevande(String descrizione, double prezzo) {
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

    public void printBevande() {

        System.out.println("- " + descrizione + "       € " + prezzo);
    }
}
