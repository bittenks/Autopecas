/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author henri
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        pnlPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiNovaVenda = new javax.swing.JMenuItem();
        jmiGerenciarPedidos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiCadastrarCliente = new javax.swing.JMenuItem();
        jmiCadastrarProdutos = new javax.swing.JMenuItem();
        jmiCadastrarFuncionarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiConsultarCliente = new javax.swing.JMenuItem();
        jmiConsultarProdutos = new javax.swing.JMenuItem();
        jmiConsultarFuncionarios = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiRelatorioVendas = new javax.swing.JMenuItem();
        jmiRelatorioProdutos = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\trade24.png")); // NOI18N
        jMenu2.setText("Vendas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jmiNovaVenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\shopping cart.png")); // NOI18N
        jmiNovaVenda.setText("Nova Venda");
        jmiNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovaVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNovaVenda);

        jmiGerenciarPedidos.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\arquivo.png")); // NOI18N
        jmiGerenciarPedidos.setText("Gerenciar Pedidos");
        jMenu2.add(jmiGerenciarPedidos);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\add 24.png")); // NOI18N
        jMenu4.setText("Cadastros");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jmiCadastrarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\cliente.png")); // NOI18N
        jmiCadastrarCliente.setText("Cadastrar Cliente");
        jmiCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jmiCadastrarCliente);

        jmiCadastrarProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\product.png")); // NOI18N
        jmiCadastrarProdutos.setText("Cadastrar Produtos");
        jMenu4.add(jmiCadastrarProdutos);

        jmiCadastrarFuncionarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\worker.png")); // NOI18N
        jmiCadastrarFuncionarios.setText("Cadastrar Funcionários");
        jMenu4.add(jmiCadastrarFuncionarios);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\consulta24.png")); // NOI18N
        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jmiConsultarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\cliente.png")); // NOI18N
        jmiConsultarCliente.setText("Consultar Cliente");
        jMenu3.add(jmiConsultarCliente);

        jmiConsultarProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\product.png")); // NOI18N
        jmiConsultarProdutos.setText("Consultar Produtos");
        jMenu3.add(jmiConsultarProdutos);

        jmiConsultarFuncionarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\worker.png")); // NOI18N
        jmiConsultarFuncionarios.setText("Consultar Funcionários");
        jMenu3.add(jmiConsultarFuncionarios);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\business-report24.png")); // NOI18N
        jMenu5.setText("Relatórios");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jmiRelatorioVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\sells.png")); // NOI18N
        jmiRelatorioVendas.setText("Relatório de Vendas");
        jMenu5.add(jmiRelatorioVendas);

        jmiRelatorioProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\bittenks_win\\Pictures\\fcaul\\locadora-img\\product.png")); // NOI18N
        jmiRelatorioProdutos.setText("Relatório de Produtos");
        jMenu5.add(jmiRelatorioProdutos);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovaVendaActionPerformed
        
    }//GEN-LAST:event_jmiNovaVendaActionPerformed

    private void jmiCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarClienteActionPerformed
        ClienteView cliente = new ClienteView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(cliente);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiCadastrarClienteActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiCadastrarCliente;
    private javax.swing.JMenuItem jmiCadastrarFuncionarios;
    private javax.swing.JMenuItem jmiCadastrarProdutos;
    private javax.swing.JMenuItem jmiConsultarCliente;
    private javax.swing.JMenuItem jmiConsultarFuncionarios;
    private javax.swing.JMenuItem jmiConsultarProdutos;
    private javax.swing.JMenuItem jmiGerenciarPedidos;
    private javax.swing.JMenuItem jmiNovaVenda;
    private javax.swing.JMenuItem jmiRelatorioProdutos;
    private javax.swing.JMenuItem jmiRelatorioVendas;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
