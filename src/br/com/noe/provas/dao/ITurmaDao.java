/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;
import java.util.List;

/**
 *
 * @author Nilton
 */
public interface ITurmaDao {

    public void cadastrarTurma(Turma turma) throws Exception;
    
    public void alocarProfessor (Turma turma, Professor professor) throws Exception;
    
    public void matricularAluno (Turma turma, Aluno aluno) throws Exception;

    public Turma buscarTurma(Long id) throws Exception;

    public void atualizarTurma(Turma turma) throws Exception;

    public void fecharTurma(Turma turma) throws Exception;

    public List<Turma> listarTurmas() throws Exception;
}
