package model;

public class Professor {
    private int idProf;
    private String nome;
    private String email;
    private String telefone;
    private String especialidade;

    public Professor(int idProf, String nome, String email, String telefone, String blackoutEspecialidade) {
        this.idProf = idProf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.especialidade = blackoutEspecialidade;
    }

    public int getIdProf() { return idProf; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
}
