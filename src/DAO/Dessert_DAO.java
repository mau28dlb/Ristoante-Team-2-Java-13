package src.DAO;

import src.enums.SQLConnectorEnum;
import src.portate.Antipasti;
import src.portate.Dessert;

import java.sql.*;

public class Dessert_DAO {

    public void createTable() throws SQLException {

            Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

            Statement statement = conn.createStatement();


            String createQuery = """
                    CREATE TABLE IF NOT EXISTS Dessert
                    (dessert_id TINYINT NOT NULL AUTO_INCREMENT,
                      descrizione VARCHAR(30),
                      prezzo DOUBLE,
                      glutenFree BOOLEAN,
                      temperatura VARCHAR(30),
                      menu_id INTEGER,
                      CONSTRAINT Dessert_pk PRIMARY KEY (dessert_id), UNIQUE(descrizione), 
                      FOREIGN KEY (menu_id) REFERENCES Menu (id)
                    );
                    """;
            statement.executeUpdate(createQuery);

            conn.close();

            System.out.println("Tabella dessert creata");

    }

    public void insertDessert(Dessert dessert) throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Antipasti (descrizione, prezzo, glutenFree, temperatura) VALUES ('"  + dessert.getDescrizione() + "', '" +
                dessert.getPrezzo() + "', '" +  dessert.isGlutenFree() + "' , '" + dessert.getTemperatura() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella dessert popolata");

    }
    //
    public void printAllDessert() throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Dessert;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {

            System.out.println(" descrizione: " + resultSet.getString("descrizione"));
            System.out.println(" prezzo: " + resultSet.getString("prezzo") );
            System.out.println(" glutenFree: " + resultSet.getString("glutenFree") );
            System.out.println(" temperatura: " + resultSet.getString("temperatura") );

        }

        conn.close();

    }

    public void deleteRecord(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM Dessert WHERE" + whereCondition + ");";

        statement.executeUpdate(deleteQuery);

        conn.close();

        System.out.println("Record cancellato");

    }

}
