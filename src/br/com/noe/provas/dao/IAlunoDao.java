/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Endereco;
import java.util.List;

/**
 *
 * @author Nilton
 */
public interface IAlunoDao {

    public void cadastrarAluno(Aluno aluno)throws Exception;

    public Aluno buscarAluno(Long id) throws Exception;

    public void atualizarAluno(Aluno aluno) throws Exception;

    public void deletarAluno(Aluno aluno) throws Exception;
    
    public Endereco buscarEnderecoAluno(Long id) throws Exception;

    public List<Aluno> listarAlunos() throws Exception;

}
