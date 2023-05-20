package src.portate;

public class Bevande extends Portata {

   protected String gradazioneAlcolica;

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
    public void printPortata() {
        super.printPortata();
        if(gradazioneAlcolica != null){
            System.out.println(gradazioneAlcolica);
        }
        System.out.println("");
    }

}



