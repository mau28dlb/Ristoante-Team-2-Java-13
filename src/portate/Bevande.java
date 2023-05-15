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
    public String printPortataAggiunta(String descrizione) {
            String stringaTotale = descrizione + "€ " + getPrezzo();
            return stringaTotale;
    }


    public String getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(String gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }
}


