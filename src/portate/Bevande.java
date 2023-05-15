package src.portate;

public class Bevande extends Portata {

    private String gradazioneAlcolica;
    public Bevande(String descrizione, double prezzo, String gradazioneAlcolica) {
        super(descrizione, prezzo);
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public Bevande(String descrizione, double prezzo) {
        super(descrizione, prezzo);
    }

    @Override
    public void printPortata() {

    }

    public String getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(String gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }
}


