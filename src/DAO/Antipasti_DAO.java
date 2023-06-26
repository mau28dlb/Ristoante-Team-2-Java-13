package src.DAO;

import src.enums.SQLConnectorEnum;
import src.portate.Antipasti;
import src.portate.Bevande;

import java.sql.*;

public class Antipasti_DAO {

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");

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
                  FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella antipasti creata");

    }

    public void insertAntipasti(Antipasti antipasti) throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Antipasti (descrizione, prezzo, porzione, cottura) VALUES ('"  + antipasti.getDescrizione() + "', '" +
                antipasti.getPrezzo() + "', '" +  antipasti.getPorzione() + "' , '" + antipasti.getCottura() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella antipasti popolata");

    }
    //
    public void printAllAntipasti() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
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
}
