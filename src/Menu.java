package src;

import src.portate.*;

import java.util.*;

public class Menu {

    //TODO passare in un enum e inserire anche descrizione così sappiamo a colpo d'occhio cosa fa
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
    public List<Portata> portataList = new ArrayList<>();

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

    //TODO chiamiamilo calcolaSpazioTraPortateMenu
    public String aggiungiSpazi(String value) {
        int max = 0;
        for (Antipasti antipasti : listaAntipasti) {
            if (antipasti.getDescrizione().length() > max) {
                max = antipasti.getDescrizione().length();
            }
        }
        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            if (primiPiatti.getDescrizione().length() > max) {
                max = primiPiatti.getDescrizione().length();
            }
        }
        for (SecondiPiatti secondiPiatti : listaSecondiPiatti) {
            if (secondiPiatti.getDescrizione().length() > max) {
                max = secondiPiatti.getDescrizione().length();
            }
        }
        for (Dessert dessert : listaDessert) {
            if (dessert.getDescrizione().length() > max) {
                max = dessert.getDescrizione().length();
            }
        }
        for (Bevande bevande : listaBevande) {
            if (bevande.getDescrizione().length() > max) {
                max = bevande.getDescrizione().length();
            }
        }
        while (value.length() < max + 1) {
            value += " ";
        }
        return value;
    }

    //TODO stampaMenuCompleto
    public void stampaTutto() {
        System.out.println("\n");
        System.out.println(ANSI_BLUE + "RISTORANTE TEAM 2 JAVA 13" + ANSI_RESET);
        System.out.println("\n");
        prezzoMedioMenu();
        System.out.println("\n");
        System.out.println(ANSI_RED + "Chef: " + this.chef + ANSI_RESET);
        System.out.println("\n");

        System.out.println("\n" + ANSI_YELLOW + "*** ANTIPASTI *** " + ANSI_RESET);
        for (Antipasti antipasti : listaAntipasti) {
            String stringa = antipasti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + antipasti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_GREEN + "*** PRIMI PIATTI ***" + ANSI_RESET);
        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            String stringa = primiPiatti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + primiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_PURPLE + "*** SECONDI PIATTI *** " + ANSI_RESET);
        for (SecondiPiatti secondiPiatti : listaSecondiPiatti) {
            String stringa = secondiPiatti.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + secondiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_WHITE + "*** DESSERTS ***" + ANSI_RESET);
        for (Dessert dessert : listaDessert) {
            String stringa = dessert.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + dessert.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + ANSI_CYAN + "*** BEVANDE ***" + ANSI_RESET);
        for (Bevande bevande : listaBevande) {
            String stringa = bevande.getDescrizione();
            String newStringa = aggiungiSpazi(stringa);
            newStringa += " € " + bevande.getPrezzo();
            System.out.println(newStringa);
        }

    }

    //TODO far tornare il prezzo medio
    public void prezzoMedioMenu() {
        double totBevande = 0;
        double totPrimi = 0;
        double totAntipasti = 0;

        for (Bevande bevande : listaBevande) {
            totBevande = totBevande + bevande.getPrezzo();
        }
        double prezzoMedioBevande = totBevande / listaBevande.size();

        for (Antipasti antipasti : listaAntipasti) {
            totAntipasti = totAntipasti + antipasti.getPrezzo();
        }
        double prezzoMedioAntipasti = totAntipasti / listaAntipasti.size();

        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            totPrimi = totPrimi + primiPiatti.getPrezzo();
        }
        double prezzoMedioPrimi = totPrimi / listaPrimiPiatti.size();

        double sommaPrezzi = prezzoMedioAntipasti + prezzoMedioBevande + prezzoMedioPrimi;
        System.out.println("Prezzo medio (un antipasto, un primo ed una bevanda):");
        System.out.println("€ " + sommaPrezzi);
    }


}
