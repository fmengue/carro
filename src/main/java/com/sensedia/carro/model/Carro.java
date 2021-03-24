package com.sensedia.carro.model;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Carro {
    @Id
    private int id;
    private String cor;
    private String placa;
    private String ano;
    private String modelo;

    public Carro() {
        super();
    }


    public Carro(int id, String cor, String placa, String ano, String modelo) {
        super();
        this.id = id;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "[Carro ID= " + id + "]";
    }

}
