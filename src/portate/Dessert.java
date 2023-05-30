package src.portate;

import src.enums.MenuTypeEnum;
import src.enums.TemperatureDessertEnum;

public class Dessert extends Portata {

   protected boolean glutenFree;
   protected TemperatureDessertEnum temperatura;

    public Dessert(String descrizione, Double prezzo) {
        super(descrizione, prezzo);
    }

    public Dessert(String descrizione, Double prezzo, TemperatureDessertEnum temperatura, boolean glutenFree) {
        super(descrizione, prezzo);
        this.glutenFree = glutenFree;
        this.temperatura = temperatura;

    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public TemperatureDessertEnum getTemperatura() {
        return temperatura;
    }

    public void TemperatureDesertEnum(TemperatureDessertEnum temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(glutenFree){
            System.out.println("(Gluten free)" + (" (" + temperatura + ") "));
        }
        System.out.println("");
    }

}

