package src;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;
import src.portate.Portata;
import src.portate.PrimiPiatti;
import src.portate.SecondiPiatti;

public class Ristorante {
    protected Integer ID;
    protected String nomeRistorante;
    protected String indirizzoRistorante;
    protected String chef;
    protected ArrayList<Menu> menuList = new ArrayList<>();
    protected List<Tavolo> listaTavoli = new ArrayList<>();
    protected Map <Prenotazione, Tavolo> listaPrenotazione = new HashMap<>();
    protected int totaleNumeroTavoli = 10;


    public Ristorante(String nomeRistorante, String indirizzoRistorante, String chef) {
        this.nomeRistorante = nomeRistorante;
        this.indirizzoRistorante = indirizzoRistorante;
        this.chef = chef;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void stampaRistorante(Integer n, Integer n2) {
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.getAnsiCode() + nomeRistorante + ColorEnum.RESET.getAnsiCode());
        System.out.println("");
        for (Menu menu : menuList) {
            System.out.println("-------------------------------------------------------");
            menu.stampaMenuCompleto();
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("\n");
        System.out.println(ColorEnum.WHITE.getAnsiCode() + "*** Piatti del giorno ***" + ColorEnum.RESET.getAnsiCode());
    }

    public void stampaMenuSpecifico(MenuTypeEnum menuTypeEnum, PrimiPiatti primoPiattoDelGiorno, SecondiPiatti secondoPiattoDelGiorno) {
        System.out.println("\n");
        System.out.println(ColorEnum.GREEN.getAnsiCode() + nomeRistorante + ColorEnum.RESET.getAnsiCode());
        System.out.println(ColorEnum.GREEN.getAnsiCode() + indirizzoRistorante + ColorEnum.RESET.getAnsiCode());
        System.out.println("");
        System.out.println(ColorEnum.YELLOW.getAnsiCode() + "Chef: " + chef + ColorEnum.RESET.getAnsiCode());
        System.out.println("");
        for (Menu menu : menuList) {
            if (menu.getMenuType() == menuTypeEnum) {
                menu.stampaMenuCompleto();
            }
        }

        primoPiattoDelGiorno.printPortataColorata(ColorEnum.WHITE);
        secondoPiattoDelGiorno.printPortataColorata(ColorEnum.WHITE);
    }

    public void addTavolo(Tavolo tavolo){
        listaTavoli.add(tavolo);
    }

    //public void addPrenotazione (Prenotazione prenotazione) {listaPrenotazione.put(prenotazione, );}

    public void aggiungiPrenotazione(Prenotazione prenotazione) {
        Tavolo  tavoloScelto = null;
        int differenza = Integer.MAX_VALUE;
        for (Tavolo tavolo : listaTavoli) {
            int differenzaMinima = tavolo.getTavolo().getNumeroPosti() - prenotazione.getCliente().getNumeroPersone();
            if ((listaPrenotazione.size() < totaleNumeroTavoli) && (tavolo.getTavolo().getNumeroPosti() >= prenotazione.getCliente().getNumeroPersone()) && (differenza >= differenzaMinima)){
                    tavoloScelto = tavolo;
                    differenza = differenzaMinima;
            }
        }
        if (tavoloScelto != null){
        listaPrenotazione.put(prenotazione, tavoloScelto);
        } else {
            System.out.println("Non è stato possibile prenotare per il cliente " + prenotazione.getCliente().getCognome() + "  perchè non ci sono più tavoli");
        }
        listaTavoli.remove(tavoloScelto);
    }

    public void printListaPrenotazioni(){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.getAnsiCode() + "****************** Lista prenotazioni ***************+" + ColorEnum.RESET.getAnsiCode() );
        for (Map.Entry<Prenotazione, Tavolo> prenotazione : listaPrenotazione.entrySet()) {
            System.out.println(ColorEnum.PURPLE.getAnsiCode()  + "Cliente: " + prenotazione.getKey().getCliente().getCognome() +", Data: " +  prenotazione.getKey().getData() +
                    ", Persone n. " + prenotazione.getKey().getCliente().getNumeroPersone() + ", Tavolo: " + prenotazione.getValue().getNomeTavolo() + ColorEnum.RESET.getAnsiCode() );
        }
        System.out.println( ColorEnum.BLUE.getAnsiCode()  + "****************************************************" + ColorEnum.RESET.getAnsiCode() );
    }
}
