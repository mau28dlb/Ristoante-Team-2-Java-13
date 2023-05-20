package src.portate;

public class Dessert extends Portata {

   protected boolean glutenFree;
   protected String temperatura;

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
    public void printPortata() {
        super.printPortata();
        if(glutenFree){
            System.out.println("(Gluten free)");
        }
        System.out.println("");
    }

}

