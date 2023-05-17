package src.portate;

public class PrimiPiatti extends Portata {

    private boolean minimoPerDuePersone;
    private boolean pastaFresca;

    public PrimiPiatti(String descrizione, double prezzo, boolean minimoPerDuePersone, boolean pastaFresca) {
        super(descrizione, prezzo);
        this.minimoPerDuePersone = minimoPerDuePersone;
        this.pastaFresca = pastaFresca;
    }

    @Override
    public String stringaPortataCompleta(String descrizione) {
        String stringaTotale;
        if(minimoPerDuePersone){
            stringaTotale = descrizione +  "€ " + getPrezzo() + " (Minimo due persone)" ;

        } else {
            stringaTotale = descrizione + "€ " + getPrezzo();
        }
        if(pastaFresca){
            stringaTotale += " (Pasta fresca)";

        }

        return stringaTotale;

    }
}