package src.enums;

public enum SQLConnectorEnum {
    SQL_ACCESS_STRING("jdbc:mysql://localhost:3306/team2ristorante?user=root&password=Lellipiselli2000");
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


