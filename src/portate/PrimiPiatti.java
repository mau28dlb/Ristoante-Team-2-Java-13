package src.portate;

public class PrimiPiatti extends Portata {

    protected boolean minimoPerDuePersone;
    protected boolean pastaFresca;
    protected boolean isPiattoDelGiorno;


    public PrimiPiatti(String descrizione, Double prezzo, boolean minimoPerDuePersone, boolean pastaFresca, boolean isPiattoDelGiorno) {
        super(descrizione, prezzo);
        this.minimoPerDuePersone = minimoPerDuePersone;
        this.pastaFresca = pastaFresca;
        this.isPiattoDelGiorno = isPiattoDelGiorno;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (minimoPerDuePersone){
            System.out.print("(Minimo per due persone)");
        }
        if(pastaFresca){
            System.out.println("(Pasta fresca)");
        }
        System.out.println("");
    }

    public boolean isMinimoPerDuePersone() {
        return minimoPerDuePersone;
    }

    public void setMinimoPerDuePersone(boolean minimoPerDuePersone) {
        this.minimoPerDuePersone = minimoPerDuePersone;
    }

    public boolean isPastaFresca() {
        return pastaFresca;
    }

    public void setPastaFresca(boolean pastaFresca) {
        this.pastaFresca = pastaFresca;
    }

    public boolean isPiattoDelGiorno() {
        return isPiattoDelGiorno;
    }

    public void setPiattoDelGiorno(boolean piattoDelGiorno) {
        isPiattoDelGiorno = piattoDelGiorno;
    }
}