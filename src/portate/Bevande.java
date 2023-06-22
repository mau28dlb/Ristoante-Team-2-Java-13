package src.portate;

import src.enums.ColorEnum;

public class Bevande extends Portata {

    protected Integer ID;
    protected String gradazioneAlcolica;


    public Bevande(String descrizione, Double prezzo, String gradazioneAlcolica) {
        super(descrizione, prezzo);
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public Bevande(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }

    public String getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(String gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(gradazioneAlcolica != null){
            System.out.println(gradazioneAlcolica);
        }
        System.out.println("");
    }

    @Override
    public void printPortataColorata(ColorEnum color) {
        super.printPortataColorata(color);
        if(gradazioneAlcolica != null){
            System.out.println(gradazioneAlcolica);
        }
        System.out.println("");
    }
}



