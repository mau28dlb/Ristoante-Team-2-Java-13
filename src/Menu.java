package src;
import src.portate.*;

import java.util.*;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public List<Antipasti> listaAntipasti = new ArrayList<>();

    public List<PrimiPiatti> listaPrimiPiatti = new ArrayList<>();
    public List<SecondiPiatti> listaSecondiPiatti = new ArrayList<>();
    public List<Dessert> listaDessert = new ArrayList<>();
    public List<Bevande> listaBevande = new ArrayList<>();

    private String chef;

    public Menu(String chef) {
        this.chef = chef;
    }

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

    public String aggiungiSpazi (String string) {
        int max = 0;
        for (Antipasti antipasti: listaAntipasti){
            if(antipasti.getDescrizione().length() > max){
                max = antipasti.getDescrizione().length();
            }
        }
        for (PrimiPiatti primiPiatti: listaPrimiPiatti){
            if(primiPiatti.getDescrizione().length() > max){
                max = primiPiatti.getDescrizione().length();
            }
        }
        for (SecondiPiatti secondiPiatti: listaSecondiPiatti){
            if(secondiPiatti.getDescrizione().length() > max){
                max =secondiPiatti.getDescrizione().length();
            }
        }
        for (Dessert dessert: listaDessert){
            if(dessert.getDescrizione().length() > max){
                max = dessert.getDescrizione().length();
            }
        }
        for (Bevande bevande: listaBevande){
            if(bevande.getDescrizione().length() > max){
                max = bevande.getDescrizione().length();
            }
        }
        while (string.length() < max+1){
            string += " ";
        }
        return string;
    }

    public void stampaTutto(){
        System.out.println("\n");
        System.out.println(ANSI_BLUE + "RISTORANTE TEAM 2 JAVA 13" + ANSI_RESET);
        System.out.println("\n");
        prezzoMedioMenu();
        System.out.println("\n");
        System.out.println(ANSI_RED+ "Chef: " + this.chef + ANSI_RESET);
        System.out.println("\n");

        System.out.println("\n" + ANSI_YELLOW+ "*** ANTIPASTI *** " + ANSI_RESET);
        for (Antipasti antipasti: listaAntipasti){
            String stringa = antipasti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + antipasti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_GREEN+ "*** PRIMI PIATTI ***" + ANSI_RESET);
        for (PrimiPiatti primiPiatti: listaPrimiPiatti){
            String stringa = primiPiatti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + primiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_PURPLE+ "*** SECONDI PIATTI *** " + ANSI_RESET);
        for (SecondiPiatti secondiPiatti: listaSecondiPiatti){
            String stringa = secondiPiatti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + secondiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" +ANSI_WHITE+ "*** DESSERTS ***" + ANSI_RESET);
        for (Dessert dessert: listaDessert){
            String stringa = dessert.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + dessert.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_CYAN+ "*** BEVANDE ***" + ANSI_RESET);
        for (Bevande bevande: listaBevande){
            String stringa = bevande.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + bevande.getPrezzo();
            System.out.println(newStringa);
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


    /*public void stampaTutto() {
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

     */


}
