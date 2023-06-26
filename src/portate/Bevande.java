package src.portate;

import src.enums.ColorEnum;

public class Bevande extends Portata {

    protected Integer id;
    protected Double gradazioneAlcolica;


    public Bevande(String descrizione, Double prezzo, Double gradazioneAlcolica) {
        super(descrizione, prezzo);
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public Bevande(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }

    public Double getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(Double gradazioneAlcolica) {
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



