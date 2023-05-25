package src;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.portate.*;
import java.util.*;
import static java.lang.Math.round;
import src.Ristorante;


public class Menu {
    protected MenuTypeEnum menuType;
    //protected String chef;
    protected List<Portata> listaPortate = new ArrayList<>();


    public Menu(MenuTypeEnum menuType) {

        this.menuType = menuType;
    }

    public MenuTypeEnum getMenuType() {
        return menuType;
    }

    public List<Portata> getListaPortate() {
        return listaPortate;
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
        System.out.println(ColorEnum.RED.get() + menuType.getDescrizione() + ColorEnum.RESET.get());
        System.out.println("");
        System.out.println("Prezzo medio (calcolato su 3 portate): " + prezzoMedioMenu() + " €");


        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + "*** Antipasti ***" + ColorEnum.RESET.get());
        listaPortate.stream().filter(antipasto -> antipasto instanceof Antipasti).forEach(antipasto -> antipasto.printPortata());

        System.out.println("\n");
        System.out.println(ColorEnum.CYAN.get() + "*** Primi Piatti ***" + ColorEnum.RESET.get());
        listaPortate.stream().filter(primo -> primo instanceof PrimiPiatti).forEach(primo -> primo.printPortata());

        System.out.println("\n");
        System.out.println(ColorEnum.RED.get() + "*** Secondi Piatti ***" + ColorEnum.RESET.get());
        listaPortate.stream().filter(secondo -> secondo instanceof SecondiPiatti).forEach(secondo -> secondo.printPortata());

        System.out.println("\n");
        System.out.println(ColorEnum.YELLOW.get() + "*** Dessert ***" + ColorEnum.RESET.get());
        listaPortate.stream().filter(dessert -> dessert instanceof Dessert).forEach(dessert -> dessert.printPortata());

        System.out.println("\n");
        System.out.println(ColorEnum.PURPLE.get() + "*** Bevande ***" + ColorEnum.RESET.get());
        listaPortate.stream().filter(bevanda -> bevanda instanceof Bevande).forEach(bevanda -> bevanda.printPortata());

    }
}