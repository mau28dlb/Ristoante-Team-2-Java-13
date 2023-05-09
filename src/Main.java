package src;
import src.portate.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Antipasti antipasto1 = new Antipasti("Bruschette                                         ", 1);
        Antipasti antipasto2 = new Antipasti("Prosciutto                                         ", 2);
        Antipasti antipasto3 = new Antipasti("Tortine Salate                                     ", 3);
        Antipasti antipasto4 = new Antipasti("Burrata                                            ", 3);

        PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla bolognese                             ", 12);
        PrimiPiatti primo2 = new PrimiPiatti("Tagliatelle al ragù                                ", 10);
        PrimiPiatti primo3 = new PrimiPiatti("Rigatoni alla carbonara                            ", 11);
        PrimiPiatti primo4 = new PrimiPiatti("Cappelletti in brodo                               ", 14);
        PrimiPiatti primo5 = new PrimiPiatti("Tris di ravioli                                    ", 13);

        SecondiPiatti secondo1 = new SecondiPiatti("Hamburger Di Manzo                                 ", 9);
        SecondiPiatti secondo2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola         ", 11);
        SecondiPiatti secondo3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana                   ", 10);
        SecondiPiatti secondo4 = new SecondiPiatti("Cotolettine Di Arista Arrosto                      ", 10);
        SecondiPiatti secondo5 = new SecondiPiatti("Scaloppine Limone e Zenzero                        ", 10);
        SecondiPiatti secondo6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio  ", 11);
        SecondiPiatti secondo7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13);
        SecondiPiatti secondo8 = new SecondiPiatti("Baccalà Pastellato al Mais                         ", 12);

        Dessert dessert1 = new Dessert("Tiramisù                                          ", 8);
        Dessert dessert2 = new Dessert("Tarallo Aviglianese                               ", 7);
        Dessert dessert3 = new Dessert("Sbriciolata al Castagnaccio                       ", 8);
        Dessert dessert4 = new Dessert("Creme brulée                                      ", 5);
        Dessert dessert5 = new Dessert("Sorbetto al limone                                ", 3);

        Bevande bevanda1 = new Bevande("Acqua minerale naturale                            ", 1);
        Bevande bevanda2 = new Bevande("Coca Cola                                          ", 2);
        Bevande bevanda3 = new Bevande("Vino Rosso                                         ", 3);
        Bevande bevanda4 = new Bevande("Birra alla spina                                   ", 3);

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

       System.out.println("Ristorante-Team-2-Java-13");
       System.out.println("\n");
       System.out.println("\n");

       menu.stampaTutto();

       /*
        System.out.println("Antipasti");
        antipasto1.printAntipasti();
        antipasto2.printAntipasti();
        antipasto3.printAntipasti();
        antipasto4.printAntipasti();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Primi");
        primo1.printPrimiPiatti();
        primo2.printPrimiPiatti();
        primo3.printPrimiPiatti();
        primo4.printPrimiPiatti();
        primo5.printPrimiPiatti();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Secondi");
        secondo1.printSecondo();
        secondo2.printSecondo();
        secondo3.printSecondo();
        secondo4.printSecondo();
        secondo5.printSecondo();
        secondo6.printSecondo();
        secondo7.printSecondo();
        secondo8.printSecondo();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Dessert");
        dessert1.printDessert();
        dessert2.printDessert();
        dessert3.printDessert();
        dessert4.printDessert();
        dessert5.printDessert();
        System.out.println("\n");
        System.out.println("\n");


        System.out.println("Bevande");
        bevanda1.printBevande();
        bevanda2.printBevande();
        bevanda3.printBevande();
        bevanda4.printBevande();*/
    }
}
