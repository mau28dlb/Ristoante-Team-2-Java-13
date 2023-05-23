package src.portate;

public class SecondiPiatti extends Portata {

   protected boolean isAlwaysAvailable;


    public SecondiPiatti(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }


    public SecondiPiatti(String descrizione, Double prezzo, boolean isAlwaysAvailable) {
        super(descrizione, prezzo);
        this.isAlwaysAvailable = isAlwaysAvailable;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(!isAlwaysAvailable){
            System.out.println("(Solo a pranzo)");
        }
        System.out.println("");
    }

}
