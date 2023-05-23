package src.portate;

public class PrimiPiatti extends Portata {

    protected boolean minimoPerDuePersone;
    protected boolean pastaFresca;

    public PrimiPiatti(String descrizione, Double prezzo, boolean minimoPerDuePersone, boolean pastaFresca) {
        super(descrizione, prezzo);
        this.minimoPerDuePersone = minimoPerDuePersone;
        this.pastaFresca = pastaFresca;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (minimoPerDuePersone){
            System.out.print("(Minimo per due persone)  ");
        }
        if(pastaFresca){
            System.out.println("(Pasta fresca)");
        }
        System.out.println("");
    }

}