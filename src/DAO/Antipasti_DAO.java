package src.DAO;

import src.enums.SQLConnectorEnum;
import src.portate.Antipasti;
import src.portate.Bevande;

import java.sql.*;

public class Antipasti_DAO {

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

        Statement statement = conn.createStatement();


        String createQuery = """
                CREATE TABLE IF NOT EXISTS Antipasti
                (antipasti_id TINYINT NOT NULL AUTO_INCREMENT,
                  descrizione VARCHAR(30),
                  prezzo DOUBLE,
                  porzione INTEGER,
                  cottura VARCHAR(30),
                  menu_id INTEGER,
                  CONSTRAINT Antipasti_pk PRIMARY KEY (antipasti_id), UNIQUE(descrizione), 
                  FOREIGN KEY (menu_id) REFERENCES Menu (id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella antipasti creata");

    }

    public void insertAntipasti(Antipasti antipasti) throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Antipasti (descrizione, prezzo, porzione, cottura) VALUES ('"  + antipasti.getDescrizione() + "', '" +
                antipasti.getPrezzo() + "', '" +  antipasti.getPorzione() + "' , '" + antipasti.getCottura() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella antipasti popolata");

    }
    //
    public void printAllAntipasti() throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Antipasti;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {

            System.out.println(" descrizione: " + resultSet.getString("descrizione"));
            System.out.println(" prezzo: " + resultSet.getString("prezzo") );
            System.out.println(" porzione: " + resultSet.getString("porzione") );
            System.out.println(" cottura: " + resultSet.getString("cottura") );

        }

        conn.close();

    }

    public void deleteRecord(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM Antipasti WHERE" + whereCondition + ");";

        statement.executeUpdate(deleteQuery);

        conn.close();

        System.out.println("Record cancellato");

    }

    public void updateQueryAntipasti(Double price, Antipasti antipasto) throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from Antipasti;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        Double findPrice = 0.0;
        while (resultSet.next()) {
            String descrizione = resultSet.getString("descrizione");
            Double prezzo = resultSet.getDouble("prezzo");
            if (prezzo.equals(antipasto.getPrezzo())) {
                findPrice = prezzo;

            }
        }

        String updateTable = "" +
                "UPDATE antipasti " +
                "SET prezzo = " + price + " " +
                "WHERE prezzo = " + findPrice + ";";

        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Update prezzo di " + antipasto.getDescrizione());


    }

}
