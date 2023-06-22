package src;
import src.DAO.Bevande_DAO;
import src.enums.MenuTypeEnum;
import src.enums.TavoloEnum;
import src.enums.TemperatureDessertEnum;
import src.portate.*;
import src.DAO.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Ristorante ristorante = new Ristorante("RISTORANTE ROSSI", "via Roma 132, Palermo", "Luca Rossi");

        Tavolo tavolo1 = new Tavolo(TavoloEnum.TAVOLO_PER_DUE, "Tavolo 1");
        Tavolo tavolo2 = new Tavolo(TavoloEnum.TAVOLO_PER_DUE, "Tavolo 2");
        Tavolo tavolo3 = new Tavolo(TavoloEnum.TAVOLO_PER_DUE, "Tavolo 3");
        Tavolo tavolo4 = new Tavolo(TavoloEnum.TAVOLO_PER_OTTO, "Tavolo 4");
        Tavolo tavolo5 = new Tavolo(TavoloEnum.TAVOLO_PER_OTTO, "Tavolo 5");
        Tavolo tavolo6 = new Tavolo(TavoloEnum.TAVOLO_PER_OTTO, "Tavolo 6");
        Tavolo tavolo7 = new Tavolo(TavoloEnum.TAVOLO_PER_OTTO, "Tavolo 7");
        Tavolo tavolo8 = new Tavolo(TavoloEnum.TAVOLO_PER_SEI, "Tavolo 8");
        Tavolo tavolo9 = new Tavolo(TavoloEnum.TAVOLO_PER_SEI, "Tavolo 9");
        Tavolo tavolo10 = new Tavolo(TavoloEnum.TAVOLO_PER_SEI, "Tavolo 10");

        ristorante.addTavolo(tavolo1);
        ristorante.addTavolo(tavolo2);
        ristorante.addTavolo(tavolo3);
        ristorante.addTavolo(tavolo4);
        ristorante.addTavolo(tavolo5);
        ristorante.addTavolo(tavolo6);
        ristorante.addTavolo(tavolo7);
        ristorante.addTavolo(tavolo8);
        ristorante.addTavolo(tavolo9);
        ristorante.addTavolo(tavolo10);


        Cliente cliente1 = new Cliente("Barone",2);
        Cliente cliente2 = new Cliente("Carnevale",  4);
        Cliente cliente3 = new Cliente("Diliberto",  8);
        Cliente cliente4 = new Cliente("Santonocito", 5);

        Prenotazione prenotazione1 = new Prenotazione("22-06-2023", cliente1);
        Prenotazione prenotazione2 = new Prenotazione("23-06-2023", cliente2);
        Prenotazione prenotazione3 = new Prenotazione("24-06-2023", cliente3);
        Prenotazione prenotazione4 = new Prenotazione("26-06-2023", cliente4);

        ristorante.aggiungiPrenotazione(prenotazione1);
        ristorante.aggiungiPrenotazione(prenotazione2);
        ristorante.aggiungiPrenotazione(prenotazione3);
        ristorante.aggiungiPrenotazione(prenotazione4);

        ristorante.printListaPrenotazioni();


        Menu menuCarne = new Menu( MenuTypeEnum.CARNE);
        Menu menuPesce = new Menu( MenuTypeEnum.PESCE);
        Menu menuVegan = new Menu( MenuTypeEnum.VEGANO);


        Antipasti antipastoCarne1 = new Antipasti("Bruschette ", 1.0, 4 );
        Antipasti antipastoCarne2 = new Antipasti("Prosciutto", 2.0) ;
        Antipasti antipastoCarne3 = new Antipasti("Tortine Salate", 3.0, 4);
        Antipasti antipastoCarne4 = new Antipasti("Burrata", 3.0);

        PrimiPiatti primoCarne1 = new PrimiPiatti("Lasagne alla bolognese", 12.0,false, true, false);
        PrimiPiatti primoCarne2 = new PrimiPiatti("Tagliatelle al ragù", 10.0, false, true, false);
        PrimiPiatti primoCarne3 = new PrimiPiatti("Rigatoni alla carbonara", 11.0,false, false, false);
        PrimiPiatti primoCarne4 = new PrimiPiatti("Cappelletti in brodo", 15.0,false, true, false);
        PrimiPiatti primoCarne5 = new PrimiPiatti("Tris di ravioli", 13.0,true, true, false);
        PrimiPiatti primoCarne6 = new PrimiPiatti("Risotto radicchio e salsiccia", 15.0,false, false, false);
        PrimiPiatti primoCarne7 = new PrimiPiatti("Risotto speck e gorgonzola", 15.0,true, false, false);

        SecondiPiatti secondoCarne1 = new SecondiPiatti("Hamburger Di Manzo", 10.0, true, false);
        SecondiPiatti secondoCarne2 = new SecondiPiatti("Hamburger Di Manzo con Salsa al Gorgonzola", 12.0, true, false);
        SecondiPiatti secondoCarne3 = new SecondiPiatti("Polpette Di Manzo Alla Siciliana", 11.0, true, false);
        SecondiPiatti secondoCarne4 = new SecondiPiatti("Cotolettine Di Arista Arrosto", 11.0, false, false);
        SecondiPiatti secondoCarne5 = new SecondiPiatti("Scaloppine Limone e Zenzero", 11.0, true, false);
        SecondiPiatti secondoCarne6 = new SecondiPiatti("Scaloppina All'arancia Con Granella Di Pistacchio", 12.0, true, false);
        SecondiPiatti secondoCarne7 = new SecondiPiatti("Straccetti Di Vitello Con Salsa All'aceto Balsamico", 13.0, false, false);

        Dessert dessertCarneEPesce1 = new Dessert("Tiramisù", 8.0, TemperatureDessertEnum.SEMI_FREDDO, false);
        Dessert dessertCarneEPesce2 = new Dessert("Tarallo Aviglianese", 7.0, TemperatureDessertEnum.FREDDO, false);
        Dessert dessertCarneEPesce3 = new Dessert("Sbriciolata al Castagnaccio", 8.0, TemperatureDessertEnum.CALDO, true);
        Dessert dessertCarneEPesce4 = new Dessert("Creme brulée", 5.0, TemperatureDessertEnum.CALDO, false);
        Dessert dessertCarneEPesce5 = new Dessert("Sorbetto al limone", 3.0, TemperatureDessertEnum.FREDDO, true);

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

        PrimiPiatti primoPesce1 = new PrimiPiatti("Caserecce al pesce spada con mentuccia e melanzane", 12.0,false, false, false);
        PrimiPiatti primoPesce2 = new PrimiPiatti("Ravioli di cernia", 13.5, true, true, false);
        PrimiPiatti primoPesce3 = new PrimiPiatti("Spaghetti con pesto di pistacchio e gambero rosso di Mazara", 15.0,false, false, false);
        PrimiPiatti primoPesce4 = new PrimiPiatti("Fettuccine all'astice", 16.5,false, true, false);

        SecondiPiatti secondoPesce1 = new SecondiPiatti("Sformato di polpo al forno con patate al limone", 12.0, true, false);
        SecondiPiatti secondoPesce2 = new SecondiPiatti("Trancio di cernia al vapore", 14.0, false, false);
        SecondiPiatti secondoPesce3 = new SecondiPiatti("Involtini di pesce spada alla Siciliana", 11.5, true, false);
        SecondiPiatti secondoPesce4 = new SecondiPiatti("Gamberoni arrosto", 13.0, false, false);

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

        PrimiPiatti primoVegan1 = new PrimiPiatti("Gnocchi di mais alla Romana con fonduta di formaggi vegetali", 12.0, false, true, false);
        PrimiPiatti primoVegan2 = new PrimiPiatti("Mezzi paccheri alla Carbonara vegana", 11.0, false, false, false);
        PrimiPiatti primoVegan3 = new PrimiPiatti("Spaghettoni al ragù vegano", 10.0, false, false, false);

        SecondiPiatti secondoVegan1 = new SecondiPiatti("Nuggets di ceci con mayo vegana e fagiolini al peperoncino", 13.5, true, false);
        SecondiPiatti secondoVegan2 = new SecondiPiatti("Bastoncini di tempeh su crema di zucchine", 14.5, true, false);
        SecondiPiatti secondoVegan3 = new SecondiPiatti("Spiedini di polpette di soia e zucchine al forno con patate rustiche", 12.0, true, false);

        Dessert dessertVegano1 = new Dessert("Tiramisù vegano senza uova", 7.5, TemperatureDessertEnum.FREDDO, true );
        Dessert dessertVegano2 = new Dessert("Panna cotta vegana ai due cioccolati", 6.5, TemperatureDessertEnum.FREDDO, true );

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


        PrimiPiatti primoPiattoDelGiornoCarne1 = new PrimiPiatti("Pasta al forno besciamella e macinato di carne", 14.0, false,false, true);
        PrimiPiatti primoPiattoDelGiornoCarne2 = new PrimiPiatti("Spaghetti con polpette al sugo",13.0,false,false, true);
        PrimiPiatti primoPiattoDelGiornoCarne3 = new PrimiPiatti("Pasta alla Zozzona",14.0,true,false, true);

        SecondiPiatti secondoPiattoDelGiornoCarne1 = new SecondiPiatti("Maialino arrosto con patate al forno", 16.0,true, true);
        SecondiPiatti secondoPiattoDelGiornoCarne2 = new SecondiPiatti("Filetto in crosta",22.0,true, true);
        SecondiPiatti secondoPiattoDelGiornoCarne3 = new SecondiPiatti("Polpettone con fontina",16.0,true, true);

        PrimiPiatti primoPiattoDelGiornoPesce1 = new PrimiPiatti("Calamarata cozze e vongole", 16.0, false,true, true);
        PrimiPiatti primoPiattoDelGiornoPesce2 = new PrimiPiatti("Paella",18.0,true,false, true);
        PrimiPiatti primoPiattoDelGiornoPesce3 = new PrimiPiatti("Zuppa di pesce",20.0,false,false, true);

        SecondiPiatti secondoPiattoDelGiornoPesce1 = new SecondiPiatti("Calamari ripieni", 18.0,true, true);
        SecondiPiatti secondoPiattoDelGiornoPesce2 = new SecondiPiatti("Carpaccio di pesce spada con salsa verde",18.0,true, true);
        SecondiPiatti secondoPiattoDelGiornoPesce3 = new SecondiPiatti("Spiedini di pesce al forno",18.0,true, true);

        PrimiPiatti primoPiattoDelGiornoVegano1 = new PrimiPiatti("Ceci al curry con riso basmati", 12.0, false,false, true);
        PrimiPiatti primoPiattoDelGiornoVegano2 = new PrimiPiatti("Paccheri con crema di peperoni",12.0,false,false, true);

        SecondiPiatti secondoPiattoDelGiornoVegano1 = new SecondiPiatti("Parmigiana di melanzane vegana", 15.0,true, true);
        SecondiPiatti secondoPiattoDelGiornoVegano2 = new SecondiPiatti("Sformato di verdure vegano",14.0,true, true);

        menuCarne.addPortata(primoPiattoDelGiornoCarne1);
        menuCarne.addPortata(primoPiattoDelGiornoCarne2);
        menuCarne.addPortata(primoPiattoDelGiornoCarne3);
        menuCarne.addPortata(secondoPiattoDelGiornoCarne1);
        menuCarne.addPortata(secondoPiattoDelGiornoCarne2);
        menuCarne.addPortata(secondoPiattoDelGiornoCarne3);

        menuPesce.addPortata(primoPiattoDelGiornoPesce1);
        menuPesce.addPortata(primoPiattoDelGiornoPesce2);
        menuPesce.addPortata(primoPiattoDelGiornoPesce3);
        menuPesce.addPortata(secondoPiattoDelGiornoPesce1);
        menuPesce.addPortata(secondoPiattoDelGiornoPesce2);
        menuPesce.addPortata(secondoPiattoDelGiornoPesce3);

        menuVegan.addPortata(primoPiattoDelGiornoVegano1);
        menuVegan.addPortata(primoPiattoDelGiornoVegano2);
        menuVegan.addPortata(secondoPiattoDelGiornoVegano1);
        menuVegan.addPortata(secondoPiattoDelGiornoVegano2);


        //ristorante.stampaMenuSpecifico(MenuTypeEnum.CARNE, primoPiattoDelGiornoCarne1, secondoPiattoDelGiornoCarne1);
        //ristorante.stampaMenuSpecifico(MenuTypeEnum.PESCE, primoPiattoDelGiornoPesce1, secondoPiattoDelGiornoPesce1);
        //ristorante.stampaMenuSpecifico(MenuTypeEnum.VEGANO, primoPiattoDelGiornoVegano1, secondoPiattoDelGiornoVegano1);

        Bevande_DAO bevandeDao = new Bevande_DAO();

        bevandeDao.printAllBevande();




    }
}
