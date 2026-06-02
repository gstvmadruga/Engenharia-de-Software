package controller;

import model.Turma;
import model.Disciplina;
import model.Professor;

public class ControladorTurma {

    public Turma cadastrarTurma(int id, String sem, int ano, Disciplina disc, Professor prof) {
        if (disc == null || prof == null) {
            System.out.println("[Erro Controller] Disciplina ou Professor inválido!");
            return null;
        }
        System.out.println("[Controller] Validando dados da nova Turma...");
        return new Turma(id, sem, ano, disc, prof);
    }
}
