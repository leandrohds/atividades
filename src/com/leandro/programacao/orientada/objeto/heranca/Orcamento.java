package com.leandro.programacao.orientada.objeto.heranca;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class Orcamento extends Documento {

    private Date dataValidade;

    @Override
    public void emitir() {
        if (Date.from(Instant.now()).before(dataValidade)) {
            return;
        }

        super.emitir();
    }

    public Orcamento(Date dataEmissao) {
        super(dataEmissao);
    }

    public Orcamento(Date dataEmissao, Date dataValidade) {
        super(dataEmissao);
        this.dataValidade = dataValidade;
    }

    public Orcamento(Date dataEmissao, Tipo tipo, Double valorTotal, boolean emitido, Cliente cliente, Endereco endereco, Date dataValidade) {
        super(dataEmissao, tipo, valorTotal, emitido, cliente, endereco);
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orcamento orcamento = (Orcamento) o;
        return Objects.equals(dataValidade, orcamento.dataValidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataValidade);
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "dataValidade=" + dataValidade +
                '}';
    }
}
