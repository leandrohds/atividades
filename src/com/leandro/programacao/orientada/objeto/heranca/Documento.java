package com.leandro.programacao.orientada.objeto.heranca;

import java.util.Date;
import java.util.Objects;

public class Documento {

    public enum Tipo {
        PEDIDO, NOTA
    }

    private final Date dataEmissao;
    private Tipo tipo;
    private Double valorTotal;
    private boolean emitido;
    private Cliente cliente;
    private Endereco endereco;

    public void emitir() {
        this.emitido = true;
    }

    public Documento(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Documento(Date dataEmissao, Tipo tipo, Double valorTotal, boolean emitido, Cliente cliente, Endereco endereco) {
        this.dataEmissao = dataEmissao;
        this.tipo = tipo;
        this.valorTotal = valorTotal;
        this.emitido = emitido;
        this.cliente = cliente;
        this.endereco = endereco;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setEmitido(boolean emitido) {
        this.emitido = emitido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "dataEmissao=" + dataEmissao +
                ", tipo=" + tipo +
                ", valorTotal=" + valorTotal +
                ", emitido=" + emitido +
                ", cliente=" + cliente +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return emitido == documento.emitido && Objects.equals(dataEmissao, documento.dataEmissao) && tipo == documento.tipo && Objects.equals(valorTotal, documento.valorTotal) && Objects.equals(cliente, documento.cliente) && Objects.equals(endereco, documento.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataEmissao, tipo, valorTotal, emitido, cliente, endereco);
    }
}
