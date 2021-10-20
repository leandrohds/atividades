package com.leandro.programacao.orientada.objeto.encapsulamento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaNotas {

    public static void main(String[] args) {
        int quantidadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de aluos?"));
        int quantidadeNotas = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de notas?"));
        Map<String, List<Double>> alunosNotas = new HashMap<>();
        List<Double> medias = new ArrayList<>();

        for (int i = 0; i < quantidadeAluno; i++) {
            String nome = JOptionPane.showInputDialog("Insira o nome do aluno");
            List<Double> notas = new ArrayList<>();

            for (int n = 0; n < quantidadeNotas; n++) {
                Double nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno"));

                notas.add(nota);
            }

            alunosNotas.put(nome, notas);
        }

        alunosNotas.forEach((nome, notas) -> {
            Double valorNotas = notas.stream().mapToDouble(Double::doubleValue).sum();
            Double media = valorNotas / notas.size();

            medias.add(media);

            System.out.println(String.format("Nome: %s - %f", nome, media));
        });

        double mediaTurma = medias
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum() / medias.size();

        System.out.println(String.format("Média da Turma: %f", mediaTurma));
    }
}
