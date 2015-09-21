/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.model.Endereco;
import br.com.noe.provas.model.Professor;
import java.util.List;

/**
 *
 * @author Nilton
 */
public interface IProfessorDao {

    public void cadastrarProfessor(Professor professor);

    public Professor buscarProfessor(Long id) throws Exception;

    public void atualizarProfessor(Professor professor) throws Exception;

    public Endereco buscarEnderecoProfessor(Long id) throws Exception;

    public void deletarProfessor(Professor professor) throws Exception;

    public List<Professor> listarProfessor() throws Exception;
}
