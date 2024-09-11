
package visao;

import dao.FerramentaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;


public class TelaFerramentas extends javax.swing.JFrame {
    
     private int xMouse, yMouse; //variaveis para permitir o manuseio da janela
     
     private final FerramentaDAO objetoferramenta;

    
    public TelaFerramentas() {
        initComponents();
        this.objetoferramenta = new FerramentaDAO();
        carregaTabela();
    }
    
    public final void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableFerramentas.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramenta> minhalista;
        minhalista = objetoferramenta.getMinhaLista();

        for (Ferramenta ferramenta : minhalista) {
            modelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getNome(),
                ferramenta.getMarca(),
                ferramenta.getCusto(),});
        }
        custoTotal();
    }

    private void custoTotal() {
        double custoTotal = objetoferramenta.getTotal();
        String custoTotalFormatado = String.format("%.2f", custoTotal);
        this.JTFtotal.setText(custoTotalFormatado);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        JTFmarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFcusto = new javax.swing.JTextField();
        JBAlterar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramentas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        JTFtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("FERRAMENTAS");

        JBSair.setBackground(new java.awt.Color(0, 51, 102));
        JBSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 0));
        JBSair.setText("X");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBSair)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("NOME:");

        JTFnome.setBackground(new java.awt.Color(255, 255, 255));
        JTFnome.setForeground(new java.awt.Color(30, 30, 30));

        JTFmarca.setBackground(new java.awt.Color(255, 255, 255));
        JTFmarca.setForeground(new java.awt.Color(30, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("MARCA:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("CUSTO:");

        JTFcusto.setBackground(new java.awt.Color(255, 255, 255));
        JTFcusto.setForeground(new java.awt.Color(30, 30, 30));

        JBAlterar.setBackground(new java.awt.Color(51, 102, 255));
        JBAlterar.setForeground(new java.awt.Color(255, 255, 0));
        JBAlterar.setText("ALTERAR");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBCadastrar.setBackground(new java.awt.Color(51, 102, 255));
        JBCadastrar.setForeground(new java.awt.Color(255, 255, 0));
        JBCadastrar.setText("CADASTRAR");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBApagar.setBackground(new java.awt.Color(51, 102, 255));
        JBApagar.setForeground(new java.awt.Color(255, 255, 0));
        JBApagar.setText("APAGAR");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        jTableFerramentas.setBackground(new java.awt.Color(255, 255, 255));
        jTableFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        jTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "MARCA", "CUSTO"
            }
        ));
        jTableFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramentas);

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("CUSTO TOTAL");

        JTFtotal.setForeground(new java.awt.Color(0, 51, 102));
        JTFtotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFcusto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFmarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(JBApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBAlterar)
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrar)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JTFtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFcusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBAlterar)
                    .addComponent(JBCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
       try {
            
            String nome = "";
            String marca = "";
            double custo = 0;
            if (this.JTFnome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFnome.getText();
            }
            if (this.JTFmarca.getText().length() <= 0) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFmarca.getText();
            }
            if (this.JTFcusto.getText().length() < 0) {
                throw new Mensagens("Custo deve ser número e maior que zero.");
            } else {
                custo = Double.parseDouble(this.JTFcusto.getText());
            }
         
            if (this.objetoferramenta.insertFerramentaBD(new Ferramenta(nome, marca, custo))) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrado com Sucesso!");
                this.JTFnome.setText("");
                this.JTFmarca.setText("");
                this.JTFcusto.setText("");
            }
           
            System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n mero.");
        } finally {
            carregaTabela(); 
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
         this.dispose();
    }//GEN-LAST:event_JBSairActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xMouse, y - yMouse);  // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
          xMouse = evt.getX();
          yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
                try {
            
            int id = 0;
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.JTFnome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFnome.getText();
            }

            if (this.JTFmarca.getText().length() <= 0) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFmarca.getText();
            }

            if (this.JTFcusto.getText().length() < 2) {
                throw new Mensagens("Custo deve conter ao menos 1 numero.");
            } else {
                custo = Double.parseDouble(this.JTFcusto.getText());
            }

            if (this.jTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 0).toString());
            }

            if (this.objetoferramenta.updateFerramentaBD(new Ferramenta(id, nome, marca, custo))) {

                
                this.JTFnome.setText("");
                this.JTFmarca.setText("");
                this.JTFcusto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com Sucesso!");

            }
            System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed
  
    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
         try {
            
            int id = 0;
            if (this.jTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFerramentas.
                        getValueAt(this.jTableFerramentas.getSelectedRow(), 0).
                        toString());
            }
            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar esta Ferramenta ?");
            if (respostaUsuario == 0) {// clicou em SIM
                
                if (this.objetoferramenta.deleteFerramentaBD(id)) {
                    
                    this.JTFnome.setText("");
                    this.JTFmarca.setText("");
                    this.JTFcusto.setText("");
                    JOptionPane.showMessageDialog(rootPane,
                            "Ferramenta apagada com sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {   
            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentasMouseClicked
        if (this.jTableFerramentas.getSelectedRow() != -1) {
            String nome = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 1).toString();
            String marca = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 2).toString();
            String custo = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 3).toString();

            this.JTFnome.setText(nome);
            this.JTFmarca.setText(marca);
            this.JTFcusto.setText(custo);
        }//
    }//GEN-LAST:event_jTableFerramentasMouseClicked

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBSair;
    private javax.swing.JTextField JTFcusto;
    private javax.swing.JTextField JTFmarca;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JLabel JTFtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramentas;
    // End of variables declaration//GEN-END:variables
}
