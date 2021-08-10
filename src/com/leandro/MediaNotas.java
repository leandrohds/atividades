package com.leandro;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.round;

public class MediaNotas {

    public static void main(String[] args) {
        Integer quantidadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de aluos?"));

        Map<String, Double> alunosNotas = new HashMap<>();

        for (int i = 0; i < quantidadeAluno; i++) {
            String nome = JOptionPane.showInputDialog("Insira o nome do aluno");
            Double nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno"));

            alunosNotas.put(nome, nota);
        }

        Double valorTodasNotas = alunosNotas
                .values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println(new DecimalFormat("#.##").format(valorTodasNotas / quantidadeAluno));
    }
}
