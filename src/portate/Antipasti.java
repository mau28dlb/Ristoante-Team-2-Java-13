package src.portate;

public class Antipasti extends Portata{

    private  int porzione;
    private String cottura;

    public Antipasti(String descrizione, double prezzo, int porzione, String cottura ) {
        super(descrizione, prezzo);
        if(cottura.equals("COTTO") && cottura.equals("CRUDO")){
            this.cottura = cottura;
        }

    }


    @Override
    public void printPortata() {

    }
}

