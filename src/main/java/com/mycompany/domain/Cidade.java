package com.mycompany.domain;

import java.io.Serializable;

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    private long cd_cidade;
    private String nome_cidade;
    private String uf_cidade;

    public Cidade() {
    }

    public Cidade(long cd_cidade, String nome_cidade, String uf_cidade) {
        this.cd_cidade = cd_cidade;
        this.nome_cidade = nome_cidade;
        this.uf_cidade = uf_cidade;
    }

    public long getCd_cidade() {
        return cd_cidade;
    }

    public void setCd_cidade(long cd_cidade) {
        this.cd_cidade = cd_cidade;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public String getUf_cidade() {
        return uf_cidade;
    }

    public void setUf_cidade(String uf_cidade) {
        this.uf_cidade = uf_cidade;
    }
}
