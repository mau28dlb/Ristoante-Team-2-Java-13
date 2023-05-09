package src;
import src.portate.*;

import java.util.*;

public class Menu {
     public List <Antipasti> listaAntipasti = new ArrayList<>();
     private List <Dessert> listaDessert = new ArrayList<>();


   public void addDessert (Dessert dessert){
       listaDessert.add(dessert);
   }

   public void addAntipasti (Antipasti antipasti){
       listaAntipasti.add(antipasti);
   }



    public void stampaTutto(){
        System.out.println("ANTIPASTI");
        for ( Antipasti antipasti: listaAntipasti){
            System.out.println(antipasti.getDescrizione() + " " + antipasti.getPrezzo());
        }
        System.out.println("");
        System.out.println("DESSERT ");
       for ( Dessert dessert : listaDessert){
           System.out.println(dessert.getDescrizione() + " " + dessert.getPrezzo());
       }

    }
}
