/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CategoriaDAO;
import Model.Categoria;
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
 * @author andre
 */
public class CategoriaView extends javax.swing.JInternalFrame {

    Categoria categoria;
    CategoriaDAO categoriaDAO;
    List<Categoria> listaCategoria;
    /**
     * Creates new form CategoriaView
     */
    public CategoriaView() {
        categoriaDAO = new CategoriaDAO();
        listaCategoria = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizarTabelaProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdCategoriaView = new javax.swing.JTextField();
        txtCategoriaView = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btnSalvarCategoria = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();
        btnNovaCategoria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome da Categoria");

        txtIdCategoriaView.setEnabled(false);

        txtCategoriaView.setEnabled(false);
        txtCategoriaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaViewActionPerformed(evt);
            }
        });

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCategoria.setEnabled(false);
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategoria);

        btnSalvarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btnSalvarCategoria.setEnabled(false);
        btnSalvarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCategoriaActionPerformed(evt);
            }
        });

        btnExcluirCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btnExcluirCategoria.setEnabled(false);
        btnExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCategoriaActionPerformed(evt);
            }
        });

        btnNovaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        btnNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nova Categoria");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Salvar");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Excluir");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Cancelar");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Sair");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoriasGG.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(362, 362, 362)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoriaView, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCategoriaView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(254, 254, 254))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCategoriaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoriaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovaCategoria)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSalvarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCategoriaActionPerformed
        if ( txtCategoriaView.getText().isEmpty()
             ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            txtCategoriaView.requestFocusInWindow();
        } else{
            categoria = new Categoria();
            categoria.setDescricaoCatProd(txtCategoriaView.getText());
                     

            try {
                categoriaDAO.salvar(categoria);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Categoria Salva com Sucesso!!!");
           atualizarTabelaProduto();
           preparaSalvareCancelar();
           desativaCampos();
           limpaCamposProduto();                 
        }
    }//GEN-LAST:event_btnSalvarCategoriaActionPerformed

    private void btnExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaActionPerformed
        if (txtIdCategoriaView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione a Categoria");
        }else{
            categoria = new Categoria();
            categoria.setIdCategoriaProd(Integer.parseInt(txtIdCategoriaView.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + txtCategoriaView.getText());
            if (confirma == 0){
                try {
                    categoriaDAO.excluir(categoria);
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Categoria Excluida com Sucesso!!!");
                limpaCamposProduto();
                atualizarTabelaProduto();
                preparaExcluir();    
            }
        }
    }//GEN-LAST:event_btnExcluirCategoriaActionPerformed

    private void btnNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCategoriaActionPerformed
        ativaCampos();
        preparaNovo();
        limpaCamposCategoria();
    }//GEN-LAST:event_btnNovaCategoriaActionPerformed

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        txtIdCategoriaView.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0).toString());
        txtCategoriaView.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 1).toString());
        preparaSelecaoTabela();
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void txtCategoriaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpaCamposCategoria();
        preparaSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void atualizarTabelaProduto(){
        categoria = new Categoria();
            try {
                listaCategoria = categoriaDAO.ListaCategoria();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
                String dados [][] = new String[listaCategoria.size()][2];
                int i = 0;
               for (Categoria produto : listaCategoria){
                    dados[i][0] = String.valueOf(produto.getIdCategoriaProd());
                    dados[i][1] = produto.getDescricaoCatProd();                    
                    i++;
                }
                String tituloColuna[] = {"IdCategoria", "Descrição"};
                DefaultTableModel tabelaCategoria = new DefaultTableModel();
                tabelaCategoria.setDataVector(dados, tituloColuna);
                tblCategoria.setModel(new DefaultTableModel(dados, tituloColuna){
                    boolean[] canEdit = new boolean[]{
                        false, false/*, false*/
                    };
                   
                        public boolean isCellEdiTable(int rowIndex, int columnIndex){
                            return canEdit[columnIndex];
                        }
                });
                tblCategoria.getColumnModel().getColumn(0).setPreferredWidth(100);
                tblCategoria.getColumnModel().getColumn(1).setPreferredWidth(100);
                

                
                
                DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
                centralizado.setHorizontalAlignment(SwingConstants.CENTER);
                tblCategoria.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tblCategoria.setRowHeight(25);
                tblCategoria.updateUI();
    }
    
    private void limpaCamposProduto() {
        txtIdCategoriaView.setText("");
        txtCategoriaView.setText("");
        
    }
    
    public void preparaExcluir(){
    btnExcluirCategoria.setEnabled(false);
    btnSalvarCategoria.setEnabled(false);
    
}
    
    public void preparaSalvareCancelar(){
    btnNovaCategoria.setEnabled(true);
    btnSalvarCategoria.setEnabled(false);
    btnExcluirCategoria.setEnabled(false);
        
    }
    
     public void desativaCampos(){
	txtCategoriaView.setEnabled(false);
}
    
    public void preparaNovo(){
    btnNovaCategoria.setEnabled(false);
    btnSalvarCategoria.setEnabled(true);
    btnExcluirCategoria.setEnabled(true);
    tblCategoria.setEnabled(true);
    
}
    public void preparaSelecaoTabela(){
    btnNovaCategoria.setEnabled(true);
    btnExcluirCategoria.setEnabled(true); 
    ativaCampos();
}
    
    
    public void ativaCampos(){
	txtCategoriaView.setEnabled(true);
	
}
    private void limpaCamposCategoria() {
        txtIdCategoriaView.setText("");
        txtCategoriaView.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnNovaCategoria;
    private javax.swing.JButton btnSalvarCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField txtCategoriaView;
    private javax.swing.JTextField txtIdCategoriaView;
    // End of variables declaration//GEN-END:variables
}


