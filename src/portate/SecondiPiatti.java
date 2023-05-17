package src.portate;

public class SecondiPiatti extends Portata {

    private boolean isAlwaysAvailable;


    public SecondiPiatti(String descrizione, double prezzo) {
        super(descrizione, prezzo);
    }


    public SecondiPiatti(String descrizione, double prezzo, boolean isAlwaysAvailable) {
        super(descrizione, prezzo);
        this.isAlwaysAvailable = isAlwaysAvailable;
    }
    @Override
    public String stringaPortataCompleta(String descrizione) {
        if(!isAlwaysAvailable){
            String stringaTotale = descrizione +  "€ " + getPrezzo() + " (Solo a pranzo)" ;
            return stringaTotale;

        } else {
            String stringaTotale = descrizione + "€ " + getPrezzo();
            return stringaTotale;
        }
    }
}
