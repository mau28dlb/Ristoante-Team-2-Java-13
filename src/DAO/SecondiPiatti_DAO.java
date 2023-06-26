package src.DAO;

import src.enums.SQLConnectorEnum;
import src.portate.PrimiPiatti;
import src.portate.SecondiPiatti;

import java.sql.*;

public class SecondiPiatti_DAO {

        public void createTable() throws SQLException {


                Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());

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

        }

        public void insertSecondiPiatti(SecondiPiatti secondiPiatti) throws SQLException {
            Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO SecondiPiatti (descrizione, prezzo, isAlwaysAvailable, isPiattoDelGiorno) VALUES ('" + secondiPiatti.getDescrizione() + "', '" +
                    secondiPiatti.getPrezzo() + "', '" + secondiPiatti.isAlwaysAvailable() + "' , '" + secondiPiatti.getIsPiattoDelGiorno() + "');";

            statement.executeUpdate(insertQuery);

            conn.close();

            System.out.println("Tabella secondi popolata");

        }

        //
        public void printAllSecondiPiatti() throws SQLException {
            Connection conn = DriverManager.getConnection(SQLConnectorEnum.SQL_ACCESS_STRING.getValue());
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

