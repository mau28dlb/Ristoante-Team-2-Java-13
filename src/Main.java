package src;
import src.enums.MenuTypeEnum;
import src.portate.*;

public class Main {
    public static void main(String[] args) {
        Ristorante ristorante = new Ristorante();

        Menu menuCarne = new Menu("Luca Rossi", MenuTypeEnum.CARNE);
        Menu menuPesce = new Menu("Mario Rossi", MenuTypeEnum.PESCE);
        Menu menuVegan = new Menu("Simona Rossi", MenuTypeEnum.VEGANO);

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


        Antipasti antipastoPesce1 = new Antipasti("Insalata di mare ", 5.0, 4 );
        Antipasti antipastoPesce2 = new Antipasti("Tris fumè", 7.5) ;
        Antipasti antipastoPesce3 = new Antipasti("Caponata di pesce spada", 5.5, 2);

        PrimiPiatti primoPesce1 = new PrimiPiatti("Caserecce al pesce spada con mentuccia e melanzane", 12.0,false, false);
        PrimiPiatti primoPesce2 = new PrimiPiatti("Ravioli di cernia", 13.5, true, true);
        PrimiPiatti primoPesce3 = new PrimiPiatti("Spaghetti con pesto di pistacchio e gambero rosso di Mazara", 15.0,false, false);
        PrimiPiatti primoPesce4 = new PrimiPiatti("Fettuccine all'astice", 16.5,false, true);

        SecondiPiatti secondoPesce1 = new SecondiPiatti("Sformato di polpo al forno con patate al limone", 12.0, true);
        SecondiPiatti secondoPesce2 = new SecondiPiatti("Trancio di cernia al vapore", 14.0, false);
        SecondiPiatti secondoPesce3 = new SecondiPiatti("Involtini di pesce spada Alla Siciliana", 11.5, true);
        SecondiPiatti secondoPesce4 = new SecondiPiatti("Gamberoni arrosto", 13.0, false );

        menuPesce.addPortata(antipastoPesce1);
        menuPesce.addPortata(antipastoPesce2);
        menuPesce.addPortata(antipastoPesce3);

        menuPesce.addPortata(primoPesce1);
        menuPesce.addPortata(primoPesce2);
        menuPesce.addPortata(primoPesce3);
        menuPesce.addPortata(primoPesce4);

        menuPesce.addPortata(secondoPesce1);
        menuPesce.addPortata(secondoPesce2);
        menuPesce.addPortata(secondoPesce3);
        menuPesce.addPortata(secondoPesce4);

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


        Antipasti antipastoVegan1 = new Antipasti("Sformatino di quinoa", 4.5);
        Antipasti antipastoVegan2 = new Antipasti("Frittelle di zucchine e funghi shitake", 4.0);
        Antipasti antipastoVegan3 = new Antipasti("Insalata russa vegana", 5.0, 2);

        PrimiPiatti primoVegan1 = new PrimiPiatti("Gnocchi di mais alla Romana con fonduta di formaggi vegetali", 12.0, false, true);
        PrimiPiatti primoVegan2 = new PrimiPiatti("Mezzi paccheri alla Carbonara vegana", 11.0, false, false);
        PrimiPiatti primoVegan3 = new PrimiPiatti("Spaghettoni al ragù vegano", 10.0, false, false);

        SecondiPiatti secondoVegan1 = new SecondiPiatti("Nuggets di ceci con mayo vegana e fagiolini al peperoncino", 13.5, true);
        SecondiPiatti secondoVegan2 = new SecondiPiatti("Bastoncini di tempeh su crema di zucchine", 14.5, true);
        SecondiPiatti secondoVegan3 = new SecondiPiatti("Spiedini di polpette di soia e zucchine al forno con patate rustiche", 12.0, true);

        Dessert dessertVegano1 = new Dessert("Tiramisù vegano senza uova", 7.5, "FREDDO", true );
        Dessert dessertVegano2 = new Dessert("Panna cotta vegana ai due cioccolati", 6.5, "FREDDO", true );

        menuVegan.addPortata(antipastoVegan1);
        menuVegan.addPortata(antipastoVegan2);
        menuVegan.addPortata(antipastoVegan3);
        menuVegan.addPortata(primoVegan1);
        menuVegan.addPortata(primoVegan2);
        menuVegan.addPortata(primoVegan3);
        menuVegan.addPortata(secondoVegan1);
        menuVegan.addPortata(secondoVegan2);
        menuVegan.addPortata(secondoVegan3);
        menuVegan.addPortata(dessertVegano1);
        menuVegan.addPortata(dessertVegano2);
        menuVegan.addPortata(bevanda1);
        menuVegan.addPortata(bevanda2);
        menuVegan.addPortata(bevanda3);
        menuVegan.addPortata(bevanda4);
        menuVegan.addPortata(bevanda5);

        ristorante.addMenu(menuCarne);
        ristorante.addMenu(menuPesce);
        ristorante.addMenu(menuVegan);


        PrimiPiatti primoPiattoDelGiorno1 = new PrimiPiatti("Pasta al forno besciamella e macinato di carne", 14.0, false,false);
        PrimiPiatti primoPiattoDelGiorno2 = new PrimiPiatti("Ravioli al montasio con ripieno di zucca e guanciale",15.0,false,true);
        PrimiPiatti primoPiattoDelGiorno3 = new PrimiPiatti("Pennette con salsiccia e caprino",13.0,false,false);
        PrimiPiatti primoPiattoDelGiorno4 = new PrimiPiatti("Spaghetti con polpette al sugo",13.0,false,false);
        PrimiPiatti primoPiattoDelGiorno5 = new PrimiPiatti("Pasta alla Zozzona",14.0,true,false);

        SecondiPiatti secondoPiattoDelGiorno1 = new SecondiPiatti("Maialino arrosto con patate al forno", 16.0,true);
        SecondiPiatti secondoPiattoDelGiorno2 = new SecondiPiatti("Involtini di carne al pistacchio",18.0,true);
        SecondiPiatti secondoPiattoDelGiorno3 = new SecondiPiatti("Filetto in crosta",22.0,true);
        SecondiPiatti secondoPiattoDelGiorno4 = new SecondiPiatti("Arrosto all'arancia",18.0,true);
        SecondiPiatti secondoPiattoDelGiorno5 = new SecondiPiatti("Polpettone con fontina",16.0,true);

        ristorante.addPiattoDelGiorno( primoPiattoDelGiorno1);
        ristorante.addPiattoDelGiorno(2, primoPiattoDelGiorno2);
        ristorante.addPiattoDelGiorno(3, primoPiattoDelGiorno3);
        ristorante.addPiattoDelGiorno(4, primoPiattoDelGiorno4);
        ristorante.addPiattoDelGiorno(5, primoPiattoDelGiorno5);
        ristorante.addPiattoDelGiorno(6, secondoPiattoDelGiorno1);
        ristorante.addPiattoDelGiorno(7, secondoPiattoDelGiorno2);
        ristorante.addPiattoDelGiorno(8, secondoPiattoDelGiorno3);
        ristorante.addPiattoDelGiorno(9, secondoPiattoDelGiorno4);
        ristorante.addPiattoDelGiorno(10, secondoPiattoDelGiorno5);

        ristorante.stampaMenuSpecifico(MenuTypeEnum.VEGANO,primoPiattoDelGiorno1,secondoPiattoDelGiorno1);
    }
}
