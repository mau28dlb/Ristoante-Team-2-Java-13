package src.enums;

public enum TemperatureDessertEnum {
    SEMI_FREDDO (" Dessert semi-freddo"),
    CALDO (" Dessert servito caldo"),
    FREDDO (" Dessert servito freddo");


    private String descrizione;


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    TemperatureDessertEnum(String descrizione) {
        this.descrizione = descrizione;
    }
}
