package com.leandro.programacao.orientada.objeto.heranca;

import java.util.Date;
import java.util.Objects;

public class Cliente {

    private Endereco endereco;
    private Date dataCadastro;

    public Cliente() {
    }

    public Cliente(Endereco endereco, Date dataCadastro) {
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "endereco=" + endereco +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(endereco, cliente.endereco) && Objects.equals(dataCadastro, cliente.dataCadastro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endereco, dataCadastro);
    }
}
