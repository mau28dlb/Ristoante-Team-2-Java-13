package src;

import src.portate.*;


import java.util.*;

import static java.lang.Math.round;

public class Menu {

    private String chef;

    private String menuType;

    public List<Portata> listaPortate = new ArrayList<>();



    public Menu(String chef, String menuType) {
        this.chef = chef;
        this.menuType = menuType;
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


    public void stampaPortata(Portata portata) {
        String descrizione = portata.stringaPortataDescrizione();
        String newDescrizione = aggiungiSpazioTraDescrizioneEPrezzo(descrizione);
        String stringaTotale = portata.stringaPortataCompleta(newDescrizione);
        System.out.println(stringaTotale);
    }


    public double prezzoMedioMenu() {
        double totPortata = 0;

        for (Portata portata : listaPortate) {
            totPortata = totPortata + portata.getPrezzo();
        }
        double prezzoMedioPortata = totPortata / listaPortate.size();
        return round(prezzoMedioPortata * 3);
    }


    public void stampaMenuCompleto() {
        System.out.println("\n");
        System.out.println(Color.BLUE.get() + "RISTORANTE TEAM 2 JAVA 13" + Color.RESET.get());
        System.out.println("");
        System.out.println(Color.GREEN.get() + "Chef: " + this.chef + Color.RESET.get());
        System.out.println(Color.RED.get() + this.menuType + Color.RESET.get());
        System.out.println("");
        System.out.println("Prezzo medio (calcolato su 3 portate): " + prezzoMedioMenu() + " €");
        System.out.println("\n");


        System.out.println(Color.BLUE.get() + "*** Antipasti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Antipasti.class) {
                stampaPortata(portata);
            }
        }
       System.out.println(" ");
        System.out.println(Color.CYAN.get() + "*** Primi Piatti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == PrimiPiatti.class){
                stampaPortata(portata);
            }
        }


        System.out.println(" ");
        System.out.println(Color.BLACK.get() + "*** Secondi Piatti ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == SecondiPiatti.class) {
                stampaPortata(portata);
            }
        }

        System.out.println(" ");
        System.out.println(Color.YELLOW.get() + "*** Dessert ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Dessert.class) {
                stampaPortata(portata);
            }
        }

        System.out.println(" ");
        System.out.println(Color.PURPLE.get() + "*** Bevande ***" + Color.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Bevande.class) {
                stampaPortata(portata);
            }
        }

    }

}