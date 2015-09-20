/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.facade;

import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;
import java.util.List;

/**
 *
 * @author Nilton
 */
public interface IFacade {

    public void cadastrarTurma(Turma turma) throws Exception;

    public Turma buscarTurma(Long id) throws Exception;

    public void atualizarTurma(Turma turma) throws Exception;

    public void fecharTurma(Turma turma) throws Exception;

    public List<Turma> listarTurmas() throws Exception;
//...............................................................................

    public void cadastrarAluno(Aluno aluno);

    public Aluno buscarAluno(Long id) throws Exception;

    public void atualizarAluno(Aluno aluno) throws Exception;

    public void deletarAluno(Aluno aluno) throws Exception;

    public List<Aluno> listarAlunos() throws Exception;
//...............................................................................

    public void cadastrarProfessor(Professor professor);

    public Professor buscarProfessor(Long id) throws Exception;

    public void atualizarProfessor(Professor professor) throws Exception;

    public void deletarProfessor(Professor professor) throws Exception;

    public List<Professor> listarProfessor() throws Exception;
}
