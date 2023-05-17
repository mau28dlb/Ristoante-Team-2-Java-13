package src.portate;

import src.Color;

public class Dessert extends Portata {

    private boolean glutenFree;
    private String temperatura;

    public Dessert(String descrizione, double prezzo) {
        super(descrizione, prezzo);
    }

    public Dessert(String descrizione, double prezzo, String temperatura, boolean glutenFree) {
        super(descrizione, prezzo);
        this.glutenFree = glutenFree;
        if(temperatura.equals("SEMI-FREDDO") || temperatura.equals("FREDDO") || temperatura.equals("CALDO")){
            this.temperatura = temperatura;
        }
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String printPortataAggiunta(String descrizione) {
        if(isGlutenFree()){
            String stringaTotale = descrizione +  "€ " + getPrezzo() + " (Gluten free)";
            return stringaTotale;

        } else {
            String stringaTotale = descrizione + "€ " + getPrezzo();
            return stringaTotale;
        }
    }
}

