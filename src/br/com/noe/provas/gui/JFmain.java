/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.gui;

import br.com.noe.provas.facade.Facade;
import br.com.noe.provas.model.Aluno;
import br.com.noe.provas.model.Endereco;
import br.com.noe.provas.model.Professor;
import br.com.noe.provas.model.Turma;
import br.com.noe.provas.util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nilton
 */
public class JFmain extends javax.swing.JFrame {

    Facade facade;
    Util util;

    /**
     * Creates new form JFmain
     */
    public JFmain() throws Exception {
        initComponents();
        facade = new Facade();
        util = new Util();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCadastrarAluno = new javax.swing.JButton();
        jPCadastrarAluno = new javax.swing.JPanel();
        jLCadastroAluno = new javax.swing.JLabel();
        jLNomeAluno = new javax.swing.JLabel();
        jLCPFAluno = new javax.swing.JLabel();
        jLEnderecoAluno = new javax.swing.JLabel();
        jLCidadeAluno = new javax.swing.JLabel();
        jLBairroAluno = new javax.swing.JLabel();
        jLRuaAluno = new javax.swing.JLabel();
        jLCepAluno = new javax.swing.JLabel();
        jTFNomeAluno = new javax.swing.JTextField();
        jTFCPFAluno = new javax.swing.JTextField();
        jTFCidadeAluno = new javax.swing.JTextField();
        jTFBairroAluno = new javax.swing.JTextField();
        jTFRuaAluno = new javax.swing.JTextField();
        jTFCepAluno = new javax.swing.JTextField();
        jBCancelarCadastroAluno = new javax.swing.JButton();
        jBcadastrarAlunoo = new javax.swing.JButton();
        jPCadastrarProfessor = new javax.swing.JPanel();
        jLCadastroProfessor = new javax.swing.JLabel();
        jLNomeProfessor = new javax.swing.JLabel();
        jLCPFProfessor = new javax.swing.JLabel();
        jLEnderecoProfessor = new javax.swing.JLabel();
        jLCidadeProfessor = new javax.swing.JLabel();
        jLBairroProfessor = new javax.swing.JLabel();
        jLRuaProfessor = new javax.swing.JLabel();
        jLCepProfessor = new javax.swing.JLabel();
        jTFNomeProfessor = new javax.swing.JTextField();
        jTFCPFProfessor = new javax.swing.JTextField();
        jTFCidadeProfessor = new javax.swing.JTextField();
        jTFBairroProfessor = new javax.swing.JTextField();
        jTFRuaProfessor = new javax.swing.JTextField();
        jTFCepProfessor = new javax.swing.JTextField();
        jBCadastrarProfessor = new javax.swing.JButton();
        jBCancelarCadastroProfessor = new javax.swing.JButton();
        jPEditarAluno = new javax.swing.JPanel();
        jLEditarAluno = new javax.swing.JLabel();
        jLNomeProfessor1 = new javax.swing.JLabel();
        jLCPFProfessor1 = new javax.swing.JLabel();
        jLEnderecoProfessor1 = new javax.swing.JLabel();
        jLCidadeProfessor1 = new javax.swing.JLabel();
        jLBairroProfessor1 = new javax.swing.JLabel();
        jLRuaProfessor1 = new javax.swing.JLabel();
        jLCepProfessor1 = new javax.swing.JLabel();
        jTFEditarNomeAluno = new javax.swing.JTextField();
        jTFCPFEditarAluno = new javax.swing.JTextField();
        jTFCidadeEditarAluno = new javax.swing.JTextField();
        jTFBairroEditarAluno = new javax.swing.JTextField();
        jTFRuaEditarAluno = new javax.swing.JTextField();
        jTFCepEditarAluno = new javax.swing.JTextField();
        jBEditarAluno = new javax.swing.JButton();
        jBCancelarEditarAluno = new javax.swing.JButton();
        jPEditarProfessor = new javax.swing.JPanel();
        jLEditarProfessor = new javax.swing.JLabel();
        jLNomeProfessor2 = new javax.swing.JLabel();
        jLCPFProfessor2 = new javax.swing.JLabel();
        jLEnderecoProfessor2 = new javax.swing.JLabel();
        jLCidadeProfessor2 = new javax.swing.JLabel();
        jLBairroProfessor2 = new javax.swing.JLabel();
        jLRuaProfessor2 = new javax.swing.JLabel();
        jLCepProfessor2 = new javax.swing.JLabel();
        jTFEditarNomeProfessor = new javax.swing.JTextField();
        jTFEditarCPFProfessor = new javax.swing.JTextField();
        jTFEditarCidadeProfessor = new javax.swing.JTextField();
        jTFEditarBairroProfessor = new javax.swing.JTextField();
        jTFEditarRuaProfessor = new javax.swing.JTextField();
        jTFEditarCepProfessor = new javax.swing.JTextField();
        jBEditarProfessor = new javax.swing.JButton();
        jBCancelarEditarProfessor = new javax.swing.JButton();
        jPDeletarAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBDeletarAluno = new javax.swing.JButton();
        jTFDeletarIdAluno = new javax.swing.JTextField();
        jPCadastrarTurma = new javax.swing.JPanel();
        jLNomeTurma = new javax.swing.JLabel();
        jLAnoTurma = new javax.swing.JLabel();
        jTFAnoTurma = new javax.swing.JTextField();
        jTFNomeTurma = new javax.swing.JTextField();
        jBCadastrarTurma = new javax.swing.JButton();
        jBCancelarCadastro = new javax.swing.JButton();
        jPDeletarProfessor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBDeletarProfessor = new javax.swing.JButton();
        jTFDeletarIdProfessor = new javax.swing.JTextField();
        jPAlocacaoProfessor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBAlocacao = new javax.swing.JButton();
        jTFAlocacaoIdTurma = new javax.swing.JTextField();
        jTFAlocacaoIdProfessor = new javax.swing.JTextField();
        jPMatricula = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBMatricula = new javax.swing.JButton();
        jTFMatriculaIdTurma = new javax.swing.JTextField();
        jTFMatriculaIdAluno = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastra = new javax.swing.JMenu();
        jMICadastrarAluno = new javax.swing.JMenuItem();
        jMICadastrarProfessor = new javax.swing.JMenuItem();
        jMICadastrarTurma = new javax.swing.JMenuItem();
        jMEditar = new javax.swing.JMenu();
        jMIEditarAluno = new javax.swing.JMenuItem();
        jMIEditarProfessor = new javax.swing.JMenuItem();
        jMDeletar = new javax.swing.JMenu();
        jMIDeletarAluno = new javax.swing.JMenuItem();
        jMIDeletarProfessor = new javax.swing.JMenuItem();
        jMAcademico = new javax.swing.JMenu();
        jMIAlocarProfessor = new javax.swing.JMenuItem();
        jMIMatricularAluno = new javax.swing.JMenuItem();

        jBCadastrarAluno.setText("Cadastrar");
        jBCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarAlunoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPCadastrarAluno.setVisible(false);

        jLCadastroAluno.setText("Cadastrar aluno");

        jLNomeAluno.setText("Nome:");

        jLCPFAluno.setText("CPF:");

        jLEnderecoAluno.setText("Endereço");

        jLCidadeAluno.setText("Cidade:");

        jLBairroAluno.setText("Bairro:");

        jLRuaAluno.setText("Rua:");

        jLCepAluno.setText("Cep:");

        jTFNomeAluno.setText("Nome aluno");
        jTFNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeAlunoActionPerformed(evt);
            }
        });

        jTFCPFAluno.setText("CPF aluno");
        jTFCPFAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFAlunoActionPerformed(evt);
            }
        });

        jTFCidadeAluno.setText("Cidade aluno");
        jTFCidadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeAlunoActionPerformed(evt);
            }
        });

        jTFBairroAluno.setText("Bairro aluno");
        jTFBairroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroAlunoActionPerformed(evt);
            }
        });

        jTFRuaAluno.setText("Rua aluno");
        jTFRuaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaAlunoActionPerformed(evt);
            }
        });

        jTFCepAluno.setText("Cep aluno");

        jBCancelarCadastroAluno.setText("Cancelar");
        jBCancelarCadastroAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCancelarCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCadastroAlunoActionPerformed(evt);
            }
        });

        jBcadastrarAlunoo.setText("Cadastrar");
        jBcadastrarAlunoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarAlunooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastrarAlunoLayout = new javax.swing.GroupLayout(jPCadastrarAluno);
        jPCadastrarAluno.setLayout(jPCadastrarAlunoLayout);
        jPCadastrarAlunoLayout.setHorizontalGroup(
            jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLCadastroAluno))
                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNomeAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCPFAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCPFAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLEnderecoAluno))
                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                                .addComponent(jLCidadeAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastrarAlunoLayout.createSequentialGroup()
                                            .addComponent(jLBairroAluno)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                                            .addComponent(jLRuaAluno)
                                            .addGap(27, 27, 27)))
                                    .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                                        .addComponent(jLCepAluno)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFBairroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jTFRuaAluno)
                                    .addComponent(jTFCepAluno))))
                        .addGap(127, 127, 127)
                        .addComponent(jBcadastrarAlunoo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelarCadastroAluno)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPCadastrarAlunoLayout.setVerticalGroup(
            jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadastroAluno)
                .addGap(18, 18, 18)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeAluno)
                    .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFAluno)
                    .addComponent(jTFCPFAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEnderecoAluno)
                .addGap(18, 18, 18)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidadeAluno)
                    .addComponent(jTFCidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairroAluno)
                    .addComponent(jTFBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuaAluno)
                    .addComponent(jTFRuaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCepAluno)
                    .addComponent(jTFCepAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelarCadastroAluno)
                    .addComponent(jBcadastrarAlunoo))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPCadastrarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 290));

        jPCadastrarProfessor.setVisible(false);

        jLCadastroProfessor.setText("Cadastrar professor");

        jLNomeProfessor.setText("Nome:");

        jLCPFProfessor.setText("CPF:");

        jLEnderecoProfessor.setText("Endereço");

        jLCidadeProfessor.setText("Cidade:");

        jLBairroProfessor.setText("Bairro:");

        jLRuaProfessor.setText("Rua:");

        jLCepProfessor.setText("Cep:");

        jTFNomeProfessor.setText("Nome professor");
        jTFNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeProfessorActionPerformed(evt);
            }
        });

        jTFCPFProfessor.setText("CPF professor");
        jTFCPFProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFProfessorActionPerformed(evt);
            }
        });

        jTFCidadeProfessor.setText("Cidade professor");
        jTFCidadeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeProfessorActionPerformed(evt);
            }
        });

        jTFBairroProfessor.setText("Bairro professor");
        jTFBairroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroProfessorActionPerformed(evt);
            }
        });

        jTFRuaProfessor.setText("Rua professor");
        jTFRuaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaProfessorActionPerformed(evt);
            }
        });

        jTFCepProfessor.setText("Cep professor");

        jBCadastrarProfessor.setText("Cadastrar");
        jBCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarProfessorActionPerformed(evt);
            }
        });

        jBCancelarCadastroProfessor.setText("Cancelar");
        jBCancelarCadastroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCadastroProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastrarProfessorLayout = new javax.swing.GroupLayout(jPCadastrarProfessor);
        jPCadastrarProfessor.setLayout(jPCadastrarProfessorLayout);
        jPCadastrarProfessorLayout.setHorizontalGroup(
            jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLCadastroProfessor))
                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNomeProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCPFProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLEnderecoProfessor))
                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                                .addComponent(jLCidadeProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastrarProfessorLayout.createSequentialGroup()
                                            .addComponent(jLBairroProfessor)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                                            .addComponent(jLRuaProfessor)
                                            .addGap(27, 27, 27)))
                                    .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                                        .addComponent(jLCepProfessor)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTFRuaProfessor)
                                    .addComponent(jTFCepProfessor))))
                        .addGap(105, 105, 105)
                        .addComponent(jBCadastrarProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarCadastroProfessor)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPCadastrarProfessorLayout.setVerticalGroup(
            jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadastroProfessor)
                .addGap(18, 18, 18)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeProfessor)
                    .addComponent(jTFNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFProfessor)
                    .addComponent(jTFCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEnderecoProfessor)
                .addGap(18, 18, 18)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidadeProfessor)
                    .addComponent(jTFCidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairroProfessor)
                    .addComponent(jTFBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuaProfessor)
                    .addComponent(jTFRuaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastrarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCepProfessor)
                    .addComponent(jTFCepProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrarProfessor)
                    .addComponent(jBCancelarCadastroProfessor))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPCadastrarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 290));

        jPEditarAluno.setVisible(false);

        jLEditarAluno.setText("EditarAluno");

        jLNomeProfessor1.setText("Nome:");

        jLCPFProfessor1.setText("CPF:");

        jLEnderecoProfessor1.setText("Endereço");

        jLCidadeProfessor1.setText("Cidade:");

        jLBairroProfessor1.setText("Bairro:");

        jLRuaProfessor1.setText("Rua:");

        jLCepProfessor1.setText("Cep:");

        jTFEditarNomeAluno.setText("Nome Aluno");
        jTFEditarNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarNomeAlunoActionPerformed(evt);
            }
        });

        jTFCPFEditarAluno.setText("CPF Aluno");
        jTFCPFEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFEditarAlunoActionPerformed(evt);
            }
        });

        jTFCidadeEditarAluno.setText("Cidade aluno");
        jTFCidadeEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeEditarAlunoActionPerformed(evt);
            }
        });

        jTFBairroEditarAluno.setText("Bairro aluno");
        jTFBairroEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroEditarAlunoActionPerformed(evt);
            }
        });

        jTFRuaEditarAluno.setText("Rua aluno");
        jTFRuaEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaEditarAlunoActionPerformed(evt);
            }
        });

        jTFCepEditarAluno.setText("Cep aluno");

        jBEditarAluno.setText("Editar");
        jBEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarAlunoActionPerformed(evt);
            }
        });

        jBCancelarEditarAluno.setText("Cancelar");
        jBCancelarEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarEditarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEditarAlunoLayout = new javax.swing.GroupLayout(jPEditarAluno);
        jPEditarAluno.setLayout(jPEditarAlunoLayout);
        jPEditarAlunoLayout.setHorizontalGroup(
            jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLEditarAluno))
                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNomeProfessor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEditarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCPFProfessor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCPFEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLEnderecoProfessor1))
                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                                .addComponent(jLCidadeProfessor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCidadeEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarAlunoLayout.createSequentialGroup()
                                            .addComponent(jLBairroProfessor1)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                                            .addComponent(jLRuaProfessor1)
                                            .addGap(27, 27, 27)))
                                    .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                                        .addComponent(jLCepProfessor1)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFBairroEditarAluno)
                                    .addComponent(jTFRuaEditarAluno)
                                    .addComponent(jTFCepEditarAluno))))
                        .addGap(105, 105, 105)
                        .addComponent(jBEditarAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarEditarAluno)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPEditarAlunoLayout.setVerticalGroup(
            jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEditarAluno)
                .addGap(18, 18, 18)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeProfessor1)
                    .addComponent(jTFEditarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFProfessor1)
                    .addComponent(jTFCPFEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEnderecoProfessor1)
                .addGap(18, 18, 18)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidadeProfessor1)
                    .addComponent(jTFCidadeEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairroProfessor1)
                    .addComponent(jTFBairroEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuaProfessor1)
                    .addComponent(jTFRuaEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCepProfessor1)
                    .addComponent(jTFCepEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditarAluno)
                    .addComponent(jBCancelarEditarAluno))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPEditarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 290));

        jPEditarProfessor.setVisible(false);

        jLEditarProfessor.setText("Cadastrar professor");

        jLNomeProfessor2.setText("Nome:");

        jLCPFProfessor2.setText("CPF:");

        jLEnderecoProfessor2.setText("Endereço");

        jLCidadeProfessor2.setText("Cidade:");

        jLBairroProfessor2.setText("Bairro:");

        jLRuaProfessor2.setText("Rua:");

        jLCepProfessor2.setText("Cep:");

        jTFEditarNomeProfessor.setText("Nome professor");
        jTFEditarNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarNomeProfessorActionPerformed(evt);
            }
        });

        jTFEditarCPFProfessor.setText("CPF professor");
        jTFEditarCPFProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarCPFProfessorActionPerformed(evt);
            }
        });

        jTFEditarCidadeProfessor.setText("Cidade professor");
        jTFEditarCidadeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarCidadeProfessorActionPerformed(evt);
            }
        });

        jTFEditarBairroProfessor.setText("Bairro professor");
        jTFEditarBairroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarBairroProfessorActionPerformed(evt);
            }
        });

        jTFEditarRuaProfessor.setText("Rua professor");
        jTFEditarRuaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEditarRuaProfessorActionPerformed(evt);
            }
        });

        jTFEditarCepProfessor.setText("Cep professor");

        jBEditarProfessor.setText("Editar");
        jBEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarProfessorActionPerformed(evt);
            }
        });

        jBCancelarEditarProfessor.setText("Cancelar");
        jBCancelarEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarEditarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEditarProfessorLayout = new javax.swing.GroupLayout(jPEditarProfessor);
        jPEditarProfessor.setLayout(jPEditarProfessorLayout);
        jPEditarProfessorLayout.setHorizontalGroup(
            jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLEditarProfessor))
                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNomeProfessor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEditarNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCPFProfessor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFEditarCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLEnderecoProfessor2))
                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                                .addComponent(jLCidadeProfessor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFEditarCidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarProfessorLayout.createSequentialGroup()
                                            .addComponent(jLBairroProfessor2)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                                            .addComponent(jLRuaProfessor2)
                                            .addGap(27, 27, 27)))
                                    .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                                        .addComponent(jLCepProfessor2)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFEditarBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jTFEditarRuaProfessor)
                                    .addComponent(jTFEditarCepProfessor))))
                        .addGap(105, 105, 105)
                        .addComponent(jBEditarProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarEditarProfessor)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPEditarProfessorLayout.setVerticalGroup(
            jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEditarProfessor)
                .addGap(18, 18, 18)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeProfessor2)
                    .addComponent(jTFEditarNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFProfessor2)
                    .addComponent(jTFEditarCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEnderecoProfessor2)
                .addGap(18, 18, 18)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidadeProfessor2)
                    .addComponent(jTFEditarCidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairroProfessor2)
                    .addComponent(jTFEditarBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRuaProfessor2)
                    .addComponent(jTFEditarRuaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCepProfessor2)
                    .addComponent(jTFEditarCepProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditarProfessor)
                    .addComponent(jBCancelarEditarProfessor))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPEditarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 290));

        jPDeletarAluno.setVisible(false);

        jLabel1.setText("ID:");

        jBDeletarAluno.setText("Deletar");
        jBDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarAlunoActionPerformed(evt);
            }
        });

        jTFDeletarIdAluno.setText("Insira o id");

        javax.swing.GroupLayout jPDeletarAlunoLayout = new javax.swing.GroupLayout(jPDeletarAluno);
        jPDeletarAluno.setLayout(jPDeletarAlunoLayout);
        jPDeletarAlunoLayout.setHorizontalGroup(
            jPDeletarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDeletarAlunoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDeletarIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jBDeletarAluno)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPDeletarAlunoLayout.setVerticalGroup(
            jPDeletarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDeletarAlunoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPDeletarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFDeletarIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletarAluno))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        getContentPane().add(jPDeletarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPCadastrarTurma.setVisible(false);

        jLNomeTurma.setText("NOME:");

        jLAnoTurma.setText("ANO:");

        jTFAnoTurma.setText("Ano da turma");
        jTFAnoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnoTurmaActionPerformed(evt);
            }
        });

        jTFNomeTurma.setText("Nome da turma");
        jTFNomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeTurmaActionPerformed(evt);
            }
        });

        jBCadastrarTurma.setText("Cadastrar");
        jBCadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarTurmaActionPerformed(evt);
            }
        });

        jBCancelarCadastro.setText("Cancelar");
        jBCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastrarTurmaLayout = new javax.swing.GroupLayout(jPCadastrarTurma);
        jPCadastrarTurma.setLayout(jPCadastrarTurmaLayout);
        jPCadastrarTurmaLayout.setHorizontalGroup(
            jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarTurmaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastrarTurmaLayout.createSequentialGroup()
                        .addComponent(jLNomeTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastrarTurmaLayout.createSequentialGroup()
                        .addComponent(jBCadastrarTurma)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarCadastro))
                    .addGroup(jPCadastrarTurmaLayout.createSequentialGroup()
                        .addComponent(jLAnoTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 243, Short.MAX_VALUE))
        );
        jPCadastrarTurmaLayout.setVerticalGroup(
            jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrarTurmaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeTurma)
                    .addComponent(jTFNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAnoTurma)
                    .addComponent(jTFAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPCadastrarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrarTurma)
                    .addComponent(jBCancelarCadastro))
                .addGap(191, 191, 191))
        );

        getContentPane().add(jPCadastrarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 280));

        jPDeletarProfessor.setVisible(false);

        jLabel2.setText("ID:");

        jBDeletarProfessor.setText("Deletar");
        jBDeletarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarProfessorActionPerformed(evt);
            }
        });

        jTFDeletarIdProfessor.setText("Insira o id");

        javax.swing.GroupLayout jPDeletarProfessorLayout = new javax.swing.GroupLayout(jPDeletarProfessor);
        jPDeletarProfessor.setLayout(jPDeletarProfessorLayout);
        jPDeletarProfessorLayout.setHorizontalGroup(
            jPDeletarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDeletarProfessorLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDeletarIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jBDeletarProfessor)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPDeletarProfessorLayout.setVerticalGroup(
            jPDeletarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDeletarProfessorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPDeletarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFDeletarIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeletarProfessor))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        getContentPane().add(jPDeletarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPAlocacaoProfessor.setVisible(false);

        jLabel4.setText("ID Turma:");

        jLabel5.setText("ID Professor:");

        jBAlocacao.setText("Matricular");
        jBAlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlocacaoActionPerformed(evt);
            }
        });

        jTFAlocacaoIdTurma.setText("Inserir Id");
        jTFAlocacaoIdTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAlocacaoIdTurmaActionPerformed(evt);
            }
        });

        jTFAlocacaoIdProfessor.setText("Inserir Id");

        javax.swing.GroupLayout jPAlocacaoProfessorLayout = new javax.swing.GroupLayout(jPAlocacaoProfessor);
        jPAlocacaoProfessor.setLayout(jPAlocacaoProfessorLayout);
        jPAlocacaoProfessorLayout.setHorizontalGroup(
            jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTFAlocacaoIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFAlocacaoIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jBAlocacao)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPAlocacaoProfessorLayout.setVerticalGroup(
            jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                .addGroup(jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFAlocacaoIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPAlocacaoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFAlocacaoIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPAlocacaoProfessorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBAlocacao)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        getContentPane().add(jPAlocacaoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPMatricula.setVisible(false);

        jLabel6.setText("ID Turma:");

        jLabel7.setText("ID Aluno:");

        jBMatricula.setText("Matricula");
        jBMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatriculaActionPerformed(evt);
            }
        });

        jTFMatriculaIdTurma.setText("Inserir Id");
        jTFMatriculaIdTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMatriculaIdTurmaActionPerformed(evt);
            }
        });

        jTFMatriculaIdAluno.setText("Inserir Id");

        javax.swing.GroupLayout jPMatriculaLayout = new javax.swing.GroupLayout(jPMatricula);
        jPMatricula.setLayout(jPMatriculaLayout);
        jPMatriculaLayout.setHorizontalGroup(
            jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMatriculaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPMatriculaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTFMatriculaIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPMatriculaLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFMatriculaIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jBMatricula)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPMatriculaLayout.setVerticalGroup(
            jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMatriculaLayout.createSequentialGroup()
                .addGroup(jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMatriculaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFMatriculaIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFMatriculaIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPMatriculaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBMatricula)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        getContentPane().add(jPMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMCadastra.setText("Cadastrar");

        jMICadastrarAluno.setText("Aluno");
        jMICadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarAlunoActionPerformed(evt);
            }
        });
        jMCadastra.add(jMICadastrarAluno);

        jMICadastrarProfessor.setText("Professor");
        jMICadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarProfessorActionPerformed(evt);
            }
        });
        jMCadastra.add(jMICadastrarProfessor);

        jMICadastrarTurma.setText("Turma");
        jMICadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarTurmaActionPerformed(evt);
            }
        });
        jMCadastra.add(jMICadastrarTurma);

        jMenuBar1.add(jMCadastra);

        jMEditar.setText("Editar");

        jMIEditarAluno.setText("Aluno");
        jMIEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditarAlunoActionPerformed(evt);
            }
        });
        jMEditar.add(jMIEditarAluno);

        jMIEditarProfessor.setText("Professor");
        jMIEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditarProfessorActionPerformed(evt);
            }
        });
        jMEditar.add(jMIEditarProfessor);

        jMenuBar1.add(jMEditar);

        jMDeletar.setText("Deletar");

        jMIDeletarAluno.setText("Aluno");
        jMIDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeletarAlunoActionPerformed(evt);
            }
        });
        jMDeletar.add(jMIDeletarAluno);

        jMIDeletarProfessor.setText("Professor");
        jMIDeletarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeletarProfessorActionPerformed(evt);
            }
        });
        jMDeletar.add(jMIDeletarProfessor);

        jMenuBar1.add(jMDeletar);

        jMAcademico.setText("Acadêmico");

        jMIAlocarProfessor.setText("Alocar professor");
        jMIAlocarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlocarProfessorActionPerformed(evt);
            }
        });
        jMAcademico.add(jMIAlocarProfessor);

        jMIMatricularAluno.setText("Matricular aluno");
        jMIMatricularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMatricularAlunoActionPerformed(evt);
            }
        });
        jMAcademico.add(jMIMatricularAluno);

        jMenuBar1.add(jMAcademico);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarAlunoActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(true);
    }//GEN-LAST:event_jMICadastrarAlunoActionPerformed

    private void jMICadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProfessorActionPerformed

        jPEditarProfessor.setVisible(true);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(true);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jMICadastrarProfessorActionPerformed

    private void jMIDeletarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarProfessorActionPerformed
       jPDeletarProfessor.setVisible(true);
    }//GEN-LAST:event_jMIDeletarProfessorActionPerformed

    private void jMICadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarTurmaActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(true);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jMICadastrarTurmaActionPerformed

    private void jTFAnoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnoTurmaActionPerformed

    private void jTFNomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeTurmaActionPerformed

    private void jBCadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarTurmaActionPerformed
        Turma turma = new Turma(jTFNomeTurma.getText(), Integer.parseInt(jTFAnoTurma.getText()));
        try {
            facade.cadastrarTurma(turma);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCadastrarTurmaActionPerformed

    private void jBCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCadastroActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCancelarCadastroActionPerformed

    private void jTFNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeAlunoActionPerformed

    private void jTFCPFAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCPFAlunoActionPerformed

    private void jTFCidadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeAlunoActionPerformed

    private void jTFBairroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroAlunoActionPerformed

    private void jTFRuaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaAlunoActionPerformed

    private void jTFNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeProfessorActionPerformed

    private void jTFCPFProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCPFProfessorActionPerformed

    private void jTFCidadeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeProfessorActionPerformed

    private void jTFBairroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroProfessorActionPerformed

    private void jTFRuaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaProfessorActionPerformed

    private void jBCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarProfessorActionPerformed

        Endereco endereco = new Endereco(jTFCidadeProfessor.getText(), jTFBairroProfessor.getText(), jTFRuaProfessor.getText(), jTFCepProfessor.getText());
        Professor professor = new Professor(jTFNomeProfessor.getText(), jTFCPFProfessor.getText(), endereco);
        try {
            facade.cadastrarProfessor(professor);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCadastrarProfessorActionPerformed

    private void jBCancelarCadastroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCadastroProfessorActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCancelarCadastroProfessorActionPerformed

    private void jBCancelarCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCadastroAlunoActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCancelarCadastroAlunoActionPerformed

    private void jBCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarAlunoActionPerformed
        //String cidade, String bairro, String rua, String cep
        Endereco endereco = new Endereco(jTFCidadeAluno.getText(), jTFBairroAluno.getText(), jTFRuaAluno.getText(), jTFCepAluno.getText());
        // String nome, String cpf, Endereco endereco
        Aluno aluno = new Aluno(jTFNomeAluno.getText(), jTFCPFAluno.getText(), endereco);

        try {
            facade.cadastrarAluno(aluno);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCadastrarAlunoActionPerformed

    private void jTFEditarNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarNomeAlunoActionPerformed

    private void jTFCPFEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFEditarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCPFEditarAlunoActionPerformed

    private void jTFCidadeEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeEditarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeEditarAlunoActionPerformed

    private void jTFBairroEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroEditarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroEditarAlunoActionPerformed

    private void jTFRuaEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaEditarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaEditarAlunoActionPerformed

    private void jBEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarAlunoActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBEditarAlunoActionPerformed

    private void jBCancelarEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarEditarAlunoActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCancelarEditarAlunoActionPerformed

    private void jTFEditarNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarNomeProfessorActionPerformed

    private void jTFEditarCPFProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarCPFProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarCPFProfessorActionPerformed

    private void jTFEditarCidadeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarCidadeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarCidadeProfessorActionPerformed

    private void jTFEditarBairroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarBairroProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarBairroProfessorActionPerformed

    private void jTFEditarRuaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEditarRuaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEditarRuaProfessorActionPerformed

    private void jBEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarProfessorActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBEditarProfessorActionPerformed

    private void jBCancelarEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarEditarProfessorActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jBCancelarEditarProfessorActionPerformed

    private void jMIEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditarAlunoActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(true);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jMIEditarAlunoActionPerformed

    private void jMIEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditarProfessorActionPerformed
        jPEditarProfessor.setVisible(true);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
    }//GEN-LAST:event_jMIEditarProfessorActionPerformed

    private void jTFAlocacaoIdTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAlocacaoIdTurmaActionPerformed
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(true);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jTFAlocacaoIdTurmaActionPerformed

    private void jTFMatriculaIdTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMatriculaIdTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMatriculaIdTurmaActionPerformed

    private void jBDeletarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarProfessorActionPerformed
        try {
            Professor professor = facade.buscarProfessor(Long.parseLong(jTFDeletarIdProfessor.getText()));
            facade.deletarProfessor(professor);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(false);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jBDeletarProfessorActionPerformed

    private void jBcadastrarAlunooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarAlunooActionPerformed
        Endereco end = new Endereco(jTFCidadeAluno.getText(), jTFBairroAluno.getText(), jTFRuaAluno.getText(), jTFCepAluno.getText());
        Aluno aluno = new Aluno(jTFNomeAluno.getText(), jTFCPFAluno.getText(), end);

        try {
            facade.cadastrarAluno(aluno);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(false);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jBcadastrarAlunooActionPerformed

    private void jBDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarAlunoActionPerformed
        try {
            Aluno aluno = facade.buscarAluno(Long.parseLong(jTFDeletarIdAluno.getText()));
            facade.deletarAluno(aluno);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(false);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jBDeletarAlunoActionPerformed

    private void jBAlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlocacaoActionPerformed
        
        try {
            Turma turma = facade.buscarTurma(Long.parseLong(jTFAlocacaoIdTurma.getText()));
            Professor professor = facade.buscarProfessor(Long.parseLong(jTFAlocacaoIdProfessor.getText()));
            facade.alocarProfessor(turma, professor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(false);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jBAlocacaoActionPerformed

    private void jBMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatriculaActionPerformed
        try {
            Turma turma = facade.buscarTurma(Long.parseLong(jTFMatriculaIdTurma.getText()));
            Aluno aluno = facade.buscarAluno(Long.parseLong(jTFMatriculaIdAluno.getText()));
            facade.matricularAluno(turma, aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        jPEditarProfessor.setVisible(false);
        jPEditarAluno.setVisible(false);
        jPCadastrarTurma.setVisible(false);
        jPCadastrarProfessor.setVisible(false);
        jPCadastrarAluno.setVisible(false);
        jPDeletarAluno.setVisible(false);
        jPDeletarProfessor.setVisible(false);
        jPAlocacaoProfessor.setVisible(false);
        jPMatricula.setVisible(false);
    }//GEN-LAST:event_jBMatriculaActionPerformed

    private void jMIAlocarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlocarProfessorActionPerformed
        jPAlocacaoProfessor.setVisible(true);
    }//GEN-LAST:event_jMIAlocarProfessorActionPerformed

    private void jMIMatricularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMatricularAlunoActionPerformed
       jPMatricula.setVisible(true);
    }//GEN-LAST:event_jMIMatricularAlunoActionPerformed

    private void jMIDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarAlunoActionPerformed
         jPDeletarAluno.setVisible(true);
    }//GEN-LAST:event_jMIDeletarAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFmain().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(JFmain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlocacao;
    private javax.swing.JButton jBCadastrarAluno;
    private javax.swing.JButton jBCadastrarProfessor;
    private javax.swing.JButton jBCadastrarTurma;
    private javax.swing.JButton jBCancelarCadastro;
    private javax.swing.JButton jBCancelarCadastroAluno;
    private javax.swing.JButton jBCancelarCadastroProfessor;
    private javax.swing.JButton jBCancelarEditarAluno;
    private javax.swing.JButton jBCancelarEditarProfessor;
    private javax.swing.JButton jBDeletarAluno;
    private javax.swing.JButton jBDeletarProfessor;
    private javax.swing.JButton jBEditarAluno;
    private javax.swing.JButton jBEditarProfessor;
    private javax.swing.JButton jBMatricula;
    private javax.swing.JButton jBcadastrarAlunoo;
    private javax.swing.JLabel jLAnoTurma;
    private javax.swing.JLabel jLBairroAluno;
    private javax.swing.JLabel jLBairroProfessor;
    private javax.swing.JLabel jLBairroProfessor1;
    private javax.swing.JLabel jLBairroProfessor2;
    private javax.swing.JLabel jLCPFAluno;
    private javax.swing.JLabel jLCPFProfessor;
    private javax.swing.JLabel jLCPFProfessor1;
    private javax.swing.JLabel jLCPFProfessor2;
    private javax.swing.JLabel jLCadastroAluno;
    private javax.swing.JLabel jLCadastroProfessor;
    private javax.swing.JLabel jLCepAluno;
    private javax.swing.JLabel jLCepProfessor;
    private javax.swing.JLabel jLCepProfessor1;
    private javax.swing.JLabel jLCepProfessor2;
    private javax.swing.JLabel jLCidadeAluno;
    private javax.swing.JLabel jLCidadeProfessor;
    private javax.swing.JLabel jLCidadeProfessor1;
    private javax.swing.JLabel jLCidadeProfessor2;
    private javax.swing.JLabel jLEditarAluno;
    private javax.swing.JLabel jLEditarProfessor;
    private javax.swing.JLabel jLEnderecoAluno;
    private javax.swing.JLabel jLEnderecoProfessor;
    private javax.swing.JLabel jLEnderecoProfessor1;
    private javax.swing.JLabel jLEnderecoProfessor2;
    private javax.swing.JLabel jLNomeAluno;
    private javax.swing.JLabel jLNomeProfessor;
    private javax.swing.JLabel jLNomeProfessor1;
    private javax.swing.JLabel jLNomeProfessor2;
    private javax.swing.JLabel jLNomeTurma;
    private javax.swing.JLabel jLRuaAluno;
    private javax.swing.JLabel jLRuaProfessor;
    private javax.swing.JLabel jLRuaProfessor1;
    private javax.swing.JLabel jLRuaProfessor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMAcademico;
    private javax.swing.JMenu jMCadastra;
    private javax.swing.JMenu jMDeletar;
    private javax.swing.JMenu jMEditar;
    private javax.swing.JMenuItem jMIAlocarProfessor;
    private javax.swing.JMenuItem jMICadastrarAluno;
    private javax.swing.JMenuItem jMICadastrarProfessor;
    private javax.swing.JMenuItem jMICadastrarTurma;
    private javax.swing.JMenuItem jMIDeletarAluno;
    private javax.swing.JMenuItem jMIDeletarProfessor;
    private javax.swing.JMenuItem jMIEditarAluno;
    private javax.swing.JMenuItem jMIEditarProfessor;
    private javax.swing.JMenuItem jMIMatricularAluno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPAlocacaoProfessor;
    private javax.swing.JPanel jPCadastrarAluno;
    private javax.swing.JPanel jPCadastrarProfessor;
    private javax.swing.JPanel jPCadastrarTurma;
    private javax.swing.JPanel jPDeletarAluno;
    private javax.swing.JPanel jPDeletarProfessor;
    private javax.swing.JPanel jPEditarAluno;
    private javax.swing.JPanel jPEditarProfessor;
    private javax.swing.JPanel jPMatricula;
    private javax.swing.JTextField jTFAlocacaoIdProfessor;
    private javax.swing.JTextField jTFAlocacaoIdTurma;
    private javax.swing.JTextField jTFAnoTurma;
    private javax.swing.JTextField jTFBairroAluno;
    private javax.swing.JTextField jTFBairroEditarAluno;
    private javax.swing.JTextField jTFBairroProfessor;
    private javax.swing.JTextField jTFCPFAluno;
    private javax.swing.JTextField jTFCPFEditarAluno;
    private javax.swing.JTextField jTFCPFProfessor;
    private javax.swing.JTextField jTFCepAluno;
    private javax.swing.JTextField jTFCepEditarAluno;
    private javax.swing.JTextField jTFCepProfessor;
    private javax.swing.JTextField jTFCidadeAluno;
    private javax.swing.JTextField jTFCidadeEditarAluno;
    private javax.swing.JTextField jTFCidadeProfessor;
    private javax.swing.JTextField jTFDeletarIdAluno;
    private javax.swing.JTextField jTFDeletarIdProfessor;
    private javax.swing.JTextField jTFEditarBairroProfessor;
    private javax.swing.JTextField jTFEditarCPFProfessor;
    private javax.swing.JTextField jTFEditarCepProfessor;
    private javax.swing.JTextField jTFEditarCidadeProfessor;
    private javax.swing.JTextField jTFEditarNomeAluno;
    private javax.swing.JTextField jTFEditarNomeProfessor;
    private javax.swing.JTextField jTFEditarRuaProfessor;
    private javax.swing.JTextField jTFMatriculaIdAluno;
    private javax.swing.JTextField jTFMatriculaIdTurma;
    private javax.swing.JTextField jTFNomeAluno;
    private javax.swing.JTextField jTFNomeProfessor;
    private javax.swing.JTextField jTFNomeTurma;
    private javax.swing.JTextField jTFRuaAluno;
    private javax.swing.JTextField jTFRuaEditarAluno;
    private javax.swing.JTextField jTFRuaProfessor;
    // End of variables declaration//GEN-END:variables
}
