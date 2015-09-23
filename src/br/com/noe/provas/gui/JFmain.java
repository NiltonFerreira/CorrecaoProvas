/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.gui;

/**
 *
 * @author Nilton
 */
public class JFmain extends javax.swing.JFrame {

    /**
     * Creates new form JFmain
     */
    public JFmain() {
        initComponents();
    }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jMListar = new javax.swing.JMenu();
        jMIListarAlunos = new javax.swing.JMenuItem();
        jMIListarProfessores = new javax.swing.JMenuItem();
        jMIListarTurmas = new javax.swing.JMenuItem();
        jMAcademico = new javax.swing.JMenu();
        jMIAlocarProfessor = new javax.swing.JMenuItem();
        jMIMatricularAluno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jMCadastra.add(jMICadastrarTurma);

        jMenuBar1.add(jMCadastra);

        jMEditar.setText("Editar");

        jMIEditarAluno.setText("Aluno");
        jMEditar.add(jMIEditarAluno);

        jMIEditarProfessor.setText("Professor");
        jMEditar.add(jMIEditarProfessor);

        jMenuBar1.add(jMEditar);

        jMDeletar.setText("Deletar");

        jMIDeletarAluno.setText("Aluno");
        jMDeletar.add(jMIDeletarAluno);

        jMIDeletarProfessor.setText("Professor");
        jMIDeletarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeletarProfessorActionPerformed(evt);
            }
        });
        jMDeletar.add(jMIDeletarProfessor);

        jMenuBar1.add(jMDeletar);

        jMListar.setText("Listar");

        jMIListarAlunos.setText("Aluno");
        jMListar.add(jMIListarAlunos);

        jMIListarProfessores.setText("Professor");
        jMListar.add(jMIListarProfessores);

        jMIListarTurmas.setText("Turma");
        jMListar.add(jMIListarTurmas);

        jMenuBar1.add(jMListar);

        jMAcademico.setText("Acadêmico");

        jMIAlocarProfessor.setText("Alocar professor");
        jMAcademico.add(jMIAlocarProfessor);

        jMIMatricularAluno.setText("Matricular aluno");
        jMAcademico.add(jMIMatricularAluno);

        jMenuBar1.add(jMAcademico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarAlunoActionPerformed

    }//GEN-LAST:event_jMICadastrarAlunoActionPerformed

    private void jMICadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarProfessorActionPerformed

    private void jMIDeletarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIDeletarProfessorActionPerformed

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
                new JFmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JMenuItem jMIListarAlunos;
    private javax.swing.JMenuItem jMIListarProfessores;
    private javax.swing.JMenuItem jMIListarTurmas;
    private javax.swing.JMenuItem jMIMatricularAluno;
    private javax.swing.JMenu jMListar;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
