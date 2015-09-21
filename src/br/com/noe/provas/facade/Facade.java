/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.facade;

import br.com.noe.provas.dao.IAlunoDao;
import br.com.noe.provas.dao.IProfessorDao;
import br.com.noe.provas.dao.ITurmaDao;
import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Endereco;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;
import br.com.noe.provas.util.DaoFactory;
import java.util.List;

/**
 *
 * @author Nilton
 */
public class Facade implements IFacade {

    private IAlunoDao alunoDao;
    private IProfessorDao professorDao;
    private ITurmaDao turmaDao;

    public Facade() throws Exception {
        alunoDao = DaoFactory.createAlunoDao();
        professorDao = DaoFactory.createProfessorDao();
        turmaDao = DaoFactory.createTurmaDao();
    }

    @Override
    public void cadastrarTurma(Turma turma) throws Exception {
        turmaDao.cadastrarTurma(turma);
    }

    @Override
    public Turma buscarTurma(Long id) throws Exception {
        return turmaDao.buscarTurma(id);
    }

    @Override
    public void editarTurma(Turma turma) throws Exception {
        turmaDao.editarTurma(turma);
    }

    @Override
    public void fecharTurma(Turma turma) throws Exception {
        turmaDao.fecharTurma(turma);
    }

    @Override
    public List<Turma> listarTurmas() throws Exception {
        return turmaDao.listarTurmas();
    }

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunoDao.cadastrarAluno(aluno);
    }

    @Override
    public Aluno buscarAluno(Long id) throws Exception {
        return alunoDao.buscarAluno(id);
    }

    @Override
    public void atualizarAluno(Aluno aluno) throws Exception {
        alunoDao.atualizarAluno(aluno);
    }

    @Override
    public void deletarAluno(Aluno aluno) throws Exception {
        alunoDao.deletarAluno(aluno);
    }

    @Override
    public List<Aluno> listarAlunos() throws Exception {
        return alunoDao.listarAlunos();
    }

    @Override
    public void cadastrarProfessor(Professor professor) {
        professorDao.cadastrarProfessor(professor);
    }

    @Override
    public Professor buscarProfessor(Long id) throws Exception {
        return professorDao.buscarProfessor(id);
    }

    @Override
    public void atualizarProfessor(Professor professor) throws Exception {
        professorDao.atualizarProfessor(professor);
    }

    @Override
    public void deletarProfessor(Professor professor) throws Exception {
        professorDao.deletarProfessor(professor);
    }

    @Override
    public List<Professor> listarProfessor() throws Exception {
        return professorDao.listarProfessor();
    }

    @Override
    public Endereco buscarEnderecoAluno(Long id) throws Exception {
        return alunoDao.buscarEnderecoAluno(id);
    }

    @Override
    public void alocarProfessor(Turma turma, Professor professor) throws Exception {
        turmaDao.alocarProfessor(turma, professor);
    }

    @Override
    public void matricularAluno(Turma turma, Aluno aluno) throws Exception {
        turmaDao.matricularAluno(turma, aluno);
    }

    @Override
    public void ListarAlunosTurma(List<Turma> turmas) throws Exception {
        turmaDao.ListarAlunosTurma(turmas);
    }

    @Override
    public void ListarProfessorTurma(List<Turma> turmas) throws Exception {
        turmaDao.ListarProfessorTurma(turmas);
    }

    @Override
    public Endereco buscarEnderecoProfessor(Long id) throws Exception {
        return professorDao.buscarEnderecoProfessor(id);
    }

}
