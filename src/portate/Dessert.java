package src.portate;

public class Dessert extends Portata {

    private boolean glutenFree;
    private String temperatura;

    public Dessert(String descrizione, double prezzo, String temperatura, boolean glutenFree) {
        super(descrizione, prezzo);
        this.glutenFree = glutenFree;
        if(temperatura.equals("SEMI-FREDDO") || temperatura.equals("FREDDO") || temperatura.equals("CALDO")){
            this.temperatura = temperatura;
        }
    }


    @Override
    public void printPortata() {

    }
    }

