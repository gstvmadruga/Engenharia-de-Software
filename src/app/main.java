package app;

import model.*;
import controller.*;
import view.MensagemView;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIALIZANDO SISTEMA - UNIVERSIDADE GHFLUSÃO ---\n");

        // 1. Inicializando componentes globais (Views e Controllers)
        MensagemView view = new MensagemView();
        ControladorTurma ctrlTurma = new ControladorTurma();
        ControladorProva ctrlProva = new ControladorProva();
        ControladorMatricula ctrlMatricula = new ControladorMatricula();

        // 2. Criando instâncias base do Modelo
        Disciplina engSoftware = new Disciplina(10, "Engenharia de Software");
        Professor profGustavo = new Professor(1, "Gustavo de Madruga", "gustavo@unilasalle.edu.br", "21999999", "Engenharia de Software");
        Aluno alunoCarlos = new Aluno(202501, "Carlos Augusto", "carlos@aluno.unilasalle.edu.br", "21988888", "Niterói", LocalDate.of(2003, 5, 15));

        // 3. Executando fluxos controlados pelo MVC

        // Fluxo A: Cadastrar Turma
        Turma turmaES = ctrlTurma.cadastrarTurma(101, "2º Semestre", 2025, engSoftware, profGustavo);
        if(turmaES != null) view.exibirSucesso("Turma de " + turmaES.getDisciplina().getNome() + " criada com sucesso!");

        // Fluxo B: Matricular Aluno (Cursa)
        Cursa matricula = ctrlMatricula.processarMatricula(5001, alunoCarlos, turmaES);
        if(matricula != null) view.exibirSucesso("Aluno " + matricula.getAluno().getNome() + " matriculado na turma " + matricula.getTurma().getIdTurma());

        // Fluxo C: Cadastrar Prova
        LocalDate dataProva = LocalDate.of(2025, 11, 10);
        Prova prova1 = ctrlProva.criarProva(301, dataProva, 4.0, turmaES);
        if(prova1 != null) view.exibirSucesso("Prova agendada para: " + prova1.getData() + " com peso " + prova1.getPeso());
    }
}
