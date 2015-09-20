/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.util;

import java.util.ResourceBundle;

/**
 *
 * @author Nilton
 */
public class PropertiesUtil {

    private static final String FILE_NAME = "b.com.noe.provas.util.config";

    public static final String KEY_JDBC_URL = "jdbc_url";
    public static final String KEY_JDBC_LOGIN = "jdbc_login";
    public static final String KEY_JDBC_SENHA = "jdbc_senha";

    public static final String MSG_ERRO_CADASTRAR_ALUNO = "msg_erro_cadastrar_aluno";
    public static final String MSG_ERRO_CADASTRAR_PROFESSOR = "msg_erro_cadastrar_professor";
    public static final String MSG_ERRO_CADASTRAR_TURMA = "msg_erro_cadastrar_turma";

    public static final String MSG_ERRO_BUSCAR_ALUNO = "msg_erro_buscar_aluno";
    public static final String MSG_ERRO_BUSCAR_PROFESSOR = "msg_erro_buscar_professor";
    public static final String MSG_ERRO_BUSCAR_TURMA = "msg_erro_buscar_turma";

    public static final String MSG_ERRO_EDITAR_ALUNO = "msg_erro_editar_aluno";
    public static final String MSG_ERRO_EDITAR_PROFESSOR = "msg_erro_editar_professor";
    public static final String MSG_ERRO_EDITAR_TURMA = "msg_erro_editar_turma";

    public static final String MSG_ERRO_DELETAR_ALUNO = "msg_erro_deletar_aluno";
    public static final String MSG_ERRO_DELETAR_PROFESSOR = "msg_erro_deletar_professor";
    public static final String MSG_ERRO_DELETAR_TURMA = "msg_erro_deletar_turma";

    public static final String MSG_ERRO_LISTAR_ALUNO = "msg_erro_listar_aluno";
    public static final String MSG_ERRO_LISTAR_PROFESSOR = "msg_erro_listar_professor";
    public static final String MSG_ERRO_LISTAR_TURMA = "msg_erro_listar_turma";
    
    public static final String MSG_ERRO_ALOCACAO = "msg_erro_alocacao";
    public static final String MSG_ERRO_MATRICULA = "msg_erro_matricular";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(FILE_NAME);

    public static String getStringValue(String key) {
        return bundle.getString(key);
    }

}
