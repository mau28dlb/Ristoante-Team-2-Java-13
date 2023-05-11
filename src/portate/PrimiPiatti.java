package src.portate;

public class PrimiPiatti {


    private String descrizione;
    private double prezzo;

    public PrimiPiatti(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;;
    }

    public String getDescrizione(){
        return descrizione;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void printPrimiPiatti() {

        System.out.println("- " + this.descrizione + "       € " + this.prezzo);
    }
}