package model;

import java.time.LocalDate;

public class Prova {
    private int idProva;
    private LocalDate data;
    private double peso;
    private Turma turma;

    public Prova(int idProva, LocalDate data, double peso, Turma turma) {
        this.idProva = idProva;
        this.data = data;
        this.peso = peso;
        this.turma = turma;
    }

    public int getIdProva() { return idProva; }
    public LocalDate getData() { return data; }
    public double getPeso() { return peso; }
    public Turma getTurma() { return turma; }
}
