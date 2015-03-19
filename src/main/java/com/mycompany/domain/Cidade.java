package com.mycompany.domain;

import java.io.Serializable;

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    private long cdCidade;
    private String nomeCidade;
    private String ufCidade;

    public Cidade() {
    }

    public Cidade(long cdCidade, String nomeCidade, String ufCidade) {
        this.cdCidade = cdCidade;
        this.nomeCidade = nomeCidade;
        this.ufCidade = ufCidade;
    }

    public long getCdCidade() {
        return cdCidade;
    }

    public void setCdCidade(long cdCidade) {
        this.cdCidade = cdCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }
}
