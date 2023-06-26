package src.DAO;


import src.enums.SQLConnectorEnum;
import src.portate.Bevande;
import src.portate.Portata;

import java.sql.*;

public class Bevande_DAO {


    public void createTable() throws SQLException {

            Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

            Statement statement = conn.createStatement();


            String createQuery = """
                    CREATE TABLE IF NOT EXISTS Bevande
                    (bevande_id INT NOT NULL AUTO_INCREMENT,
                      descrizione VARCHAR(30),
                      prezzo DOUBLE,
                      gradazioneAlcolica VARCHAR(25),
                      menu_id INT,
                      CONSTRAINT Bevande_pk PRIMARY KEY (bevande_id), UNIQUE(descrizione),
                      FOREIGN KEY (menu_id) REFERENCES Menu (id)
                    );
                    """;
            statement.executeUpdate(createQuery);

            conn.close();

            System.out.println("Tabella bevande creata");

    }

        public void insertBevande(Bevande bevande) throws SQLException {

        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO Bevande (descrizione, prezzo, gradazioneAlcolica) VALUES ('"  + bevande.getDescrizione() + "', '" +
                bevande.getPrezzo() + "', '" +  bevande.getGradazioneAlcolica() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella bevande popolata");

    }
//
    public void printAllBevande() throws SQLException {
        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Bevande;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {

            System.out.println(" descrizione: " + resultSet.getString("descrizione"));
            System.out.println(" prezzo: " + resultSet.getString("prezzo") );
            System.out.println(" gradazioneAlcolica: " + resultSet.getString("gradazioneAlcolica") );

        }

        conn.close();

    }

    public void deleteRecord(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(SQLConnectorEnum.DB_URL.getValue(), SQLConnectorEnum.DB_USER.getValue(), SQLConnectorEnum.DB_PASS.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM Bevande WHERE" + whereCondition + ");";

        statement.executeUpdate(deleteQuery);

        conn.close();

        System.out.println("Record cancellato");

    }
//
//    public void updateQuery() throws SQLException {
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
//        Statement statement = conn.createStatement();
//        String printQuery = """
//                  SELECT * from Bevande;
//
//                """;
//        ResultSet resultSet = statement.executeQuery(printQuery);
//
//        String findPrezzo = null;
//        while (resultSet.next()) {
//            String descrizione = resultSet.getString("descrizione");
//            String prezzo = resultSet.getString("prezzo");
//            if (prezzo.equals(5)) {
//                findPrezzo = prezzo;
//            }
//        }
//        String updateTable = """
//                UPDATE Bevande
//                SET prezzo = 5.5
//                WHERE prezzo = '""" + findPrezzo + "';";
//
//        statement.executeUpdate(updateTable);
//
//        conn.close();
//        System.out.println("Update prezzo" +findPrezzo);


    //}
}
