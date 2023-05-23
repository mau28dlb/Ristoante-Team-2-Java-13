package src;

public enum ColorEnum {

    RESET("\u001B[0m", "Resetta un colore usato precedentemente"),
    BLACK("\u001B[30m", "Associa il colore NERO a un valore"),
    RED("\u001B[31m","Associa il colore ROSSO a un valore"),
    GREEN("\u001B[32m", "Associa il colore VERDE a un valore"),
    YELLOW("\u001B[33m", "Associa il colore GIALLO a un valore"),
    BLUE("\u001B[34m", "Associa il colore BLU a un valore"),
    PURPLE("\u001B[35m", "Associa il colore VIOLA a un valore"),
    CYAN("\u001B[36m", "Associa il colore CIANO a un valore"),
    WHITE("\u001B[37m", "Associa il colore BIANCO a un valore");

    private String ansiCode;
    private String descrizione;

    public String get() {
        return ansiCode;
    }
    public String getDescrizione() { return descrizione; }

    ColorEnum(String ansiCode, String descrizione) {
        this.ansiCode = ansiCode;
        this.descrizione = descrizione;
    }
}