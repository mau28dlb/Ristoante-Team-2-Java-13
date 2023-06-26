package src.portate;

import src.enums.ColorEnum;

public class PrimiPiatti extends Portata {

    protected Integer id;
    protected boolean isMinimoPerDuePersone;
    protected boolean isPastaFresca;
    protected boolean isPiattoDelGiorno;


    public PrimiPiatti(String descrizione, Double prezzo, boolean isMinimoPerDuePersone, boolean isPastaFresca, boolean isPiattoDelGiorno) {
        super(descrizione, prezzo);
        this.isMinimoPerDuePersone = isMinimoPerDuePersone;
        this.isPastaFresca = isPastaFresca;
        this.isPiattoDelGiorno = isPiattoDelGiorno;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (isMinimoPerDuePersone){
            System.out.print("(Minimo per due persone)");
        }
        if(isPastaFresca){
            System.out.println("(Pasta fresca)");
        }
        System.out.println("");
    }

    @Override
    public void printPortataColorata(ColorEnum color) {
        super.printPortataColorata(color);
        if (isMinimoPerDuePersone){
            System.out.print("(Minimo per due persone)");
        }
        if(isPastaFresca){
            System.out.println("(Pasta fresca)");
        }
        System.out.println("");
    }

    public boolean getIsMinimoPerDuePersone() {
        return this.isMinimoPerDuePersone;
    }

    public void setIsMinimoPerDuePersone(boolean isMinimoPerDuePersone) {
        this.isMinimoPerDuePersone = isMinimoPerDuePersone;
    }

    public boolean getIsPastaFresca() {
        return this.isPastaFresca;
    }

    public void setIsPastaFresca(boolean isPastaFresca) {
        this.isPastaFresca = isPastaFresca;
    }

    public boolean getIsPiattoDelGiorno() {
        return this.isPiattoDelGiorno;
    }

    public void setIsPiattoDelGiorno(boolean piattoDelGiorno) {
        this.isPiattoDelGiorno = piattoDelGiorno;
    }
}