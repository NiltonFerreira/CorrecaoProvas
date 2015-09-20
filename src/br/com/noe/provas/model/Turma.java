/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.model;

import java.util.List;

/**
 *
 * @author Nilton
 */
public class Turma {

    private Long id;
    private String nome;
    private int ano;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public Turma(String nome, int ano, List<Professor> professores, List<Aluno> alunos) {
        this.nome = nome;
        this.ano = ano;
        this.professores = professores;
        this.alunos = alunos;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", nome=" + nome + ", ano=" + ano + ", professores=" + professores + ", alunos=" + alunos + '}';
    }


}
