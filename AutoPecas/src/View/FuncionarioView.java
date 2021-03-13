/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henri
 */
public class FuncionarioView extends javax.swing.JInternalFrame {

        Funcionario funcionario;
        FuncionarioDAO funcionarioDAO;
        List<Funcionario> listaFuncionarios;
    /**
     * Creates new form FuncionarioView
     */
    public FuncionarioView() {
        funcionarioDAO = new FuncionarioDAO();
        listaFuncionarios = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizarTabelaFuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpfUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEnderecoUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefoneUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        txtFuncaoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        btnBuscarFun = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("Endereço");

        jLabel5.setText("Telefone");

        jLabel6.setText("Email");

        Senha.setText("Senha");

        jLabel8.setText("Função");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Funcionários");

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionario);

        btnBuscarFun.setText("Buscar");
        btnBuscarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUsuario)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Senha)
                                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtFuncaoUsuario)
                                    .addComponent(txtEmailUsuario)))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarFun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addContainerGap())
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(133, 133, 133))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(293, 293, 293)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2)
                            .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnBuscarFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNomeUsuario.getText().isEmpty() || txtCpfUsuario.getText().isEmpty() || txtEnderecoUsuario.getText().isEmpty()
              || txtTelefoneUsuario.getText().isEmpty() || txtEmailUsuario.getText().isEmpty() || txtSenhaUsuario.getText().isEmpty()
              || txtFuncaoUsuario.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            txtNomeUsuario.requestFocusInWindow();
        } else{
            funcionario = new Funcionario();
            funcionario.setNomeUsuario(txtNomeUsuario.getText());
            funcionario.setCpfUsuario(txtCpfUsuario.getText());
            funcionario.setEnderecoUsuario(txtEnderecoUsuario.getText());
            funcionario.setTelUsuario(txtTelefoneUsuario.getText());
            funcionario.setEmailUsuario(txtEmailUsuario.getText());
            funcionario.setSenhaUsuario(txtSenhaUsuario.getText());
            funcionario.setFuncaoUsuario(txtFuncaoUsuario.getText());
            try {
                funcionarioDAO.salvar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
                    limpaCamposFuncionario();
                    atualizarTabelaFuncionario();
                    JOptionPane.showMessageDialog(null, "Funcionário Salvo com Sucesso!!!"); 
                    //atualizarTabelaCliente();
         }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposFuncionario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigoUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione o Funcionário");
        }else{
            funcionario = new Funcionario();
            funcionario.setIdUsuario(Integer.parseInt(txtCodigoUsuario.getText()));
            funcionario.setNomeUsuario(txtNomeUsuario.getText());
            funcionario.setCpfUsuario(txtCpfUsuario.getText());
            funcionario.setEnderecoUsuario(txtEnderecoUsuario.getText());
            funcionario.setTelUsuario(txtTelefoneUsuario.getText());
            funcionario.setEmailUsuario(txtEmailUsuario.getText());
            funcionario.setSenhaUsuario(txtSenhaUsuario.getText());
            funcionario.setFuncaoUsuario(txtFuncaoUsuario.getText());
            try {
                funcionarioDAO.alterar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
                    limpaCamposFuncionario();
                    JOptionPane.showMessageDialog(null, "Funcionário Alterado com Sucesso!!!"); 
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigoUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione o Funcionário");
        }else{
            funcionario = new Funcionario();
            funcionario.setIdUsuario(Integer.parseInt(txtCodigoUsuario.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txtNomeUsuario.getText());
            if (confirma == 0){
                try {
                    funcionarioDAO.excluir(funcionario);
                } catch (SQLException ex) {
                    Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
                    limpaCamposFuncionario();
                    JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!!!"); 
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFunActionPerformed
        String cod = JOptionPane.showInputDialog("Digite o Código do Funcionário");
        funcionario = new Funcionario();
            try {
                funcionario = funcionarioDAO.buscaFuncionarioCodigo(cod);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtNomeUsuario.setText(funcionario.getNomeUsuario());
            txtCpfUsuario.setText(funcionario.getCpfUsuario());
            txtEnderecoUsuario.setText(funcionario.getEnderecoUsuario());
            txtTelefoneUsuario.setText(funcionario.getTelUsuario());
            txtEmailUsuario.setText(funcionario.getEmailUsuario());
            txtSenhaUsuario.setText(funcionario.getSenhaUsuario());
            txtFuncaoUsuario.setText(funcionario.getFuncaoUsuario());
    }//GEN-LAST:event_btnBuscarFunActionPerformed

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
        txtCodigoUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0).toString());
        txtCpfUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 1).toString());
        txtEnderecoUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 2).toString());
        txtTelefoneUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 3).toString());
        txtEmailUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 4).toString());
        txtSenhaUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 6).toString());
        txtFuncaoUsuario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    public void atualizarTabelaFuncionario(){
        funcionario = new Funcionario();
            try {
                listaFuncionarios = funcionarioDAO.ListaFuncionario();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
                String dados [][] = new String[listaFuncionarios.size()][8];
                int i = 0;
               for (Funcionario funcionario : listaFuncionarios){
                    dados[i][0] = String.valueOf(funcionario.getIdUsuario());
                    dados[i][1] = funcionario.getNomeUsuario();
                    dados[i][2] = funcionario.getCpfUsuario();
                    dados[i][3] = funcionario.getEnderecoUsuario();
                    dados[i][4] = funcionario.getTelUsuario();
                    dados[i][5] = funcionario.getEmailUsuario();
                    dados[i][6] = funcionario.getSenhaUsuario();
                    dados[i][7] = funcionario.getFuncaoUsuario();
                    i++;
                }
                String tituloColuna[] = {"IdFuncionario", "Nome", "CPF", "Endereço", "Telefone", "Email", 
                "Senha", "Função"};
                DefaultTableModel tabelaFuncionario = new DefaultTableModel();
                tabelaFuncionario.setDataVector(dados, tituloColuna);
                tblFuncionario.setModel(new DefaultTableModel(dados, tituloColuna){
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false, false
                    };
                   
                        public boolean isCellEdiTable(int rowIndex, int columnIndex){
                            return canEdit[columnIndex];
                        }
                });
                tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(3).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(4).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(5).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(6).setPreferredWidth(100);
                tblFuncionario.getColumnModel().getColumn(7).setPreferredWidth(100);

                
                
                DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
                centralizado.setHorizontalAlignment(SwingConstants.CENTER);
                tblFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tblFuncionario.setRowHeight(25);
                tblFuncionario.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Senha;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarFun;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtCpfUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtEnderecoUsuario;
    private javax.swing.JTextField txtFuncaoUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpaCamposFuncionario() {
        txtCodigoUsuario.setText("");
        txtNomeUsuario.setText("");
        txtCpfUsuario.setText("");
        txtEnderecoUsuario.setText("");
        txtTelefoneUsuario.setText("");
        txtEmailUsuario.setText("");
        txtSenhaUsuario.setText("");
        txtFuncaoUsuario.setText("");
    }
}