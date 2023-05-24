package src;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.portate.Portata;

public class Ristorante {

    //TODO prenotazione: serve un numero capienza massima, poi serve fare una struttura che leghi due oggetti: tavolo e cliente
    //quindi creare le classi tavolo e cliente con i loro attributi(aiuto: i tavoli devono avere un enum o un valore per il numero
    //di posti, il controlla da fare è di evitare l'overbooking)
    //stampare la lista di prenotazione


    //TODO mancano i modificatori di accesso, non c'è il costruttore , perchè?
    String nomeRistorante = "RISTORANTE ROSSI";
    ArrayList <Menu> menuList = new ArrayList<>();
    Map<Integer, Portata> piattoDelGiorno = new TreeMap<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public void addPiattoDelGiorno(Portata portata) {
        piattoDelGiorno.put(portata.getId(), portata);
    }

    public void stampaPortataDelGiorno(Integer n, Integer n2){
        piattoDelGiorno.get(n).printPortata();
        piattoDelGiorno.get(n2).printPortata();
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
        System.out.println(ColorEnum.WHITE.get() + "*** Piatti del giorno ***" + ColorEnum.RESET.get());
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
        System.out.println(ColorEnum.WHITE.get() + "*** Piatti del giorno ***" + ColorEnum.RESET.get());
        stampaPortataDelGiorno(n, n2);
    }
}
