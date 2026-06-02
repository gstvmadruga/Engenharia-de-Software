package model;

public class Realiza {
    private int idRealiza;
    private double nota;
    private Prova prova;
    private Cursa cursa;

    public Realiza(int idRealiza, double nota, Prova prova, Cursa cursa) {
        this.idRealiza = idRealiza;
        this.nota = nota;
        this.prova = prova;
        this.cursa = cursa;
    }

    public int getIdRealiza() { return idRealiza; }
    public double getNota() { return nota; }
    public Prova getProva() { return prova; }
    public Cursa getCursa() { return cursa; }
}
