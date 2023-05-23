package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.portate.Portata;

public class Ristorante {
    String nomeRistorante = "RISTORANTE ROSSI";
    ArrayList <Menu> menuList = new ArrayList<>();
    Map<Integer, Portata> PiattoDelGiorno = new TreeMap<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public void addPiattoDelGiorno(Integer n, Portata portata) {
        PiattoDelGiorno.put(n, portata);
    }

    public void stampaPortataDelGiorno(Integer n, Integer n2){
        PiattoDelGiorno.get(n).printPortata();
        PiattoDelGiorno.get(n2).printPortata();
    }

    public void stampaRistorante (Integer n, Integer n2){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList){
            System.out.println("-------------------------------------------------------");
            menu.stampaMenuCompleto();
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("\n");
        System.out.println(ColorEnum.WHITE.get() + "Piatti del giorno" + ColorEnum.RESET.get());
        stampaPortataDelGiorno(n, n2);
    }

    public void stampaMenuSpecifico(MenuTypeEnum menuTypeEnum, Integer n, Integer n2){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList){
            if(menu.getMenuType() == menuTypeEnum){
                menu.stampaMenuCompleto();
            }
        }
        System.out.println("\n");
        System.out.println(ColorEnum.WHITE.get() + "Piatti del giorno" + ColorEnum.RESET.get());
        stampaPortataDelGiorno(n, n2);
    }
}
