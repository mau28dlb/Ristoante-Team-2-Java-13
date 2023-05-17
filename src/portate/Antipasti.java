package src.portate;

public class Antipasti extends Portata{

    private int porzione;
    private String cottura;

    public Antipasti(String descrizione, double prezzo, int porzione, String cottura ) {
        super(descrizione, prezzo);
        this.cottura = cottura;
        this.porzione = porzione;
    }

    public Antipasti(String descrizione, double prezzo, int porzione) {
        super(descrizione, prezzo);
        this.porzione = porzione;
    }

    public Antipasti(String descrizione, double prezzo) {
        super(descrizione, prezzo);
    }
    @Override
    public String stringaPortataCompleta(String descrizione) {
        if (porzione != 0) {
            String stringaTotale = descrizione + "€ " + getPrezzo() + " (Porzione per " + porzione + ")";
            return stringaTotale;
        } else {
            String stringaTotale = descrizione + "€ " + getPrezzo();
            return stringaTotale;
        }
    }


}

