
package app.view;

import app.controller.ActionController;
import javax.swing.JTextField;

public class InvoiceHeaderUI extends javax.swing.JFrame {

    public InvoiceHeaderUI(ParentUI parentUI) {
        this.parentUI=parentUI;
         initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveInvbtn = new javax.swing.JButton();
        cancelInvbtn = new javax.swing.JButton();
        invDateTex = new javax.swing.JTextField();
        custNamTex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Invoice");

        jLabel1.setText("Invoice Date");

        jLabel2.setText("Customer Name");

        saveInvbtn.setText("Save");
        saveInvbtn.setActionCommand("SaveHeaderData");
        saveInvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInvbtnActionPerformed(evt);
            }
        });

        cancelInvbtn.setText("Cancel");
        cancelInvbtn.setActionCommand("CancelHeaderData");

        invDateTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invDateTexActionPerformed(evt);
            }
        });

        custNamTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNamTexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveInvbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(invDateTex))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelInvbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(custNamTex)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invDateTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(custNamTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveInvbtn)
                    .addComponent(cancelInvbtn))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        saveInvbtn.addActionListener(parentUI.getController());

        cancelInvbtn.addActionListener(parentUI.getController());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveInvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInvbtnActionPerformed
        // TODO add your handling code here:
   // controller.fillDataONewInvoice();
    }//GEN-LAST:event_saveInvbtnActionPerformed

    private void custNamTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNamTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNamTexActionPerformed

    private void invDateTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTexActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_invDateTexActionPerformed


       public JTextField getCustomerNameField() {
        return custNamTex;
    }

    public JTextField getInvoiceDateField() {
        return invDateTex;
    }

    private final ParentUI parentUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelInvbtn;
    private javax.swing.JTextField custNamTex;
    private javax.swing.JTextField invDateTex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveInvbtn;
    // End of variables declaration//GEN-END:variables
}
