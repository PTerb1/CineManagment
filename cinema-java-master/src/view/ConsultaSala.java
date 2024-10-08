/*
 * Projeto de Gerenciamento de Cinema em Java
 * Programação Orientada a Objetos em Java
 * Faculdade Estacio de sá
 */

package view;

import control.ControleSala;
import control.ControleSessao;
import control.Resposta;
import javax.swing.JOptionPane;

/**
 * Esta classe é responsável pela interface de consulta de salas.
 */
public class ConsultaSala extends javax.swing.JDialog {

    private final Resposta rp = new Resposta();
    
    /**
     * Creates new form ConsultaSala
     */
    public ConsultaSala(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelVoltar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerNumSala = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Sala");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(159, 168, 255));

        jButtonPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jLabelVoltar.setToolTipText("Voltar");
        jLabelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Número:");

        jSpinnerNumSala.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jSpinnerNumSala.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Status:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em condição de uso", "Sem condição de uso", "Em manutenção" }));
        jComboBoxStatus.setSelectedItem(null);
        jComboBoxStatus.setEnabled(false);

        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aplicar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabelVoltar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPesquisar)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonAlterar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(592, 202));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        java.awt.Frame parent = (java.awt.Frame) this.getParent();
        PesquisaSala dialog = new PesquisaSala(parent, true, rp);
        dialog.setVisible(true);
        
        if(rp.getMsg() != null){
            String[] busca = ControleSala.buscar(Integer.parseInt(rp.getMsg()));
            
            jSpinnerNumSala.setValue(Integer.parseInt(rp.getMsg()));
            jComboBoxStatus.setSelectedItem(busca[0]);
            
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        String msg = "";
        
        if(!ControleSessao.isSalaOcupada(Integer.parseInt(jSpinnerNumSala.getValue().toString()))){
            msg = ControleSala.alterar(jSpinnerNumSala.getValue().toString(), jComboBoxStatus.getSelectedItem());
        }else {
            msg = "Erro: Sala em uso por uma ou mais sessões!\nAltere as sessões para alterar a sala.";
        }
        
        JOptionPane.showMessageDialog(null, msg);

        if(!msg.equals("Erro: Complete todas as informações!")){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jComboBoxStatus.setEnabled(true);
        jButtonAlterar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String msg = "";
        
        if(!ControleSessao.isSalaOcupada(Integer.parseInt(jSpinnerNumSala.getValue().toString()))){
            if(JOptionPane.showConfirmDialog(null, "Confirmar exclusão da sala?") == JOptionPane.YES_OPTION)
                msg = ControleSala.excluirSala(jSpinnerNumSala.getValue().toString(), jComboBoxStatus.getSelectedItem());
        }else {
            msg = "Erro: Sala em uso por uma ou mais sessões!\nAltere as sessões para excluir a sala.";    
        }
        
        JOptionPane.showMessageDialog(null, msg);
        this.dispose();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jLabelVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseReleased
        this.dispose();
    }//GEN-LAST:event_jLabelVoltarMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultaSala dialog = new ConsultaSala(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerNumSala;
    // End of variables declaration//GEN-END:variables
}
