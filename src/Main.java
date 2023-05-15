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

        SecondiPiatti secondo1 = new SecondiPiatti("Hamburger Di Manzo", 9);
        SecondiPiatti secondo2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola", 11);
        SecondiPiatti secondo3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana", 10);
        SecondiPiatti secondo4 = new SecondiPiatti("Cotolettine Di Arista Arrosto", 10);
        SecondiPiatti secondo5 = new SecondiPiatti("Scaloppine Limone e Zenzero", 10);
        SecondiPiatti secondo6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio", 11);
        SecondiPiatti secondo7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13);
        SecondiPiatti secondo8 = new SecondiPiatti("Baccalà Pastellato al Mais", 12);

        Dessert dessert1 = new Dessert("Tiramisù", 8, "SEMI-FREDDO", false);
        Dessert dessert2 = new Dessert("Tarallo Aviglianese", 7, "FREDDO", false);
        Dessert dessert3 = new Dessert("Sbriciolata al Castagnaccio", 8, "CALDO", true);
        Dessert dessert4 = new Dessert("Creme brulée", 5, "CALDO", false);
        Dessert dessert5 = new Dessert("Sorbetto al limone", 3, "FREDDO", true);

        Bevande bevanda1 = new Bevande("Acqua minerale naturale", 1);
        Bevande bevanda2 = new Bevande("Coca Cola", 2);
        Bevande bevanda3 = new Bevande("Vino Rosso", 3);
        Bevande bevanda4 = new Bevande("Birra alla spina", 3);

        menu.addAntipasti(antipasto1);
        menu.addAntipasti(antipasto2);
        menu.addAntipasti(antipasto3);
        menu.addAntipasti(antipasto4);

        menu.addPrimi(primo1);
        menu.addPrimi(primo2);
        menu.addPrimi(primo3);
        menu.addPrimi(primo4);
        menu.addPrimi(primo5);

        menu.addSecondiPiatti(secondo1);
        menu.addSecondiPiatti(secondo2);
        menu.addSecondiPiatti(secondo3);
        menu.addSecondiPiatti(secondo4);
        menu.addSecondiPiatti(secondo5);
        menu.addSecondiPiatti(secondo6);
        menu.addSecondiPiatti(secondo7);
        menu.addSecondiPiatti(secondo8);

        menu.addDessert(dessert1);
        menu.addDessert(dessert2);
        menu.addDessert(dessert3);
        menu.addDessert(dessert4);
        menu.addDessert(dessert5);

        menu.addBevande(bevanda1);
        menu.addBevande(bevanda2);
        menu.addBevande(bevanda3);
        menu.addBevande(bevanda4);

        menu.stampaMenuCompleto();

    }
}
