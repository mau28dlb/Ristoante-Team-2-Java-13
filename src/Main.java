package src;
import src.portate.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("Luca Rossi");

        Antipasti antipasto1 = new Antipasti("Bruschette", 1, 4, "CRUDO");
        Antipasti antipasto2 = new Antipasti("Prosciutto", 2, 1, "CRUDO");
        Antipasti antipasto3 = new Antipasti("Tortine Salate", 3, 4, "COTTO");
        Antipasti antipasto4 = new Antipasti("Burrata", 3, 1, "COTTO");

        PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla bolognese", 12);
        PrimiPiatti primo2 = new PrimiPiatti("Tagliatelle al ragù", 10);
        PrimiPiatti primo3 = new PrimiPiatti("Rigatoni alla carbonara", 11);
        PrimiPiatti primo4 = new PrimiPiatti("Cappelletti in brodo", 14);
        PrimiPiatti primo5 = new PrimiPiatti("Tris di ravioli", 13);

        SecondiPiatti secondo1 = new SecondiPiatti("Hamburger Di Manzo", 10, true);
        SecondiPiatti secondo2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola", 12, true);
        SecondiPiatti secondo3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana", 11, true);
        SecondiPiatti secondo4 = new SecondiPiatti("Cotolettine Di Arista Arrosto", 11, false );
        SecondiPiatti secondo5 = new SecondiPiatti("Scaloppine Limone e Zenzero", 11, true);
        SecondiPiatti secondo6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio", 12, true);
        SecondiPiatti secondo7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13, false);

        Dessert dessert1 = new Dessert("Tiramisù", 8, "SEMI-FREDDO", false);
        Dessert dessert2 = new Dessert("Tarallo Aviglianese", 7, "FREDDO", false);
        Dessert dessert3 = new Dessert("Sbriciolata al Castagnaccio", 8, "CALDO", true);
        Dessert dessert4 = new Dessert("Creme brulée", 5, "CALDO", false);
        Dessert dessert5 = new Dessert("Sorbetto al limone", 3, "FREDDO", true);

        Bevande bevanda1 = new Bevande("Acqua minerale naturale", 1);
        Bevande bevanda2 = new Bevande("Coca-cola", 2);
        Bevande bevanda3 = new Bevande("Vino Rosso", 5, "(alc. 12%)");
        Bevande bevanda4 = new Bevande("Birra alla spina", 3, "(alc. 4,5%)");

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);

        /*menu.addPortata(primo1);
        menu.addPortata(primo2);
        menu.addPortata(primo3);
        menu.addPortata(primo4);
        menu.addPortata(primo5);

        */

        menu.addPortata(secondo1);
        menu.addPortata(secondo2);
        menu.addPortata(secondo3);
        menu.addPortata(secondo4);
        menu.addPortata(secondo5);
        menu.addPortata(secondo6);
        menu.addPortata(secondo7);



        menu.addPortata(dessert1);
        menu.addPortata(dessert2);
        menu.addPortata(dessert3);
        menu.addPortata(dessert4);
        menu.addPortata(dessert5);

        menu.addPortata(bevanda1);
        menu.addPortata(bevanda2);
        menu.addPortata(bevanda3);
        menu.addPortata(bevanda4);



        menu.stampaMenuCompleto();


    }
}
