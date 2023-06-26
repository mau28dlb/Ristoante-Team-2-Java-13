package src.DAO;

import src.enums.SQLConnectorEnum;
import src.portate.Antipasti;
import src.portate.PrimiPiatti;

import java.sql.*;

public class PrimiPiatti_DAO {

    public void createTable() throws SQLException {

            Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());

            Statement statement = conn.createStatement();


            String createQuery = """
                    CREATE TABLE IF NOT EXISTS PrimiPiatti
                    (antipasti_id TINYINT NOT NULL AUTO_INCREMENT,
                      descrizione VARCHAR(30),
                      prezzo DOUBLE,
                      isMinimoPerDuePersone BOOLEAN,
                      isPastaFresca BOOLEAN,
                      isPiattoDelGiorno BOOLEAN,
                      menu_id TINYINT,
                      CONSTRAINT PrimiPiatti_pk PRIMARY KEY (primipiatti_id), UNIQUE(descrizione), 
                      FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
                    );
                    """;
            statement.executeUpdate(createQuery);

            conn.close();

            System.out.println("Tabella primi piatti creata");

    }

    public void insertPrimiPiatti(PrimiPiatti primiPiatti) throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO PrimiPiatti (descrizione, prezzo, isMinimoPerDuePersone, isPastaFresca, isPiattoDelGiorno) VALUES ('"  + primiPiatti.getDescrizione() + "', '" +
                primiPiatti.getPrezzo() + "', '" + primiPiatti.getIsMinimoPerDuePersone() + "' , '" + primiPiatti.getIsPastaFresca() + "' , '" + primiPiatti.getIsPiattoDelGiorno() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella primi popolata");

    }
    //
    public void printAllPrimiPiatti() throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from PrimiPiatti;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {

            System.out.println(" descrizione: " + resultSet.getString("descrizione"));
            System.out.println(" prezzo: " + resultSet.getString("prezzo") );
            System.out.println(" isMinimoPerDuePersone: " + resultSet.getString("isMinimoPerDuePersone") );
            System.out.println(" isPastaFresca: " + resultSet.getString("isPastaFresca") );
            System.out.println(" isPiattoDelGiorno: " + resultSet.getString("isPiattoDelGiorno") );

        }

        conn.close();

    }
}


