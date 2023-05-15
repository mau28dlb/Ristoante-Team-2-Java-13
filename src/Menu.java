package src;

import src.portate.*;

import java.util.*;

public class Menu {

    public List<Antipasti> listaAntipasti = new ArrayList<>();

    public List<PrimiPiatti> listaPrimiPiatti = new ArrayList<>();
    public List<SecondiPiatti> listaSecondiPiatti = new ArrayList<>();
    public List<Dessert> listaDessert = new ArrayList<>();
    public List<Bevande> listaBevande = new ArrayList<>();

    //public List<Portata> portataList = new ArrayList<>();

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


    public String calcolaSpazioTraPortateMenu(String value) {
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


    public void stampaMenuCompleto() {
        System.out.println("\n");
        System.out.println(Color.BLUE.get() + "RISTORANTE TEAM 2 JAVA 13" + Color.RESET.get());
        System.out.println("\n");
        System.out.println("Prezzo medio (un antipasto, un primo, una bevanda): " + prezzoMedioMenu() + " €");
        System.out.println("\n");
        System.out.println(Color.RED.get() + "Chef: " + this.chef + Color.RESET.get());
        System.out.println("\n");

        System.out.println("\n" + Color.YELLOW.get() + "*** ANTIPASTI *** " + Color.RESET.get());
        for (Antipasti antipasti : listaAntipasti) {
            String stringa = antipasti.getDescrizione();
            String newStringa = calcolaSpazioTraPortateMenu(stringa);
            newStringa += " € " + antipasti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + Color.YELLOW.get() + "*** PRIMI PIATTI ***" + Color.RESET.get());
        for (PrimiPiatti primiPiatti : listaPrimiPiatti) {
            String stringa = primiPiatti.getDescrizione();
            String newStringa = calcolaSpazioTraPortateMenu(stringa);
            newStringa += " € " + primiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + Color.PURPLE.get() + "*** SECONDI PIATTI *** " + Color.RESET.get());
        for (SecondiPiatti secondiPiatti : listaSecondiPiatti) {
            String stringa = secondiPiatti.getDescrizione();
            String newStringa = calcolaSpazioTraPortateMenu(stringa);
            newStringa += " € " + secondiPiatti.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + Color.WHITE.get() + "*** DESSERTS ***" + Color.RESET.get());
        for (Dessert dessert : listaDessert) {
            String stringa = dessert.getDescrizione();
            String newStringa = calcolaSpazioTraPortateMenu(stringa);
            newStringa += " € " + dessert.getPrezzo();
            System.out.println(newStringa);
        }

        System.out.println("\n" + Color.CYAN.get() + "*** BEVANDE ***" + Color.RESET.get());
        for (Bevande bevande : listaBevande) {
            String stringa = bevande.getDescrizione();
            String newStringa = calcolaSpazioTraPortateMenu(stringa);
            if (bevande.getGradazioneAlcolica() != null) {
                newStringa += " € " + bevande.getPrezzo() + " " + bevande.getGradazioneAlcolica();
            } else {
                newStringa += " € " + bevande.getPrezzo();
            }
            System.out.println(newStringa);
        }

    }


    public double prezzoMedioMenu() {
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
        return sommaPrezzi;
    }
}
