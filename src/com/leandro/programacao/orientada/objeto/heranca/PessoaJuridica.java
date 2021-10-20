package com.leandro.programacao.orientada.objeto.heranca;

import java.util.Date;
import java.util.Objects;

public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String nomeFantasia;
    private final String cnpj;
    private final Date dataRegistro;

    public PessoaJuridica(String cnpj, Date dataRegistro) {
        this.cnpj = cnpj;
        this.dataRegistro = dataRegistro;
    }

    public PessoaJuridica(Endereco endereco, Date dataCadastro, String cnpj, Date dataRegistro) {
        super(endereco, dataCadastro);
        this.cnpj = cnpj;
        this.dataRegistro = dataRegistro;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(razaoSocial, that.razaoSocial) && Objects.equals(nomeFantasia, that.nomeFantasia) && Objects.equals(cnpj, that.cnpj) && Objects.equals(dataRegistro, that.dataRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), razaoSocial, nomeFantasia, cnpj, dataRegistro);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataRegistro=" + dataRegistro +
                '}';
    }
}
