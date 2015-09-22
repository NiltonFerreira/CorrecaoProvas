/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.test;

import br.com.noe.provas.facade.Facade;
import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Endereco;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;

import java.util.List;

/**
 *
 * @author Nilton
 */
public class CorreçãoProvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();
        //String cidade, String bairro, String rua, String cep
        Endereco endereco = new Endereco("Patos", "Belo Horizonte", "Horacio nobrega", "58704000");
        //String nome, String cpf, Endereco endereco
        Professor professor1 = new Professor("Juca", "10318863580", endereco);
        Professor professor2 = new Professor("Jandira", "21429974691", endereco);
        Professor professor3 = new Professor("Jaco", "32531195602", endereco);
        //String nome, String cpf, Endereco endereco
        Aluno aluno1 = new Aluno("Nilton", "10419972480", endereco);
        Aluno aluno2 = new Aluno("Otto", "20419972480", endereco);
        Aluno aluno3 = new Aluno("Ellan", "30419972480", endereco);
        //String nome, int ano
        Turma turma = new Turma("A", 2015);
        
        /*facade.cadastrarAluno(aluno1);
        facade.cadastrarAluno(aluno2);
        facade.cadastrarAluno(aluno3);
        
        facade.cadastrarProfessor(professor1);
        facade.cadastrarProfessor(professor2);
        facade.cadastrarProfessor(professor3);
        
        facade.cadastrarTurma(turma);*/
        aluno1 = facade.buscarAluno(4l);
        aluno2 = facade.buscarAluno(5l);
        aluno3 = facade.buscarAluno(6l);

        //facade.alocarProfessor(turma, professor1);
        //facade.alocarProfessor(turma, professor2);
        //facade.alocarProfessor(turma, professor3);
        turma = facade.buscarTurma(2l);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        //facade.matricularAluno(turma, aluno1);
        //facade.matricularAluno(turma, aluno2);
        //facade.matricularAluno(turma, aluno3);
    }

}
