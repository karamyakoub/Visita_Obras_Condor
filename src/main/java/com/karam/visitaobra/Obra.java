package com.karam.visitaobra;

public class Obra {
    private String cliente,emprendedor,uf,cidade,endereco,bairro,almox,engenheiro,telefone1,telefone2,telefone3,cnpj;
    private double lat,longt;

    public Obra(String cliente, String emprendedor, String uf, String cidade, String endereco, String bairro, String almox, String engenheiro, String telefone1, String telefone2, String telefone3, String cnpj, double lat, double longt) {
        this.cliente = cliente;
        this.emprendedor = emprendedor;
        this.uf = uf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.almox = almox;
        this.engenheiro = engenheiro;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.telefone3 = telefone3;
        this.cnpj = cnpj;
        this.lat = lat;
        this.longt = longt;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(String emprendedor) {
        this.emprendedor = emprendedor;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getAlmox() {
        return almox;
    }

    public void setAlmox(String almox) {
        this.almox = almox;
    }

    public String getEngenheiro() {
        return engenheiro;
    }

    public void setEngenheiro(String engenheiro) {
        this.engenheiro = engenheiro;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongt() {
        return longt;
    }

    public void setLongt(double longt) {
        this.longt = longt;
    }
}
