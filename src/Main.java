package src;
import src.enums.MenuTypeEnum;
import src.portate.*;

public class Main {
    public static void main(String[] args) {
        Ristorante ristorante = new Ristorante();

        Menu menuCarne = new Menu("Luca Rossi", MenuTypeEnum.CARNE);
        Menu menuPesce = new Menu("Mario Rossi", MenuTypeEnum.PESCE);

        Antipasti antipastoCarne1 = new Antipasti("Bruschette ", 1.0, 4 );
        Antipasti antipastoCarne2 = new Antipasti("Prosciutto", 2.0) ;
        Antipasti antipastoCarne3 = new Antipasti("Tortine Salate", 3.0, 4);
        Antipasti antipastoCarne4 = new Antipasti("Burrata", 3.0);

        PrimiPiatti primoCarne1 = new PrimiPiatti("Lasagne alla bolognese", 12.0,false, true);
        PrimiPiatti primoCarne2 = new PrimiPiatti("Tagliatelle al ragù", 10.0, false, true);
        PrimiPiatti primoCarne3 = new PrimiPiatti("Rigatoni alla carbonara", 11.0,false, false);
        PrimiPiatti primoCarne4 = new PrimiPiatti("Cappelletti in brodo", 15.0,false, true);
        PrimiPiatti primoCarne5 = new PrimiPiatti("Tris di ravioli", 13.0,true, true);
        PrimiPiatti primoCarne6 = new PrimiPiatti("Risotto radicchio e salsiccia", 15.0,false, false);
        PrimiPiatti primoCarne7 = new PrimiPiatti("Risotto speck e gorgonzola", 15.0,true, false);

        SecondiPiatti secondoCarne1 = new SecondiPiatti("Hamburger Di Manzo", 10.0, true);
        SecondiPiatti secondoCarne2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola", 12.0, true);
        SecondiPiatti secondoCarne3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana", 11.0, true);
        SecondiPiatti secondoCarne4 = new SecondiPiatti("Cotolettine Di Arista Arrosto", 11.0, false );
        SecondiPiatti secondoCarne5 = new SecondiPiatti("Scaloppine Limone e Zenzero", 11.0, true);
        SecondiPiatti secondoCarne6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio", 12.0, true);
        SecondiPiatti secondoCarne7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13.0, false);

        Dessert dessertCarneEPesce1 = new Dessert("Tiramisù", 8.0, "SEMI-FREDDO", false);
        Dessert dessertCarneEPesce2 = new Dessert("Tarallo Aviglianese", 7.0, "FREDDO", false);
        Dessert dessertCarneEPesce3 = new Dessert("Sbriciolata al Castagnaccio", 8.0, "CALDO", true);
        Dessert dessertCarneEPesce4 = new Dessert("Creme brulée", 5.0, "CALDO", false);
        Dessert dessertCarneEPesce5 = new Dessert("Sorbetto al limone", 3.0, "FREDDO", true);

        Bevande bevanda1 = new Bevande("Acqua minerale naturale", 1.5);
        Bevande bevanda2 = new Bevande("Coca-cola", 2.5);
        Bevande bevanda3 = new Bevande("Vino Rosso", 5.0, "(alc. 12%)");
        Bevande bevanda4 = new Bevande("Vino Bianco", 5.0, "(alc. 10,5%)");
        Bevande bevanda5 = new Bevande("Birra alla spina", 3.0, "(alc. 4,5%)");

        menuCarne.addPortata(antipastoCarne1);
        menuCarne.addPortata(antipastoCarne2);
        menuCarne.addPortata(antipastoCarne3);
        menuCarne.addPortata(antipastoCarne4);

        menuCarne.addPortata(primoCarne1);
        menuCarne.addPortata(primoCarne2);
        menuCarne.addPortata(primoCarne3);
        menuCarne.addPortata(primoCarne4);
        menuCarne.addPortata(primoCarne5);
        menuCarne.addPortata(primoCarne6);
        menuCarne.addPortata(primoCarne7);

        menuCarne.addPortata(secondoCarne1);
        menuCarne.addPortata(secondoCarne2);
        menuCarne.addPortata(secondoCarne3);
        menuCarne.addPortata(secondoCarne4);
        menuCarne.addPortata(secondoCarne5);
        menuCarne.addPortata(secondoCarne6);
        menuCarne.addPortata(secondoCarne7);

        menuCarne.addPortata(dessertCarneEPesce1);
        menuCarne.addPortata(dessertCarneEPesce2);
        menuCarne.addPortata(dessertCarneEPesce3);
        menuCarne.addPortata(dessertCarneEPesce4);
        menuCarne.addPortata(dessertCarneEPesce5);

        menuCarne.addPortata(bevanda1);
        menuCarne.addPortata(bevanda2);
        menuCarne.addPortata(bevanda3);
        menuCarne.addPortata(bevanda4);
        menuCarne.addPortata(bevanda5);


        Antipasti antipastoPesce1 = new Antipasti("Bruschette ", 1.0, 4 );
        Antipasti antipastoPesce2 = new Antipasti("Prosciutto", 2.0) ;
        Antipasti antipastoPesce3 = new Antipasti("Tortine Salate", 3.0, 4);
        Antipasti antipastoPesce4 = new Antipasti("Burrata", 3.0);

        PrimiPiatti primoPesce1 = new PrimiPiatti("Lasagne alla bolognese", 12.0,false, true);
        PrimiPiatti primoPesce2 = new PrimiPiatti("Tagliatelle al ragù", 10.0, false, true);
        PrimiPiatti primoPesce3 = new PrimiPiatti("Rigatoni alla carbonara", 11.0,false, false);
        PrimiPiatti primoPesce4 = new PrimiPiatti("Cappelletti in brodo", 15.0,false, true);
        PrimiPiatti primoPesce5 = new PrimiPiatti("Tris di ravioli", 13.0,true, true);
        PrimiPiatti primoPesce6 = new PrimiPiatti("Risotto radicchio e salsiccia", 15.0,false, false);
        PrimiPiatti primoPesce7 = new PrimiPiatti("Risotto speck e gorgonzola", 15.0,true, false);

        SecondiPiatti secondoPesce1 = new SecondiPiatti("Hamburger Di Manzo", 10.0, true);
        SecondiPiatti secondoPesce2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola", 12.0, true);
        SecondiPiatti secondoPesce3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana", 11.0, true);
        SecondiPiatti secondoPesce4 = new SecondiPiatti("Cotolettine Di Arista Arrosto", 11.0, false );
        SecondiPiatti secondoPesce5 = new SecondiPiatti("Scaloppine Limone e Zenzero", 11.0, true);
        SecondiPiatti secondoPesce6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio", 12.0, true);
        SecondiPiatti secondoPesce7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13.0, false);

        menuPesce.addPortata(antipastoPesce1);
        menuPesce.addPortata(antipastoPesce2);
        menuPesce.addPortata(antipastoPesce3);
        menuPesce.addPortata(antipastoPesce4);

        menuPesce.addPortata(primoPesce1);
        menuPesce.addPortata(primoPesce2);
        menuPesce.addPortata(primoPesce3);
        menuPesce.addPortata(primoPesce4);
        menuPesce.addPortata(primoPesce5);
        menuPesce.addPortata(primoPesce6);
        menuPesce.addPortata(primoPesce7);

        menuPesce.addPortata(secondoPesce1);
        menuPesce.addPortata(secondoPesce2);
        menuPesce.addPortata(secondoPesce3);
        menuPesce.addPortata(secondoPesce4);
        menuPesce.addPortata(secondoPesce5);
        menuPesce.addPortata(secondoPesce6);
        menuPesce.addPortata(secondoPesce7);

        menuPesce.addPortata(dessertCarneEPesce1);
        menuPesce.addPortata(dessertCarneEPesce2);
        menuPesce.addPortata(dessertCarneEPesce3);
        menuPesce.addPortata(dessertCarneEPesce4);
        menuPesce.addPortata(dessertCarneEPesce5);

        menuPesce.addPortata(bevanda1);
        menuPesce.addPortata(bevanda2);
        menuPesce.addPortata(bevanda3);
        menuPesce.addPortata(bevanda4);
        menuPesce.addPortata(bevanda5);

        ristorante.addMenu(menuCarne);
        ristorante.addMenu(menuPesce);

        ristorante.stampaMenuSpecifico(MenuTypeEnum.CARNE);

    }
}
