
package view;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        itemFuncionario = new javax.swing.JMenuItem();
        itemCidade = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemVestido = new javax.swing.JMenuItem();
        itemAcessorio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemLocacao = new javax.swing.JCheckBoxMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartão-com-flores-elegantes-e-amor-da-palavra-49473527.jpg"))); // NOI18N
        jLabel1.setText("                ");

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemCliente);

        itemFuncionario.setText("Funcionário");
        itemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(itemFuncionario);

        itemCidade.setText("Cidades");
        itemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(itemCidade);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Produtos");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemVestido.setText("Vestido");
        itemVestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVestidoActionPerformed(evt);
            }
        });
        jMenu4.add(itemVestido);

        itemAcessorio.setText("Acessório");
        itemAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcessorioActionPerformed(evt);
            }
        });
        jMenu4.add(itemAcessorio);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Registros");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        itemLocacao.setSelected(true);
        itemLocacao.setText("Locação");
        itemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLocacaoActionPerformed(evt);
            }
        });
        jMenu2.add(itemLocacao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed

        new dialogCliente(this, true).setVisible(true);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemVestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVestidoActionPerformed
        
         new dialogVestidos(this, true).setVisible(true);
    }//GEN-LAST:event_itemVestidoActionPerformed

    private void itemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionarioActionPerformed
       
         new dialogFuncionario(this, true).setVisible(true);
    }//GEN-LAST:event_itemFuncionarioActionPerformed

    private void itemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCidadeActionPerformed
       
         new dialogCidade(this, true).setVisible(true);
    }//GEN-LAST:event_itemCidadeActionPerformed

    private void itemAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcessorioActionPerformed
        
         new dialogAcessorios(this, true).setVisible(true);
    }//GEN-LAST:event_itemAcessorioActionPerformed

    private void itemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLocacaoActionPerformed
        
         new dialogLocacao(this, true).setVisible(true);
    }//GEN-LAST:event_itemLocacaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcessorio;
    private javax.swing.JMenuItem itemCidade;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemFuncionario;
    private javax.swing.JCheckBoxMenuItem itemLocacao;
    private javax.swing.JMenuItem itemVestido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
