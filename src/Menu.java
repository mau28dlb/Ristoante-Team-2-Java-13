package src;
import src.portate.*;

import java.util.*;

public class Menu {
    public List<Antipasti> listaAntipasti = new ArrayList<>();

    public List<PrimiPiatti> listaPrimiPiatti = new ArrayList<>();
    public List<SecondiPiatti> listaSecondiPiatti = new ArrayList<>();
    private List<Dessert> listaDessert = new ArrayList<>();
    private List<Bevande> listaBevande = new ArrayList<>();


    public void addDessert(Dessert dessert) {
        listaDessert.add(dessert);
    }

    public void addPrimi(PrimiPiatti primi) {
        listaPrimiPiatti.add(primi);
    }

    public void addSecondiPiatti(SecondiPiatti secondi) {
        listaSecondiPiatti.add(secondi);
    }

    public void addAntipasti(Antipasti antipasti) {
        listaAntipasti.add(antipasti);
    }

    public void addBevande(Bevande bevande) {
        listaBevande.add(bevande);
    }


    public void stampaTutto() {
        System.out.println("ANTIPASTI");
        System.out.println("\n");
        for (Antipasti antipasti : listaAntipasti) {
            System.out.println(antipasti.getDescrizione() + " " + antipasti.getPrezzo());
        }
        System.out.println("");
        System.out.println("PRIMI");
        System.out.println("\n");
        for (PrimiPiatti primi : listaPrimiPiatti) {
            System.out.println(primi.getDescrizione() + " " + primi.getPrezzo());
        }
        System.out.println("");
        System.out.println("SECONDI");
        System.out.println("\n");
        for (SecondiPiatti secondi : listaSecondiPiatti) {
            System.out.println(secondi.getDescrizione() + " " + secondi.getPrezzo());
        }
        System.out.println("");
        System.out.println("DESSERT ");
        System.out.println("\n");
        for (Dessert dessert : listaDessert) {
            System.out.println(dessert.getDescrizione() + " " + dessert.getPrezzo());
        }
        System.out.println("");
        System.out.println("BEVANDE ");
        System.out.println("\n");
        for (Bevande bevande : listaBevande) {
            System.out.println(bevande.getDescrizione() + " " + bevande.getPrezzo());

        }
    }
}
