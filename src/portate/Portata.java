package src.portate;

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

    public  String printPortataDescrizione(){
        String descrizione = getDescrizione();
        return descrizione;
    }

    public abstract String printPortataAggiunta(String descrizione);
}
