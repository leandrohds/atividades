package com.leandro.programacao.orientada.objeto.heranca;

import java.util.Date;
import java.util.Objects;

public class NotaFiscal extends Documento {

    private Double valorImpostos;

    @Override
    public void emitir() {
        if (valorImpostos >= 0) {
            return;
        }

        super.emitir();
    }

    public NotaFiscal(Date dataEmissao) {
        super(dataEmissao);
    }

    public NotaFiscal(Date dataEmissao, Double valorImpostos) {
        super(dataEmissao);
        this.valorImpostos = valorImpostos;
    }

    public NotaFiscal(Date dataEmissao, Tipo tipo, Double valorTotal, boolean emitido, Cliente cliente, Endereco endereco, Double valorImpostos) {
        super(dataEmissao, tipo, valorTotal, emitido, cliente, endereco);
        this.valorImpostos = valorImpostos;
    }

    public Double getValorImpostos() {
        return valorImpostos;
    }

    public void setValorImpostos(Double valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotaFiscal that = (NotaFiscal) o;
        return Objects.equals(valorImpostos, that.valorImpostos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valorImpostos);
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "valorImpostos=" + valorImpostos +
                '}';
    }
}
