
package visao;

import dao.EmprestimoDAO;
import dao.ClienteDAO;
import dao.FerramentaDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Emprestimo;



public class TelaEmprestimos extends javax.swing.JFrame {
    
     private int xMouse, yMouse; //variaveis para permitir o manuseio da janela
     
     private final ClienteDAO objetocliente;
    private final FerramentaDAO objetoferramenta;
    private final EmprestimoDAO objetoemprestimo;

    
    public TelaEmprestimos() {
        initComponents();
        this.objetocliente = new ClienteDAO();
        this.objetoferramenta = new FerramentaDAO();
        this.objetoemprestimo = new EmprestimoDAO();

        carregaTabela();
    }
    
    public final void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableEmprestimos.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = objetoemprestimo.getMinhaLista();

        for (Emprestimo e : minhalista) {
            String dataDevolucao = (e.getDataDevolucao() != null) ? e.getDataDevolucao().toString() : "Pendente";

            modelo.addRow(new Object[]{
                e.getId(),
                e.getIdCliente(),
                e.getIdFerramenta(),
                e.getDataEmprestimo(),
                dataDevolucao 
            });
        }
        exibirClienteComMaisEmprestimos();
    }

    private void exibirClienteComMaisEmprestimos() {
        Cliente clienteComMaisEmprestimos = objetocliente.getClienteComMaisEmprestimos();

        if (clienteComMaisEmprestimos != null) {
            JTFqtdemprestimos.setText(clienteComMaisEmprestimos.getNome() + ", " + clienteComMaisEmprestimos.getTotalEmprestimos());
        } else {
            JTFqtdemprestimos.setText("Nenhum cliente encontrado");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmprestimos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JTFcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFferramenta = new javax.swing.JTextField();
        JTFdata = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFdevolucao = new javax.swing.JTextField();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBGerar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTFqtdemprestimos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
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

        JPMenu.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("EMPRÉSTIMOS");

        JBSair.setBackground(new java.awt.Color(0, 51, 102));
        JBSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 0));
        JBSair.setText("X");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPMenuLayout = new javax.swing.GroupLayout(JPMenu);
        JPMenu.setLayout(JPMenuLayout);
        JPMenuLayout.setHorizontalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPMenuLayout.setVerticalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSair)
                    .addComponent(jLabel1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTableEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        jTableEmprestimos.setForeground(new java.awt.Color(0, 0, 0));
        jTableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", "CLIENTE", "FERRAMENTA", "DATA EMPRÉSTIMO", "DATA DEVOLUÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTableEmprestimos);

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("ID CLIENTE:");

        JTFcliente.setBackground(new java.awt.Color(255, 255, 255));
        JTFcliente.setForeground(new java.awt.Color(30, 30, 30));

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ID FERRAMENTA:");

        JTFferramenta.setBackground(new java.awt.Color(255, 255, 255));
        JTFferramenta.setForeground(new java.awt.Color(30, 30, 30));

        JTFdata.setBackground(new java.awt.Color(255, 255, 255));
        JTFdata.setForeground(new java.awt.Color(30, 30, 30));

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("DATA EMPRÉSTIMO:");

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("DATA DEVOLUÇÃO:");

        JTFdevolucao.setBackground(new java.awt.Color(255, 255, 255));
        JTFdevolucao.setForeground(new java.awt.Color(30, 30, 30));

        JBApagar.setBackground(new java.awt.Color(51, 102, 255));
        JBApagar.setForeground(new java.awt.Color(255, 255, 0));
        JBApagar.setText("APAGAR");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBAlterar.setBackground(new java.awt.Color(51, 102, 255));
        JBAlterar.setForeground(new java.awt.Color(255, 255, 0));
        JBAlterar.setText("ALTERAR");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBGerar.setBackground(new java.awt.Color(51, 102, 255));
        JBGerar.setForeground(new java.awt.Color(255, 255, 0));
        JBGerar.setText("GERAR");
        JBGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("CLIENTE COM MAIS EMPRÉSTIMOS:");

        JTFqtdemprestimos.setForeground(new java.awt.Color(0, 51, 102));
        JTFqtdemprestimos.setText("CLIENTE, 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JTFqtdemprestimos)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JBGerar)
                                            .addComponent(JTFdevolucao)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBApagar)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(JBAlterar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTFdevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFqtdemprestimos))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBAlterar)
                    .addComponent(JBGerar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
         this.dispose();
    }//GEN-LAST:event_JBSairActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
          int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xMouse, y - yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();   // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void JBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerarActionPerformed
         try {
            int idCliente = Integer.parseInt(this.JTFcliente.getText());
            int idFerramenta = Integer.parseInt(this.JTFferramenta.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dataEmprestimo = new Date(sdf.parse(this.JTFdata.getText()).getTime());
            Date dataDevolucao = null;

            
            if (!this.JTFdevolucao.getText().isEmpty()) {
                dataDevolucao = new Date(sdf.parse(this.JTFdevolucao.getText()).getTime());

                
                if (dataEmprestimo.after(dataDevolucao)) {
                    throw new ParseException("Data de empréstimo posterior à data de devolução", 0);
                }
            }

            
            Emprestimo emprestimo = new Emprestimo(objetocliente.carregaCliente(idCliente),
                    objetoferramenta.carregaFerramenta(idFerramenta),
                    dataEmprestimo,
                    dataDevolucao);

            
            if (objetoemprestimo.registrarEmprestimo(emprestimo)) {
                JOptionPane.showMessageDialog(rootPane, "Emprestimo cadastrado com sucesso!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }

    }//GEN-LAST:event_JBGerarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        try {
            
            int id = Integer.parseInt(this.jTableEmprestimos.getValueAt(this.jTableEmprestimos.getSelectedRow(), 0).toString());
            int idCliente = Integer.parseInt(this.JTFcliente.getText());
            int idFerramenta = Integer.parseInt(this.JTFferramenta.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dataEmprestimo = new Date(sdf.parse(this.JTFdata.getText()).getTime());
            Date dataDevolucao = null;

            if (!this.JTFdevolucao.getText().isEmpty() && !this.JTFdevolucao.getText().contains("_")) {
                dataDevolucao = new Date(sdf.parse(this.JTFdevolucao.getText()).getTime());

                if (dataEmprestimo.after(dataDevolucao)) {
                    throw new ParseException("Data de empréstimo posterior à data de devolução", 0);
                }
            }
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setId(id);
            emprestimo.setIdCliente(objetocliente.carregaCliente(idCliente));
            emprestimo.setIdFerramenta(objetoferramenta.carregaFerramenta(idFerramenta));
            emprestimo.setDataEmprestimo(dataEmprestimo);
            emprestimo.setDataDevolucao(dataDevolucao);

            
            if (objetoemprestimo.updateEmprestimoBD(emprestimo)) {
                JOptionPane.showMessageDialog(rootPane, "Emprestimo atualizado com sucesso!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela(); 
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
       try {
            int id = 0;
            int idCliente = 0;

            if (this.jTableEmprestimos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um empréstimo para remover");
            } else {
                id = Integer.parseInt(this.jTableEmprestimos.getValueAt(this.jTableEmprestimos.getSelectedRow(), 0).toString());
                idCliente = objetoemprestimo.carregaEmprestimo(id).getIdCliente().getId();
            }

            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover este empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION && this.objetoemprestimo.deleteEmprestimoBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo removido com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }// TODO add your handling code here:
    }//GEN-LAST:event_JBApagarActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBGerar;
    private javax.swing.JButton JBSair;
    private javax.swing.JPanel JPMenu;
    private javax.swing.JTextField JTFcliente;
    private javax.swing.JTextField JTFdata;
    private javax.swing.JTextField JTFdevolucao;
    private javax.swing.JTextField JTFferramenta;
    private javax.swing.JLabel JTFqtdemprestimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmprestimos;
    // End of variables declaration//GEN-END:variables
}
