/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.model;

/**
 *
 * @author Nilton
 */
public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, Endereco endereco) {
        super(nome,cpf,endereco);
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
