package src;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.enums.TavoloEnum;
import src.portate.Portata;

public class Ristorante {

    //TODO prenotazione: serve un numero capienza massima, poi serve fare una struttura che leghi due oggetti: tavolo e cliente
    //quindi creare le classi tavolo e cliente con i loro attributi(aiuto: i tavoli devono avere un enum o un valore per il numero
    //di posti, il controlla da fare è di evitare l'overbooking)
    //stampare la lista di prenotazione


    protected String nomeRistorante;
    protected String indirizzoRistorante;
    protected String chef;
    protected ArrayList<Menu> menuList = new ArrayList<>();
    protected Map<Integer, Portata> piattoDelGiorno = new TreeMap<>();
    protected List<Tavolo> listaTavoli = new ArrayList<>();
    protected Map<Cliente, Tavolo> listaPrenotazione = new HashMap<>();
    protected int totaleNumeroTavoli = 10;

    public Ristorante(String nomeRistorante, String indirizzoRistorante, String chef) {
        this.nomeRistorante = nomeRistorante;
        this.indirizzoRistorante = indirizzoRistorante;
        this.chef = chef;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

//    public void addPiattoDelGiorno(Portata portata) {
//        piattoDelGiorno.put(portata.getId(), portata);
//    }

    public void stampaPortataDelGiorno(Integer n, Integer n2) {
        piattoDelGiorno.get(n).printPortata();
        piattoDelGiorno.get(n2).printPortata();
    }

    public void stampaRistorante(Integer n, Integer n2) {
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList) {
            System.out.println("-------------------------------------------------------");
            menu.stampaMenuCompleto();
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("\n");
        System.out.println(ColorEnum.WHITE.get() + "*** Piatti del giorno ***" + ColorEnum.RESET.get());
        stampaPortataDelGiorno(n, n2);
    }

    public void stampaMenuSpecifico(MenuTypeEnum menuTypeEnum) {
        System.out.println("\n");
        System.out.println(ColorEnum.GREEN.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println(ColorEnum.GREEN.get() + indirizzoRistorante + ColorEnum.RESET.get());
        System.out.println("");
        System.out.println(ColorEnum.YELLOW.get() + "Chef: " + chef + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList) {
            if (menu.getMenuType() == menuTypeEnum) {
                menu.stampaMenuCompleto();
            }
        }
        System.out.println("\n");
//        System.out.println(ColorEnum.WHITE.get() + "*** Piatti del giorno ***" + ColorEnum.RESET.get());
//        stampaPortataDelGiorno(n, n2);
    }


    public void addTavolo(Tavolo tavolo){
        listaTavoli.add(tavolo);
    }

    public void aggiungiPrenotazione(Cliente cliente) {
        Tavolo  tavoloScelto = null;
        int differenza = 0;
        for (Tavolo tavolo : listaTavoli) {
            int differenzaMinima = tavolo.getTavolo().getNumeroPosti() - cliente.getNumeroPersone();
            if ((listaPrenotazione.size() < totaleNumeroTavoli) && (tavolo.getTavolo().getNumeroPosti() >= cliente.getNumeroPersone()) && (differenza >= differenzaMinima)){
                    tavoloScelto = tavolo;
                    differenza = differenzaMinima;
            }
        }
        if (tavoloScelto != null){
        listaPrenotazione.put(cliente, tavoloScelto);
        } else {
            System.out.println("Non è stato possibile prenotare per il cliente " + cliente.getCognome() + "  perchè non ci sono più tavoli");
        }
        listaTavoli.remove(tavoloScelto);
    }

    public void printListaPrenotazioni(){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + "****************** Lista prenotazioni ***************+" + ColorEnum.RESET.get() );
        for (Map.Entry<Cliente, Tavolo> e : listaPrenotazione.entrySet()) {
            System.out.println(ColorEnum.PURPLE.get()  + "Cliente: " + e.getKey().getCognome() +", Ore: " +  e.getKey().getOrarioPrenotazione() +
                    ", Persone n. " + e.getKey().getNumeroPersone() + ", Tavolo: " + e.getValue().getNomeTavolo() + ColorEnum.RESET.get() );
        }
        System.out.println( ColorEnum.BLUE.get()  + "****************************************************" + ColorEnum.RESET.get() );
    }
}
