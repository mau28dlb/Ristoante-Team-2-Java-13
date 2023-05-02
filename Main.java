public class Main {
    public static void main(String[] args) {

        Antipasti antipasto1 = new Antipasti("Bruschette", 1);
        Antipasti antipasto2 = new Antipasti("Prosciutto", 2);
        Antipasti antipasto3 = new Antipasti("Tortine Salate", 3);
        Antipasti antipasto4 = new Antipasti("Burrata", 3);

        Dessert dessert1 = new Dessert("Tiramisù", 8);
        Dessert dessert2 = new Dessert("Tarallo Aviglianese", 7);
        Dessert dessert3 = new Dessert("Sbriciolata al Castagnaccio", 8);
        Dessert dessert4 = new Dessert("Creme brulée", 5);
        Dessert dessert5 = new Dessert("Sorbetto al limone ", 3);

        System.out.println("Antipasti");
        antipasto1.printAntipasti();
        antipasto2.printAntipasti();
        antipasto3.printAntipasti();
        antipasto4.printAntipasti();
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



    }
}
