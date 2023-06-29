package src.portate;

import src.enums.ColorEnum;

public class SecondiPiatti extends Portata {

    protected Integer id;
   protected boolean isAlwaysAvailable;
   protected boolean isPiattoDelGiorno;


    public SecondiPiatti(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }

    public SecondiPiatti(String descrizione, Double prezzo, boolean isAlwaysAvailable, boolean isPiattoDelGiorno) {
        super(descrizione, prezzo);
        this.isAlwaysAvailable = isAlwaysAvailable;
        this.isPiattoDelGiorno = isPiattoDelGiorno;
    }

    public boolean getIsPiattoDelGiorno() {
        return this.isPiattoDelGiorno;
    }

    public void setIsPiattoDelGiorno(boolean piattoDelGiorno) {
        this.isPiattoDelGiorno = piattoDelGiorno;
    }

    public boolean isAlwaysAvailable() {
        return isAlwaysAvailable;
    }

    public void setAlwaysAvailable(boolean alwaysAvailable) {
        isAlwaysAvailable = alwaysAvailable;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(!isAlwaysAvailable){
            System.out.println("(Solo a pranzo)");
        }
        System.out.println("");
    }

    @Override
    public void printPortataColorata(ColorEnum color) {
        super.printPortataColorata(color);
        if(!isAlwaysAvailable){
            System.out.println("(Solo a pranzo)");
        }
        System.out.println("");
    }
}
