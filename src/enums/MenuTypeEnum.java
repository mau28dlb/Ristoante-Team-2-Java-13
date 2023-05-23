package src.enums;

public enum MenuTypeEnum {

    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGANO("Menù vegano");

    private String descrizione;
    public String getDescrizione() { return descrizione; }

    MenuTypeEnum(String descrizione) {
        this.descrizione = descrizione;
    }
}