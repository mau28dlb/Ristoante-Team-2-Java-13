package src;

import src.enums.TavoloEnum;

import src.enums.TavoloEnum;

public class Tavolo {
    private Integer id;
    private TavoloEnum tavolo;
    private String nomeTavolo;


    public Tavolo(TavoloEnum tavolo, String nomeTavolo) {
            this.tavolo = tavolo;
            this.nomeTavolo = nomeTavolo;
        }

    public TavoloEnum getTavolo() {
            return tavolo;
        }

    public void setTavolo(TavoloEnum tavolo) {
            this.tavolo = tavolo;
        }

    public String getNomeTavolo() {
        return nomeTavolo;
    }

    public void setNomeTavolo(String nomeTavolo) {
        this.nomeTavolo = nomeTavolo;
    }
}

