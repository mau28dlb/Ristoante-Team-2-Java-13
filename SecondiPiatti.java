public class SecondiPiatti {
    private String piatto;
    private double prezzo;

    public SecondiPiatti(String piatto, double prezzo) {
        this.piatto = piatto;
        this.prezzo = prezzo;
    }

    public String getPiatto() {
        return piatto;
    }

    public void setPiatto(String piatto) {
        this.piatto = piatto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void printSecondo(){
        System.out.println("- " + piatto + "       € " + prezzo);
    }
}
