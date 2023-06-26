package src;

import src.enums.ColorEnum;
import src.enums.TavoloEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Prenotazione {

    private Integer id;
    private String data;
    private Cliente cliente;
    private String ora;


    public Prenotazione(String data, String ora, Cliente cliente) {
        this.data = data;
        this.ora = ora;
        this.cliente = cliente;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public String getData() {
        return data;
    }

    public void setData(String localDate) {
        this.data = localDate;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
}
