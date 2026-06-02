package controller;

import model.Prova;
import model.Turma;
import java.time.LocalDate;

public class ControladorProva {

    public Prova criarProva(int id, LocalDate data, double peso, Turma turma) {
        if (data == null || peso <= 0) {
            System.out.println("[Erro Controller] Data inválida ou peso deve ser maior que zero!");
            return null;
        }
        System.out.println("[Controller] Criando e associando nova Prova...");
        return new Prova(id, data, peso, turma);
    }
}
