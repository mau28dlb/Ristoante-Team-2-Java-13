package src;

import src.enums.TavoloEnum;

import src.enums.TavoloEnum;

public class Tavolo {
        TavoloEnum tavolo;
        String nomeTavolo;

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


}

