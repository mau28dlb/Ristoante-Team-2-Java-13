package src;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    String nomeRistorante = "Ristorante Rossi";
    ArrayList <Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }
}
