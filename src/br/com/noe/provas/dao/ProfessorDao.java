/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.model.Endereco;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.util.ConnectionFactory;
import br.com.noe.provas.util.PropertiesUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nilton
 */
public class ProfessorDao implements IProfessorDao {

    private Connection con;

    @Override

    public void cadastrarProfessor(Professor professor) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "insert into professor (nome,cpf) values(?,?);";

            PreparedStatement st = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, professor.getNome());
            st.setString(2, professor.getCpf());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            long id = 0;
            if (rs.next()) {
                id = rs.getLong(1);
            }

            sql = "insert into endereco (cidade, bairro,rua, numero,cep ,idprofessor) values (?,?,?,?,?,?);";

            st = con.prepareStatement(sql);
            st.setString(1, professor.getEnd().getCidade());
            st.setString(2, professor.getEnd().getBairro());
            st.setString(3, professor.getEnd().getRua());
            st.setInt(4, professor.getEnd().getNumeroCasa());
            st.setString(5, professor.getEnd().getCep());
            st.setLong(6, id);

            st.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_CADASTRAR_PROFESSOR));
        }
    }

    @Override
    public Professor buscarProfessor(Long id) throws Exception {
        try {
            Professor professor;

            con = ConnectionFactory.getConnection();

            String sql = "select * from professor where id=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Endereco end = buscarEnderecoProfessor(rs.getLong("id"));
                professor = new Professor(rs.getString("nome"), rs.getString("cpf"), end);
                professor.setId(rs.getLong("id"));

                con.close();
                return professor;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_BUSCAR_PROFESSOR));
        }
        return null;
    }

    @Override
    public void atualizarProfessor(Professor professor) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "update professor set nome = ?, cpf=? where id= ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, professor.getNome());
            st.setString(2, professor.getCpf());
            st.setLong(3, professor.getId());

            st.executeUpdate();

            sql = "update endereco set cidade=?,bairro=?, rua= ?,numero=?,cep=? where idprofessor= ?";

            st = con.prepareStatement(sql);

            st.setString(3, professor.getEnd().getCidade());
            st.setString(2, professor.getEnd().getBairro());
            st.setString(3, professor.getEnd().getRua());
            st.setInt(4, professor.getEnd().getNumeroCasa());
            st.setString(5, professor.getEnd().getCep());
            st.setLong(6, professor.getId());

            st.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_EDITAR_PROFESSOR));
        }

    }

    @Override
    public Endereco buscarEnderecoProfessor(Long id) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "select * from endereco where idprofessor=?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Endereco end = new Endereco(rs.getString("cidade"),
                        rs.getString("bairro"),
                        rs.getString("rua"),
                        rs.getString("cep"));
                end.setId(rs.getLong("id"));

                con.close();
                return end;
            }
            con.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_BUSCAR_ENDERECO_PROFESSOR));
        }
    }

    @Override
    public void deletarProfessor(Professor professor) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "delete from professor where id = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, professor.getId());

            st.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_DELETAR_PROFESSOR));
        }
    }

    @Override
    public List<Professor> listarProfessor() throws Exception {
        this.con = ConnectionFactory.getConnection();

        List<Professor> lista = new ArrayList<Professor>();

        String sql = "select * from professor";

        PreparedStatement st = this.con.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Professor professor = buscarProfessor(rs.getLong("id"));
            professor.setId(rs.getLong("id"));
            lista.add(professor);
        }
        con.close();
        return lista;
        }
    }