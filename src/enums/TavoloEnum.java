package src.enums;

public enum TavoloEnum {

    TAVOLO_PER_DUE (2, "tavolo per 2 persone"),
    TAVOLO_PER_QUATTRO (4, "tavolo per 4 persone"),
    TAVOLO_PER_SEI (6, "tavolo per 6 persone"),
    TAVOLO_PER_OTTO (8, "tavolo per 8 persone");


    private int numeroPosti;
    private String descrizione;


    TavoloEnum(int numeroPosti, String descrizione) {
        this.numeroPosti = numeroPosti;
        this.descrizione = descrizione;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPersone(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
}
