package src;

import java.util.ArrayList;
import java.util.List;
import src.enums.ColorEnum;
import src.enums.MenuTypeEnum;

public class Ristorante {
    String nomeRistorante = "Ristorante Rossi";
    ArrayList <Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }


    public void stampaRistorante (){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList){
            System.out.println("-------------------------------------------------------");
            menu.stampaMenuCompleto();
            System.out.println("-------------------------------------------------------");
        }
    }

    public void stampaMenuSpecifico(MenuTypeEnum menuTypeEnum){
        System.out.println("\n");
        System.out.println(ColorEnum.BLUE.get() + nomeRistorante + ColorEnum.RESET.get());
        System.out.println("");
        for (Menu menu : menuList){
            if(menu.getMenuType() == menuTypeEnum){
                menu.stampaMenuCompleto();
            }
        }
    }

}
