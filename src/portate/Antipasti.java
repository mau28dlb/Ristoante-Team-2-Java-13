package src.portate;

import src.enums.ColorEnum;

public class Antipasti extends Portata{

    protected Integer id;
   protected Integer porzione;
   protected String cottura;


    public Antipasti(String descrizione, Double prezzo, Integer porzione, String cottura ) {
        super(descrizione, prezzo);
        this.cottura = cottura;
        this.porzione = porzione;
    }

    public Antipasti(String descrizione, Double prezzo, Integer porzione) {
        super(descrizione, prezzo);
        this.porzione = porzione;
    }

    public Antipasti(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }

    public Integer getPorzione() {
        return porzione;
    }

    public void setPorzione(Integer porzione) {
        this.porzione = porzione;
    }

    public String getCottura() {
        return cottura;
    }

    public void setCottura(String cottura) {
        this.cottura = cottura;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (porzione != null) {
            System.out.println("(Portata per " + porzione + ")");
        }
        System.out.println("");
    }

    @Override
    public void printPortataColorata(ColorEnum color) {
        super.printPortataColorata(color);
        if (porzione != null) {
            System.out.println("(Portata per " + porzione + ")");
        }
        System.out.println("");
    }
}

