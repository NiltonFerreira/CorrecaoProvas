/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.test;

import br.com.noe.provas.facade.Facade;
import br.com.noe.provas.model.Turma;
import static java.time.Clock.system;

/**
 *
 * @author Nilton
 */
public class CorreçãoProvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Facade face = new Facade();
        
        Turma turma = new Turma("A",2015);
        Turma turma2 = new Turma("B",2015);
        Turma turma3 = new Turma("C",2015);
        Turma turma4 = new Turma("D",2015);
        Turma turma5 = new Turma("E",2015);
        Turma turma6 = new Turma("F",2015);
        
        face.cadastrarTurma(turma);
        face.cadastrarTurma(turma2);
        face.cadastrarTurma(turma3);
        face.cadastrarTurma(turma4);
        face.cadastrarTurma(turma5);
        face.cadastrarTurma(turma6);
        
        System.out.println(face.listarTurmas());
    }

}
