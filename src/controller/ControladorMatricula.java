package controller;

import model.Cursa;
import model.Aluno;
import model.Turma;
import java.time.LocalDate;

public class ControladorMatricula {

    public Cursa processarMatricula(int idCursa, Aluno aluno, Turma turma) {
        if (aluno == null || turma == null) {
            System.out.println("[Erro Controller] Aluno ou Turma inexistente!");
            return null;
        }
        System.out.println("[Controller] Registrando vínculo de matrícula (Cursa)...");
        return new Cursa(idCursa, LocalDate.now(), aluno, turma);
    }
}
