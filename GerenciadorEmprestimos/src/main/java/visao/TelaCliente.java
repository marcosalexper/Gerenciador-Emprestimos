package visao;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import dao.ClienteDAO;

public class TelaCliente extends javax.swing.JFrame {

    private int xMouse, yMouse; //variaveis para permitir o manuseio da janela
    private Cliente objetocliente;

    public TelaCliente() {
        initComponents();
        this.objetocliente = new Cliente();
        carregaTabela();
    }

    public final void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableCliente.getModel();
        modelo.setNumRows(0);

        ArrayList<Cliente> minhalista;
        minhalista = objetocliente.getMinhaLista();

        for (Cliente cliente : minhalista) {
            modelo.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),});
        }
    }

    public ArrayList<String> getListaAmigos() {
        return this.objetocliente.getMinhaLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFtelefone = new javax.swing.JTextField();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("CLIENTES");

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
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("NOME:");

        JTFnome.setBackground(new java.awt.Color(255, 255, 255));
        JTFnome.setForeground(new java.awt.Color(30, 30, 30));
        JTFnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("TELEFONE:");

        JTFtelefone.setBackground(new java.awt.Color(255, 255, 255));
        JTFtelefone.setForeground(new java.awt.Color(30, 30, 30));

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

        JBCadastrar.setBackground(new java.awt.Color(51, 102, 255));
        JBCadastrar.setForeground(new java.awt.Color(255, 255, 0));
        JBCadastrar.setText("CADASTRAR");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        jTableCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTableCliente.setForeground(new java.awt.Color(255, 255, 0));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JBApagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBAlterar)
                .addGap(90, 90, 90)
                .addComponent(JBCadastrar)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFtelefone)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFnome)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBApagar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBCadastrar)
                        .addComponent(JBAlterar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JTFnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomeActionPerformed
    //metodo para mudar a posicao da janela    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xMouse, y - yMouse); // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged
    //metodo para mexer a janela
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {

            int id = 0;
            if (this.jTableCliente.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione um Cliente para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableCliente.
                        getValueAt(this.jTableCliente.getSelectedRow(), 0).
                        toString());
            }

            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar este Cliente ?");
            if (respostaUsuario == 0) {// clicou em SIM

                if (this.objetocliente.deleteClienteBD(id)) {

                    this.JTFnome.setText("");
                    this.JTFtelefone.setText("");
                    JOptionPane.showMessageDialog(rootPane,
                            "Cliente apagado com sucesso!");
                }
            }

            System.out.println(this.objetocliente.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try {

            String nome = "";
            String telefone = "";
            if (this.JTFnome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFnome.getText();
            }
            if (this.JTFtelefone.getText().length() <= 0) {
                throw new Mensagens("Telefone deve conter ao menos 2 caracteres.");
            } else {
                telefone = this.JTFtelefone.getText();
            }

            if (this.objetocliente.insertClienteBD(new Cliente(nome, telefone))) {
                JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado com Sucesso!");
                this.JTFnome.setText("");
                this.JTFtelefone.setText("");
            }

            System.out.println(this.objetocliente.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n mero.");
        } finally {
            carregaTabela();
        }
    }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
         try {

            int id = 0;
            String nome = "";
            String telefone = "";

            if (this.JTFnome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFnome.getText();
            }

            if (this.JTFtelefone.getText().length() <= 0) {
                throw new Mensagens("Telefone deve conter ao menos 2 caracteres.");
            } else {
                telefone = this.JTFtelefone.getText();
            }
            if (this.jTableCliente.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Cliente para Alterar");
            } else {
                id = Integer.parseInt(this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 0).toString());
            }
     
            if (this.objetocliente.updateClienteBD(new Cliente(id, nome, telefone))) {

              
                this.JTFnome.setText("");
                this.JTFtelefone.setText("");
                JOptionPane.showMessageDialog(rootPane, "Cliente Alterado com Sucesso!");

            }
            System.out.println(this.objetocliente.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
          if (this.jTableCliente.getSelectedRow() != -1) {
            String nome = this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 1).toString();
            String telefone = this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 2).toString();

            this.JTFnome.setText(nome);
            this.JTFtelefone.setText(telefone);
        }
    }//GEN-LAST:event_jTableClienteMouseClicked

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBSair;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables

