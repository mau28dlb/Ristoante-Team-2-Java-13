package src;

import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class Cliente {

    protected Integer ID;
    private String cognome;
    private Integer numeroPersone;


    public Cliente(String cognome, Integer numeroPersone ) {
        this.cognome = cognome;
        this.numeroPersone = numeroPersone;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
