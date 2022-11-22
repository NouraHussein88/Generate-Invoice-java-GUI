
package app.view;

import javax.swing.JTextField;

public class InvoiceLinesUI extends javax.swing.JFrame {

    public InvoiceLinesUI(ParentUI parentUI) {
        this.parentUI=parentUI;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemNameLb = new javax.swing.JTextField();
        itemCountLb = new javax.swing.JTextField();
        itemPriceLb = new javax.swing.JTextField();
        saveItmBtn = new javax.swing.JButton();
        cancelItmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Items");

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Count");

        jLabel3.setText("Item Price");

        itemCountLb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCountLbActionPerformed(evt);
            }
        });

        itemPriceLb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceLbActionPerformed(evt);
            }
        });

        saveItmBtn.setText("Save");
        saveItmBtn.setActionCommand("SaveItemData");
        saveItmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItmBtnActionPerformed(evt);
            }
        });

        cancelItmBtn.setText("Cancel");
        cancelItmBtn.setActionCommand("CancelItemData");
        cancelItmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelItmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameLb)
                            .addComponent(itemCountLb)
                            .addComponent(itemPriceLb)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveItmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelItmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemCountLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itemPriceLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveItmBtn)
                    .addComponent(cancelItmBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        saveItmBtn.addActionListener(parentUI.getController());
        cancelItmBtn.addActionListener(parentUI.getController());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveItmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItmBtnActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_saveItmBtnActionPerformed

    private void cancelItmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelItmBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelItmBtnActionPerformed

    private void itemCountLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCountLbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCountLbActionPerformed

    private void itemPriceLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceLbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceLbActionPerformed

   
     public JTextField getItemNameField() {
        return itemNameLb;
    }

    public JTextField getItemCountField() {
        return itemCountLb;
    }

    public JTextField getItemPriceField() {
        return itemPriceLb;
    }

    private  ParentUI parentUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelItmBtn;
    private javax.swing.JTextField itemCountLb;
    private javax.swing.JTextField itemNameLb;
    private javax.swing.JTextField itemPriceLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveItmBtn;
    // End of variables declaration//GEN-END:variables
}
