package src.DAO;

import src.portate.Antipasti;
import src.portate.Dessert;

import java.sql.*;

public class Dessert_DAO {

    public void createTable() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");

            Statement statement = conn.createStatement();


            String createQuery = """
                    CREATE TABLE IF NOT EXISTS Dessert
                    (antipasti_id TINYINT NOT NULL AUTO_INCREMENT,
                      descrizione VARCHAR(30),
                      prezzo DOUBLE,
                      glutenFree BOOLEAN,
                      temperatura TemperatureDessertEnum,
                      menu_id INTEGER,
                      CONSTRAINT Dessert_pk PRIMARY KEY (dessert_id), UNIQUE(descrizione), 
                      FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
                    );
                    """;
            statement.executeUpdate(createQuery);

            conn.close();

            System.out.println("Tabella dessert creata");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertAntipasti(Dessert dessert) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Antipasti (descrizione, prezzo, glutenFree, temperatura) VALUES ('"  + dessert.getDescrizione() + "', '" +
                dessert.getPrezzo() + "', '" +  dessert.isGlutenFree() + "' , '" + dessert.getTemperatura() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella dessert popolata");

    }
    //
    public void printAllBevande() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
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

}
