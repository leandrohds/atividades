package com.leandro.programacao.orientada.objeto.heranca;

import java.util.Date;
import java.util.Objects;

public class PessoaFisica extends Cliente {

    private String nome;
    private Date dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, Date dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public PessoaFisica(Endereco endereco, Date dataCadastro, String nome, Date dataNascimento, String cpf) {
        super(endereco, dataCadastro);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(nome, that.nome) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, dataNascimento, cpf);
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
