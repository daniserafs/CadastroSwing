package cadastrovacinaswing;

import javaapplication1.dao.PacienteMapDAO;
import javaapplication1.dao.IPacienteDAO;
import javaapplication1.domain.Paciente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import cadastroclienteswing.TelaPrincipal;

/**
 * @author Daniela Serafim
 * @author Ranor Victor
 */
public class TelaVacina extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private IPacienteDAO pacienteDAO = new PacienteMapDAO();
    // private User = new User();
    private static TelaPrincipal instancia;

    public static TelaPrincipal getInstancia() {

        if (instancia == null) {
            instancia = new TelaPrincipal();
        }
        return instancia;
    }

    /**
     * Creates new form TelaPrincipal
     */
    public TelaVacina() {
        initComponents();
        initCustomComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblSus = new javax.swing.JLabel();
        txtSus = new javax.swing.JTextField();
        lblVacina = new javax.swing.JLabel();
        txtVacina = new javax.swing.JTextField();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();
        lblLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");
        lblRG.setText("RG:");
        lblSus.setText("Cartão SUS:");
        lblVacina.setText("Vacina Aplicada:");
        lblValidade.setText("Validade:");
        lblLote.setText("Lote:");
        lblData.setText("Data:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");

        tabelaPacientes
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{{null, null, null, null}, {null, null, null, null},
                        {null, null, null, null}, {null, null, null, null}},
                        new String[]{"Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"}));
        tabelaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPacientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        menuItemSair.setText("Opções");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        menuItemSair.add(jMenuItemSair);

        jMenuBar1.add(menuItemSair);
        
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addComponent(btnSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExcluir))
                                .addGroup(layout.createSequentialGroup().addComponent(lblNome).addGap(50, 50, 50)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(lblCPF).addGap(50, 50, 50)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(lblRG).addGap(18, 18, 18)
                                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblData).addGap(18,18,18)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup().addComponent(lblSus).addGap(18, 18, 18)
                                        .addComponent(txtSus, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(lblVacina).addGap(18, 18, 18)
                                        .addComponent(txtVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8).addComponent(lblValidade).addGap(18, 18, 18)
                                        .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLote).addGap(8,8,8)
                                .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(45, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))
                
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNome).addGap(35, 35, 35)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCPF).addGap(18, 18, 18)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRG).addGap(18, 18, 18)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblData).addGap(18,18,18)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSus).addGap(18, 18, 18)
                                .addComponent(txtSus, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addComponent(lblVacina).addGap(18, 18, 18)
                                .addComponent(txtVacina, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addGap(18, 18, 18).addComponent(lblValidade).addGap(18, 18, 18)
                                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLote).addGap(8,8,8)
                                .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSalvar).addComponent(btnExcluir))
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        //.addComponent(jButton1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
                            
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplicação?", "Sair", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }// GEN-LAST:event_jMenuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String rg = txtRG.getText();
        String sus = txtSus.getText();
        String vacina = txtVacina.getText();
        String validade = txtValidade.getText();
        String lote = txtLote.getText();
        String data = txtData.getText();

        if (!isCamposValidos(nome, cpf)) {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "ATENÇÃO",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Paciente paciente = new Paciente(nome, cpf, rg, sus, vacina, validade, lote, data);
        Boolean isCadastrado = this.pacienteDAO.cadastrar(paciente);

        if (isCadastrado) {
            modelo.addRow(new Object[]{paciente.getNome(), paciente.getCpf(), paciente.getRg(), paciente.getSus(),
                paciente.getVacina(), paciente.getValidade(), paciente.getLote(), paciente.getData()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Paciente já se encontra cadastrado", "ATENÇÃO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }// GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaPacientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelaPacientesMouseClicked
        int linhaSelecionada = tabelaPacientes.getSelectedRow();
        Long cpf = (Long) tabelaPacientes.getValueAt(linhaSelecionada, 1);

        Paciente paciente = this.pacienteDAO.consultar(cpf);

        txtNome.setText(paciente.getNome());
        txtCPF.setText(paciente.getCpf().toString());
        txtRG.setText(paciente.getRg());
        txtSus.setText(paciente.getSus());
        txtVacina.setText(paciente.getVacina());
        txtValidade.setText(paciente.getValidade());
        txtLote.setText(paciente.getLote());
        txtData.setText(paciente.getData());
        //txtNome.setText(User.getNome());

    }// GEN-LAST:event_tabelaPacientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tabelaPacientes.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este paciente?", "CUIDADO",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {

                Long cpf = (Long) tabelaPacientes.getValueAt(linhaSelecionada, 1);
                this.pacienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum paciente selecionado.", "ERRO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }// GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVacina().setVisible(true);
            }
        });
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        TelaVacina.getInstancia().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSus;
    private javax.swing.JLabel lblVacina;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JLabel lblLote;
    private javax.swing.JTextField txtRG;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JTable tabelaPacientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSus;
    private javax.swing.JTextField txtVacina;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtLote;
    private javax.swing.JLabel lblData ;
    private javax.swing.JTextField txtData;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String... campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Cartao Sus");
        modelo.addColumn("Vacina Aplicada");
        modelo.addColumn("Validade");
        modelo.addColumn("Lote");
        modelo.addColumn("Data");

        tabelaPacientes.setModel(modelo);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        txtSus.setText("");
        txtVacina.setText("");
        txtValidade.setText("");
        txtLote.setText("");
        txtData.setText("");
    }

}
