package src.enums;

public enum SQLConnectorEnum {
    DB_URL("jdbc:mysql://localhost:3306/team2ristorante"),
    DB_USER("root"),
    DB_PASS("Lellipiselli2000");


    private String value;

    SQLConnectorEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


