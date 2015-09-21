/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.util;

import br.com.noe.provas.dao.AlunoDao;
import br.com.noe.provas.dao.IAlunoDao;
import br.com.noe.provas.dao.IProfessorDao;
import br.com.noe.provas.dao.ITurmaDao;
import br.com.noe.provas.dao.ProfessorDao;
import br.com.noe.provas.dao.TurmaDao;

/**
 *
 * @author Nilton
 */
public class DaoFactory {

    public static IAlunoDao createAlunoDao() {
        return new AlunoDao();
    }

    public static IProfessorDao createProfessorDao() {
        return new ProfessorDao();
    }

    public static ITurmaDao createTurmaDao() throws Exception {
        return new TurmaDao();
    }

}
