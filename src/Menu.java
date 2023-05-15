package src;

import src.portate.*;

import javax.sound.sampled.Port;
import java.util.*;

public class Menu {

    public List<Portata> listaPortate = new ArrayList<>();


    private String chef;

    public Menu(String chef) {
        this.chef = chef;
    }

    public void addPortata(Portata portata) {
        listaPortate.add(portata);
    }



    public String aggiungiSpazioTraDescrizioneEPrezzo(String value) {
        int max = 0;
        for (Portata portata : listaPortate) {
            if (portata.getDescrizione().length() > max) {
                max = portata.getDescrizione().length();
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
        System.out.println("Prezzo medio: " + prezzoMedioMenu() + " €");
        System.out.println("\n");
        System.out.println(Color.RED.get() + "Chef: " + this.chef + Color.RESET.get());
        System.out.println("\n");

        System.out.println(Color.BLUE.get()+ "*** Antipasti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == Antipasti.class){
                stampaPortata(portata);
            }
        }
       /* System.out.println(" ");
        System.out.println(Color.CYAN.get() + "*** Primi Piatti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == PrimiPiatti.class){
                stampaPortata(portata);
            }
        }

        */

        System.out.println(" ");
        System.out.println(Color.BLACK.get() + "*** Secondi Piatti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == SecondiPiatti.class){
                stampaPortata(portata);
            }
        }

        System.out.println(" ");
        System.out.println(Color.YELLOW.get() + "*** Dessert ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == Bevande.class){
                stampaPortata(portata);
            }
        }

        System.out.println(" ");
        System.out.println(Color.PURPLE.get() + "*** Bevande***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == Bevande.class){
                stampaPortata(portata);
            }
        }

    }

    public void stampaPortata(Portata portata){
                String descrizione = portata.printPortataDescrizione();
                String newDescrizione = aggiungiSpazioTraDescrizioneEPrezzo(descrizione);
                String stringaTotale = portata.printPortataAggiunta(newDescrizione);
                System.out.println(stringaTotale );
    }




    public double prezzoMedioMenu() {
        double totPortata = 0;

        for (Portata portata : listaPortate) {
            totPortata = totPortata + portata.getPrezzo();
        }
        double prezzoMedioPrimi = totPortata / listaPortate.size();
        return  prezzoMedioPrimi;
    }

    /*public void stampaMenuCompleto() {
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

     */
}
