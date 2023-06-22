package src.DAO;

import src.portate.PrimiPiatti;
import src.portate.SecondiPiatti;

import java.sql.*;

public class SecondiPiatti_DAO {

        public void createTable() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");

                Statement statement = conn.createStatement();


                String createQuery = """
                        CREATE TABLE IF NOT EXISTS SecondiPiatti
                        (antipasti_id TINYINT NOT NULL AUTO_INCREMENT,
                          descrizione VARCHAR(30),
                          prezzo DOUBLE,
                          isAlwaysAvailable BOOLEAN,
                          isPiattoDelGiorno BOOLEAN,
                          menu_id TINYINT,
                          CONSTRAINT SecondiPiatti_pk PRIMARY KEY (secondipiatti_id), UNIQUE(descrizione), 
                          FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
                        );
                        """;
                statement.executeUpdate(createQuery);

                conn.close();

                System.out.println("Tabella secondi piatti creata");

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public void insertAntipasti(SecondiPiatti secondiPiatti) throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO SecondiPiatti (descrizione, prezzo, isAlwaysAvailable, isPiattoDelGiorno) VALUES ('" + secondiPiatti.getDescrizione() + "', '" +
                    secondiPiatti.getPrezzo() + "', '" + secondiPiatti.isAlwaysAvailable() + "' , '" + secondiPiatti.getIsPiattoDelGiorno() + "');";

            statement.executeUpdate(insertQuery);

            conn.close();

            System.out.println("Tabella secondi popolata");

        }

        //
        public void printAllBevande() throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team2ristorante", "root", "Lellipiselli2000");
            Statement statement = conn.createStatement();

            String printQuery = """
                    SELECT * from SecondiPiatti;
                    """;

            ResultSet resultSet = statement.executeQuery(printQuery);

            int i = 0;

            while (resultSet.next()) {

                System.out.println(" descrizione: " + resultSet.getString("descrizione"));
                System.out.println(" prezzo: " + resultSet.getString("prezzo"));
                System.out.println(" isAlwaysAvailable: " + resultSet.getString("isAlwaysAvailable"));
                System.out.println(" isPiattoDelGiorno: " + resultSet.getString("isPiattoDelGiorno"));

            }

            conn.close();

        }
    }

