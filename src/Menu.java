package src;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.portate.*;


import java.util.*;

import static java.lang.Math.round;

public class Menu {
    protected MenuTypeEnum menuType;
    protected String chef;

    protected List<Portata> listaPortate = new ArrayList<>();


    public Menu(String chef, MenuTypeEnum menuType) {
        this.chef = chef;
        this.menuType = menuType;
    }


    public void addPortata(Portata portata) {
        listaPortate.add(portata);
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
    //    System.out.println("\n");
    //    System.out.println(ColorEnum.BLUE.get() + "RISTORANTE TEAM 2 JAVA 13" + ColorEnum.RESET.get());
    //    System.out.println("");
        System.out.println(ColorEnum.GREEN.get() + "Chef: " + this.chef + ColorEnum.RESET.get());
        System.out.println(ColorEnum.RED.get() + menuType.getDescrizione() + ColorEnum.RESET.get());
        System.out.println("");
        System.out.println("Prezzo medio (calcolato su 3 portate): " + prezzoMedioMenu() + " €");
        System.out.println("\n");


        System.out.println(ColorEnum.BLUE.get() + "*** Antipasti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata instanceof Antipasti) {
                portata.printPortata();
            }
        }

       System.out.println("\n");
        System.out.println(ColorEnum.CYAN.get() + "*** Primi Piatti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if(portata instanceof PrimiPiatti){
                portata.printPortata();
            }
        }

        System.out.println("\n");
        System.out.println(ColorEnum.RED.get() + "*** Secondi Piatti ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata instanceof SecondiPiatti) {
                portata.printPortata();
            }
        }

        System.out.println("\n");
        System.out.println(ColorEnum.YELLOW.get() + "*** Dessert ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata instanceof Dessert) {
                portata.printPortata();
            }
        }

        System.out.println("\n");
        System.out.println(ColorEnum.PURPLE.get() + "*** Bevande ***" + ColorEnum.RESET.get());
        for (Portata portata : listaPortate) {
            if (portata instanceof Bevande) {
                portata.printPortata();
            }
        }
    }
}