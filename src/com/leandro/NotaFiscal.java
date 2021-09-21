package com.leandro;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotaFiscal {

    public enum Status {
        CADASTRADO("Cadastrado"),
        FATURADO("Faturado"),
        CANCELADO("Cancelado");

        private final String descricao;

        Status(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    private Cliente cliente;
    private Endereco endereco;
    private Date dataCadastro;
    private Integer quantidadeTotal;
    private Double valorTotal;
    private Double pesoTotal;
    private Status status;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.dataCadastro = new Date();
        this.status = Status.CADASTRADO;
    }

    public void faturar() {
        if (this.status != Status.CADASTRADO) {
            return;
        }

        this.status = Status.FATURADO;
    }

    public void cancelar() {
        if (this.status != Status.CADASTRADO) {
            return;
        }

        this.status = Status.CANCELADO;
    }

    public long getDiasCadastrada() {
        long diffInMillies = Math.abs(this.dataCadastro.getTime() - new Date().getTime());

        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setQuantidadeTotal(Integer quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Integer getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public Status getStatus() {
        return status;
    }
}
