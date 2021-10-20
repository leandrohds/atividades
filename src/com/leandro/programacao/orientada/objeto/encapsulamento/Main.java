package com.leandro.programacao.orientada.objeto.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fátima e Beatriz Informática ME", "18.091.664/0001-79");
        Endereco endereco = new Endereco("530", "Rua João Francisco Carrara", "Jardim Nova Poá", "Poá", "SP");

        NotaFiscal notaFiscal = new NotaFiscal(cliente);
        notaFiscal.faturar();
        System.out.println(notaFiscal.getStatus().getDescricao());
        System.out.println(notaFiscal.getDiasCadastrada());

        NotaFiscal notaFiscal2 = new NotaFiscal(cliente);
        notaFiscal2.cancelar();
        System.out.println(notaFiscal2.getStatus().getDescricao());

        notaFiscal2.setEndereco(endereco);
        System.out.println(notaFiscal2.getEndereco().toString());
    }
}
