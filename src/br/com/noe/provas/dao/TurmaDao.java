/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.facade.Facade;
import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;
import br.com.noe.provas.util.ConnectionFactory;
import br.com.noe.provas.util.PropertiesUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nilton
 */
public class TurmaDao implements ITurmaDao {

    private ConnectionFactory connection;
    private java.sql.Connection con;

    public TurmaDao() throws Exception {
       /* List<Turma> lista = listarTurmas();
        ListarAlunosTurma(lista);
        ListarProfessorTurma(lista);*/
    }

    @Override
    public void cadastrarTurma(Turma turma) throws Exception {
        try {
            PreparedStatement st;
            String sql;

            con = ConnectionFactory.getConnection();

            sql = "insert into turma (nome, ano) values (?,?)";

            st = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, turma.getNome());
            st.setInt(2, turma.getAno());

            st.executeUpdate();

            ResultSet result = st.getGeneratedKeys();

            if (result.next()) {
                turma.setId(result.getLong(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.MSG_ERRO_CADASTRAR_TURMA);
        }
    }

    @Override
    public void alocarProfessor(Turma turma, Professor professor) throws Exception {
        try {
            PreparedStatement st;
            String sql;

            con = ConnectionFactory.getConnection();

            sql = "insert into alocacao (idturma, idprofessor) values (?,?)";

            st = con.prepareStatement(sql);

            st.setLong(1, turma.getId());
            st.setLong(2, professor.getId());

            st.executeUpdate();
            con.close();

            List<Professor> lista = turma.getProfessores();
            int tamanho = lista.size();
            if (tamanho == 0) {
                lista.set(0, professor);
            } else {
                lista.set(tamanho + 1, professor);
            }
            turma.setProfessores(lista);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_ALOCACAO));

        }
    }

    @Override
    public void matricularAluno(Turma turma, Aluno aluno) throws Exception {
        try {
            PreparedStatement st;
            String sql;

            con = ConnectionFactory.getConnection();

            sql = "update aluno set nome=?,cpf=?,idturma=? where id=?";

            st = con.prepareStatement(sql);

            st.setString(1, aluno.getNome());
            st.setString(2, aluno.getCpf());
            st.setLong(3, turma.getId());
            st.setLong(4, aluno.getId());

            st.executeUpdate();
            con.close();

            List<Aluno> lista = turma.getAlunos();
            int tamanho = lista.size();
            if (tamanho == 0) {
                lista.set(0, aluno);
            } else {
                lista.set(tamanho + 1, aluno);
            }
            turma.setAlunos(lista);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_MATRICULA));

        }
    }

    @Override
    public Turma buscarTurma(Long id) throws Exception {
        try {
            Turma turma;

            con = ConnectionFactory.getConnection();

            String sql = "select * from turma where id=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                turma = new Turma(rs.getString("nome"), rs.getInt("ano"));
                turma.setId(rs.getLong("id"));

                con.close();
                return turma;
            }
            con.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_BUSCAR_TURMA));
        }
    }

    @Override
    public void editarTurma(Turma turma) throws Exception {
        try {
            PreparedStatement st;
            String sql;

            con = ConnectionFactory.getConnection();

            sql = "update turma set nome=?, ano=? where id=?";

            st = con.prepareStatement(sql);

            st.setString(1, turma.getNome());
            st.setInt(2, turma.getAno());
            st.setLong(3, turma.getId());

            st.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_EDITAR_TURMA));
        }
    }

    @Override
    public void fecharTurma(Turma turma) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "delete from turma where id = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, turma.getId());

            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_DELETAR_TURMA));
        }
    }

    @Override
    public List<Turma> listarTurmas() throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            List<Turma> lista = new ArrayList<Turma>();

            String sql = "select * from turma";

            PreparedStatement st = this.con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Turma turma = new Turma(rs.getString("nome"), rs.getInt("ano"));
                turma.setId(rs.getLong("id"));
                lista.add(turma);
            }
            con.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_EDITAR_TURMA));
        }
    }

    @Override
    public void ListarAlunosTurma(List<Turma> turmas) throws Exception {
        try {
            Facade facade = new Facade();
            con = ConnectionFactory.getConnection();

            List<Aluno> lista = new ArrayList<Aluno>();

            String sql = "select * from aluno where idturma=?";

            PreparedStatement st = this.con.prepareStatement(sql);
            for (Turma turma : turmas) {

                st.setLong(1, turma.getId());

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Aluno aluno = facade.buscarAluno(rs.getLong("id"));
                    lista.add(aluno);
                }
                turma.setAlunos(lista);
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_ASSOCIACAO_ALUNO));
        }
    }

    @Override
    public void ListarProfessorTurma(List<Turma> turmas) throws Exception {

        try {
            Facade facade = new Facade();
            con = ConnectionFactory.getConnection();

            List<Professor> lista = new ArrayList<Professor>();

            String sql = "select * from alocacao where idturma=?";

            PreparedStatement st = this.con.prepareStatement(sql);
            for (Turma turma : turmas) {
                st.setLong(1, turma.getId());

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Professor professor = facade.buscarProfessor(rs.getLong("idprofessor"));
                    lista.add(professor);
                }
                buscarTurma(turma.getId()).setProfessores(lista);
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_ASSOCIACAO_PROFESSOR));
        }

    }
}
