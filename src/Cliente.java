package src;

import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class Cliente {

    private String cognome;
    private Integer numeroPersone;
    private String orarioPrenotazione;

    public Cliente(String cognome, String orarioPrenotazione, Integer numeroPersone ) {
        this.cognome = cognome;
        this.orarioPrenotazione = orarioPrenotazione;
        this.numeroPersone = numeroPersone;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getOrarioPrenotazione() {
        return orarioPrenotazione;
    }

    public void setOrarioPrenotazione(String orarioPrenotazione) {
        this.orarioPrenotazione = orarioPrenotazione;
    }

    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
