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
        int maxnumber = 0;
        for (Antipasti antipasti : listaAntipasti) {
            for (int i = 0; i < antipasti.getDescrizione().length(); i++) {
                if (maxnumber < i){
                    maxnumber = i;
                }
            }
        }
        for (PrimiPiatti primi : listaPrimiPiatti) {
            for (int i = 0; i < primi.getDescrizione().length(); i++) {
                if (maxnumber < i){
                    maxnumber = i;
                }
            }
        }
        for (SecondiPiatti secondiPiatti : listaSecondiPiatti) {
            for (int i = 0; i < secondiPiatti.getDescrizione().length(); i++) {
                if (maxnumber < i) {
                    maxnumber = i;
                }
            }
        }
        for (Dessert dessert : listaDessert) {
            for (int i = 0; i < dessert.getDescrizione().length(); i++) {
                if (maxnumber < i){
                    maxnumber = i;
                }
            }
        }
        for (Bevande bevande : listaBevande) {
            for (int i = 0; i < bevande.getDescrizione().length(); i++) {
                if (maxnumber < i) {
                    maxnumber = i;
                }
            }
        }

        System.out.println("ANTIPASTI");
        System.out.println("");
        for (Antipasti antipasti : listaAntipasti) {
            String newDescription = " ";
            int stringlenght;
            String spaziatura = " ";

            if (antipasti.getDescrizione().length() <= (maxnumber+1)){
                stringlenght = maxnumber - antipasti.getDescrizione().length();
                for (int j = 0; j < stringlenght+1; j++) {
                    spaziatura += " ";
                }
                newDescription = antipasti.getDescrizione() + spaziatura;
            }
            System.out.println(newDescription + antipasti.getPrezzo() + " €");
        }
        System.out.println("\n");
        System.out.println("PRIMI");
        System.out.println("");
        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            String newDescription = " ";
            int stringlenght;
            String spaziatura = " ";

            if (primiPiatti.getDescrizione().length() <= (maxnumber+1)){
                stringlenght = maxnumber - primiPiatti.getDescrizione().length();
                for (int j = 0; j < stringlenght+1; j++) {
                    spaziatura += " ";
                }
                newDescription = primiPiatti.getDescrizione() + spaziatura;
            }
            System.out.println(newDescription + primiPiatti.getPrezzo() + " €");
        }
        System.out.println("\n");
        System.out.println("SECONDI");
        System.out.println("");
        for (SecondiPiatti secondiPiatti : listaSecondiPiatti) {
            String newDescription = " ";
            int stringlenght;
            String spaziatura = " ";

            if (secondiPiatti.getDescrizione().length() <= (maxnumber+1)){
                stringlenght = maxnumber - secondiPiatti.getDescrizione().length();
                for (int j = 0; j < stringlenght+1; j++) {
                    spaziatura += " ";
                }
                newDescription = secondiPiatti.getDescrizione() + spaziatura;
            }
            System.out.println(newDescription + secondiPiatti.getPrezzo() + " €");
        }
        System.out.println("\n");
        System.out.println("DESSERT ");
        System.out.println("");
        for (Dessert dessert : listaDessert) {
            String newDescription = " ";
            int stringlenght;
            String spaziatura = " ";

            if (dessert.getDescrizione().length() <= (maxnumber+1)){
                stringlenght = maxnumber - dessert.getDescrizione().length();
                for (int j = 0; j < stringlenght+1; j++) {
                    spaziatura += " ";
                }
                newDescription = dessert.getDescrizione() + spaziatura;
            }
            System.out.println(newDescription + dessert.getPrezzo() + " €");
        }
        System.out.println("\n");
        System.out.println("BEVANDE ");
        System.out.println("");
        for (Bevande bevande : listaBevande) {
            String newDescription = " ";
            int stringlenght;
            String spaziatura = " ";
            if (bevande.getDescrizione().length() <= (maxnumber+1)){
                stringlenght = maxnumber - bevande.getDescrizione().length();
                for (int j = 0; j < stringlenght+1; j++) {
                    spaziatura += " ";
                }
                    newDescription = bevande.getDescrizione() + spaziatura;
            }
        System.out.println(newDescription + bevande.getPrezzo() + " €");
        }
    }
    public void prezzoMedioMenu() {
        double totBevande = 0;
        double totPrimi = 0;
        double totAntipasti = 0;

        for (Bevande bevande : listaBevande) {
            totBevande = totBevande + bevande.getPrezzo();}
        double prezzoMedioBevande = totBevande/listaBevande.size();

        for (Antipasti antipasti : listaAntipasti) {
            totAntipasti = totAntipasti + antipasti.getPrezzo();}
        double prezzoMedioAntipasti = totAntipasti/listaAntipasti.size();

        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            totPrimi = totPrimi + primiPiatti.getPrezzo();}
        double prezzoMedioPrimi = totPrimi/listaPrimiPiatti.size();

        double sommaPrezzi = prezzoMedioAntipasti + prezzoMedioBevande + prezzoMedioPrimi;
        System.out.println("Prezzo medio (un antipasto, un primo ed una bevanda):");
        System.out.println("€ "+sommaPrezzi);
    }

}
