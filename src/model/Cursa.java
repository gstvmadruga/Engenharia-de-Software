package model;

import java.time.LocalDate;

public class Cursa {
    private int idCursa;
    private LocalDate dtMatricula;
    private Aluno aluno;
    private Turma turma;

    public Cursa(int idCursa, LocalDate dtMatricula, Aluno aluno, Turma turma) {
        this.idCursa = idCursa;
        this.dtMatricula = dtMatricula;
        this.aluno = aluno;
        this.turma = turma;
    }

    public int getIdCursa() { return idCursa; }
    public Aluno getAluno() { return aluno; }
    public Turma getTurma() { return turma; }
}
