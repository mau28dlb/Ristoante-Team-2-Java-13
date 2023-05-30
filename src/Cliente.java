package src;

import java.time.LocalTime;

public class Cliente {

    private String cognome;
    private Integer numeroPersone;
    private LocalTime orarioPrenotazione;

    public Cliente(String cognome, LocalTime orarioPrenotazione, Integer numeroPersone ) {
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

    public LocalTime getOrarioPrenotazione() {
        return orarioPrenotazione;
    }

    public void setOrarioPrenotazione(LocalTime orarioPrenotazione) {
        this.orarioPrenotazione = orarioPrenotazione;
    }

    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
