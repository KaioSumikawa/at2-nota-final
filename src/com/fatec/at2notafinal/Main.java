package com.fatec.at2notafinal;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno:");
        
        float[] notas = new float[3];
        String[] tiposNotas = {"TP1", "TP2", "TP3"};
        
        for (int i = 0; i < 3; i++) {
            String notaStr = JOptionPane.showInputDialog("Digite a nota " + tiposNotas[i] + ":");
            notas[i] = Float.parseFloat(notaStr);
        }
        
        Aluno aluno = new Aluno(nome, notas);
        aluno.calcularMedia();
        aluno.avaliarStatus();
        
        JOptionPane.showMessageDialog(null, 
            "Aluno: " + aluno.getNome() + "\n" +
            "Notas: TP1=" + notas[0] + ", TP2=" + notas[1] + ", TP3=" + notas[2] + "\n" +
            "Média: " + String.format("%.2f", aluno.getMedia()) + "\n" +
            "Status: " + aluno.getStatus()
        );
    }
}