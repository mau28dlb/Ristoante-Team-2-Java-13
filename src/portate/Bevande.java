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

    public String getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(String gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }



    @Override
    public String stringaPortataCompleta(String descrizione) {
        if (gradazioneAlcolica != null) {
            String stringaTotale = descrizione + "€ " + getPrezzo() + " " + gradazioneAlcolica;
            return stringaTotale;

        } else {
            String stringaTotale = descrizione + "€ " + getPrezzo();
            return stringaTotale;
        }


    }
}



