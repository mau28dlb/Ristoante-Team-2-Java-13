package src.portate;

public class Antipasti extends Portata{

   protected int porzione;
   protected String cottura;

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
    public void printPortata() {
        super.printPortata();
        System.out.println("(Portata per " + porzione + ")");
        System.out.println("");
    }
}

