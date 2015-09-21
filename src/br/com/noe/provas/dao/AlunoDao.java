/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.dao;

import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Endereco;
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
public class AlunoDao implements IAlunoDao {

    private Connection con;

    /**
     *
     * @param aluno
     * @throws Exception
     */
    @Override
    public void cadastrarAluno(Aluno aluno) throws Exception {
        try {
            con = ConnectionFactory.getConnection();

            String sql = "insert into aluno (nome,cpf) values(?,?);";

            PreparedStatement st = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, aluno.getNome());
            st.setString(1, aluno.getCpf());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            long id = 0;
            if (rs.next()) {
                id = rs.getLong(1);
            }

            sql = "insert into endereco (cidade, bairro,rua, numero,cep ,idaluno) values (?,?,?,?,?,?);";

            st = con.prepareStatement(sql);
            st.setString(1, aluno.getEnd().getCidade());
            st.setString(2, aluno.getEnd().getBairro());
            st.setString(3, aluno.getEnd().getRua());
            st.setInt(4, aluno.getEnd().getNumeroCasa());
            st.setString(5, aluno.getEnd().getCep());
            st.setLong(6, id);

            st.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_CADASTRAR_ALUNO));
        }

    }

    @Override
    public Aluno buscarAluno(Long id) throws Exception {
        try {
            Aluno aluno = new Aluno();

            con = ConnectionFactory.getConnection();

            String sql = "select * from aluno where id=?;";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                Endereco end = buscarEnderecoAluno(rs.getLong("id"));
                aluno.setId(rs.getLong("id"));
                aluno = new Aluno(nome, cpf, end);

                con.close();
                return aluno;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_BUSCAR_ALUNO));
        }
        return null;
    }

    @Override
    public void atualizarAluno(Aluno aluno) throws Exception {
        try {
            // obtem conexão
            con = ConnectionFactory.getConnection();

            // define comando sql
            String sql = "update aluno set nome = ?, cpf=? where id= ?";

            // "prepara" comando a ser executado
            PreparedStatement st = con.prepareStatement(sql);

            // preenche o statement
            st.setString(1, aluno.getNome());
            st.setString(2, aluno.getCpf());
            st.setLong(3, aluno.getId());

            // execute o comando
            st.executeUpdate();

            sql = "update endereco set cidade=?,bairro=?, rua= ?,numero=?,cep=? where idaluno= ?";

            st = con.prepareStatement(sql);

            st.setString(3, aluno.getEnd().getCidade());
            st.setString(2, aluno.getEnd().getBairro());
            st.setString(3, aluno.getEnd().getRua());
            st.setInt(4, aluno.getEnd().getNumeroCasa());
            st.setString(5, aluno.getEnd().getCep());
            st.setLong(6, aluno.getId());

            st.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_EDITAR_ALUNO));
        }

    }

    @Override
    public void deletarAluno(Aluno aluno) throws Exception {
        try {

            con = ConnectionFactory.getConnection();

            String sql = "delete from aluno where id = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, aluno.getId());

            st.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(PropertiesUtil.getStringValue(PropertiesUtil.MSG_ERRO_DELETAR_ALUNO));
        }
    }

    @Override
    public List<Aluno> listarAlunos() throws Exception {

        this.con = ConnectionFactory.getConnection();

        List<Aluno> lista = new ArrayList<Aluno>();

        String sql = "select * from aluno";

        PreparedStatement st = this.con.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            long id = rs.getLong("id");
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String rua = rs.getString("rua");
            String bairro = rs.getString("bairro");
            int numero = rs.getInt("numero");
            String cep = rs.getString("cep");
            String cidade = rs.getString("cidade");
            Endereco end = new Endereco(cidade, bairro, rua, cep);
            Aluno aluno = new Aluno(nome, cpf, end);

            aluno.setId(rs.getLong("id"));
            lista.add(aluno);
        }

        return lista;
    }

    @Override
    public Endereco buscarEnderecoAluno(Long id) throws Exception {
        con = ConnectionFactory.getConnection();

        String sql = "select * from endereco where idaluno=?";

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
    }
}
