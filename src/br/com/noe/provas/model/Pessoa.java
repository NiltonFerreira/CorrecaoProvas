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
public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private Endereco end;

    public Pessoa(String nome, String cpf, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }

    public Pessoa() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", end=" + end + '}';
    }

}
