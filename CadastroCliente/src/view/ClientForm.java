/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Client.Client;
/**
 *
 * @author gabriel.utino_uscson
 */
public class ClientForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientForm
     */
    public ClientForm() {
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

        nameLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        noLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        rgText = new javax.swing.JTextField();
        numberText = new javax.swing.JTextField();
        cepText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("NOME");

        cpfLabel.setText("CPF");

        rgLabel.setText("RG");

        emailLabel.setText("EMAIL");

        addressLabel.setText("ENDEREÇO");

        noLabel.setText("No.");

        cepLabel.setText("CEP");

        createBtn.setText("GREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        readBtn.setText("READ");
        readBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("UPDATE");

        deleteBtn.setText("DELETE");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        cepText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(emailLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cpfLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(cepLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(noLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberText))
                            .addComponent(emailText)
                            .addComponent(nameText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rgLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rgText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cepText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(createBtn)
                        .addGap(18, 18, 18)
                        .addComponent(readBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noLabel)
                    .addComponent(numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(readBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cepTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        //System.out.println("Name :"+nameText.getText()+"\nCPF :"+cpfText.getText()+"\nRG :"+rgText.getText()+"\nE-mail :"+emailText.getText()
        //                    +"\nEndereco :"+addressText.getText()+"\nNo. "+numberText.getText()+"\nCEP :"+cepText.getText());
        String createName = nameText.getText();
        String createCpf = cpfText.getText();
        String createRg = rgText.getText();
        String createEmail = emailText.getText();
        String createAddress = addressText.getText();
        String createNumber = numberText.getText();
        String createcep = cepText.getText();
        
        Client epicseven = new Client(createName,createCpf,createRg,createEmail,createAddress,createNumber,createcep);
        
        epicseven.printClient();
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void readBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cepText;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel noLabel;
    private javax.swing.JTextField numberText;
    private javax.swing.JButton readBtn;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JTextField rgText;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}