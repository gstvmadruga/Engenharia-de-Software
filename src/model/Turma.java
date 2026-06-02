package model;

public class Turma {
    private int idTurma;
    private String semestre;
    private int ano;
    private Disciplina disciplina;
    private Professor professor;

    public Turma(int idTurma, String semestre, int ano, Disciplina disciplina, Professor professor) {
        this.idTurma = idTurma;
        this.semestre = semestre;
        this.ano = ano;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getIdTurma() { return idTurma; }
    public String getSemestre() { return semestre; }
    public int getAno() { return ano; }
    public Disciplina getDisciplina() { return disciplina; }
    public Professor getProfessor() { return professor; }
}
