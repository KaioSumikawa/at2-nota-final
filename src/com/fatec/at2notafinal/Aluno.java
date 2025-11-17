package com.fatec.at2notafinal;

public class Aluno {
    private String nome;
    private float[] notas;
    private float media;
    private String status;
    
    public Aluno(String nome, float[] notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    public void calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        this.media = soma / notas.length;
    }
    
    public void avaliarStatus() {
        if (media < 6.0) {
            this.status = "Reprovado";
        } else if (media <= 9.0) {
            this.status = "Aprovado";
        } else {
            this.status = "Ótimo Aproveitamento";
        }
    }
    
    public String getNome() { return nome; }
    public float getMedia() { return media; }
    public String getStatus() { return status; }
}