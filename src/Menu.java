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
        //TODO dobbiamo ciclare sulla lista di portate
        String descrizioneConSpazi = aggiungiSpazioTraDescrizioneEPrezzo(portata.getDescrizione());
        System.out.println(descrizioneConSpazi);
    }


    public double prezzoMedioMenu() {
        double totPortata = 0;

        for (Portata portata : listaPortate) {
            totPortata = totPortata + portata.getPrezzo();
        }
        double prezzoMedioPortata = totPortata / listaPortate.size();
        return round(prezzoMedioPortata * 3);
    }


    //TODO usare istance of oppure inserire un enum che dice che tipo di piatto è
    public void stampaMenuCompleto() {
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + "RISTORANTE TEAM 2 JAVA 13" + ColorEnum.RESET.get());
        System.out.println("");
        System.out.println(ColorEnum.GREEN.get() + "Chef: " + this.chef + ColorEnum.RESET.get());
        System.out.println(ColorEnum.RED.get() + this.menuType + ColorEnum.RESET.get());
        System.out.println("");
        System.out.println("Prezzo medio (calcolato su 3 portate): " + prezzoMedioMenu() + " €");
        System.out.println("\n");


        System.out.println(ColorEnum.BLUE.get() + "*** Antipasti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Antipasti.class) {
                stampaPortata(portata);
            }
        }
       System.out.println(" ");
        System.out.println(ColorEnum.CYAN.get() + "*** Primi Piatti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata.getClass() == PrimiPiatti.class){
                stampaPortata(portata);
            }
        }


        System.out.println(" ");
        System.out.println(ColorEnum.BLACK.get() + "*** Secondi Piatti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            //TODO
            if (portata.getClass() == SecondiPiatti.class) {
                portata.printPortata();
            }
        }

        System.out.println(" ");
        System.out.println(ColorEnum.YELLOW.get() + "*** Dessert ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Dessert.class) {
                stampaPortata(portata);
            }
        }

        System.out.println(" ");
        System.out.println(ColorEnum.PURPLE.get() + "*** Bevande ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata.getClass() == Bevande.class) {
                stampaPortata(portata);
            }
        }

    }

}