package app.view;

import app.controller.ActionController;
import app.model.InvoiceHeader;
import app.model.InvoiceHeaderTableModel;
import app.model.InvoiceItemTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public class ParentUI extends javax.swing.JFrame {

    public ParentUI() {
        controller = new ActionController(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceHeaderTable = new javax.swing.JTable();
        addInvoiceHeaderButton = new javax.swing.JButton();
        deleteInvoiceHeaderButton = new javax.swing.JButton();
        invoiceNum = new javax.swing.JLabel();
        invoiceDate = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        invoiceTotal = new javax.swing.JLabel();
        invoiceItems = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceLinesTable = new javax.swing.JTable();
        addInvoiceLineButton = new javax.swing.JButton();
        addInvoiceLineButton.addActionListener(controller);
        deleteInvoiceLineButton = new javax.swing.JButton();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        loadIteam = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Application");

        invoiceHeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        invoiceHeaderTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(invoiceHeaderTable);
        invoiceHeaderTable.getSelectionModel().addListSelectionListener(controller);

        addInvoiceHeaderButton.setText("Create Invoice");
        addInvoiceHeaderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvoiceHeaderButtonActionPerformed(evt);
            }
        });

        deleteInvoiceHeaderButton.setText("Delete Invoice");

        invoiceNum.setText("Invoice Number");

        invoiceDate.setText("Invoice Date");

        customerName.setText("Customer Name");

        invoiceTotal.setText("Invoice Total");

        invoiceItems.setForeground(new java.awt.Color(153, 153, 153));
        invoiceItems.setText("Invoice Items");

        invoiceLinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        invoiceLinesTable.setRowSelectionAllowed(false);
        invoiceLinesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        invoiceLinesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        invoiceLinesTable.getTableHeader().setReorderingAllowed(false);
        invoiceLinesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceLinesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(invoiceLinesTable);
        invoiceLinesTable.getSelectionModel().addListSelectionListener(controller);
        models.add(invoiceLinesTable.getSelectionModel());

        addInvoiceLineButton.setText("Add Iteam");
        addInvoiceLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvoiceLineButtonActionPerformed(evt);
            }
        });

        deleteInvoiceLineButton.setText("Delete Iteam");
        deleteInvoiceLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceLineButtonActionPerformed(evt);
            }
        });

        customerNameLabel.setText(".");

        invoiceDateLabel.setText(".");

        invoiceNumLabel.setText(".");

        invoiceTotalLabel.setText(".");

        jMenu3.setText("File");

        loadIteam.setText("Load File");
        loadIteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadIteamActionPerformed(evt);
            }
        });
        jMenu3.add(loadIteam);
        loadIteam.addActionListener(controller);

        saveItem.setText("Save File");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        jMenu3.add(saveItem);
        saveItem.addActionListener(controller);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addInvoiceHeaderButton)
                        .addGap(91, 91, 91)
                        .addComponent(deleteInvoiceHeaderButton)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addInvoiceLineButton)
                        .addGap(133, 133, 133)
                        .addComponent(deleteInvoiceLineButton)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoiceNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerName)
                                    .addComponent(invoiceDate)
                                    .addComponent(invoiceTotal)
                                    .addComponent(invoiceItems))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceTotalLabel)
                                    .addComponent(invoiceDateLabel)
                                    .addComponent(customerNameLabel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceNumLabel)
                            .addComponent(invoiceNum))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceDate)
                            .addComponent(invoiceDateLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceTotal)
                            .addComponent(invoiceTotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(invoiceItems)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInvoiceHeaderButton)
                    .addComponent(deleteInvoiceHeaderButton)
                    .addComponent(addInvoiceLineButton)
                    .addComponent(deleteInvoiceLineButton))
                .addContainerGap())
        );

        addInvoiceHeaderButton.addActionListener(controller);
        deleteInvoiceHeaderButton.addActionListener(controller);
        deleteInvoiceLineButton.addActionListener(controller);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadIteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadIteamActionPerformed
        //controller.loadFile();      // TODO add your handling code here:
    }//GEN-LAST:event_loadIteamActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveItemActionPerformed

    private void addInvoiceHeaderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvoiceHeaderButtonActionPerformed
        // InvoiceHeaderUI newinvoice=new InvoiceHeaderUI();
        //   newinvoice.setVisible(true);
        //  this.dispose();
       // controller.createInvoice();
    }//GEN-LAST:event_addInvoiceHeaderButtonActionPerformed

    private void addInvoiceLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvoiceLineButtonActionPerformed
        /* InvoiceLinesUI items=new  InvoiceLinesUI();
         items .setVisible(true);
         this.dispose();*/
       //controller.addIteam();
    }//GEN-LAST:event_addInvoiceLineButtonActionPerformed

    private void deleteInvoiceLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceLineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceLineButtonActionPerformed

    private void invoiceLinesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceLinesTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceLinesTableMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentUI().setVisible(true);
            }
        });
    }

    public ArrayList<InvoiceHeader> getInvoiceHeaderArray() {
        if (invoiceHeaderArray == null) {
            invoiceHeaderArray = new ArrayList<>();
        }
        return invoiceHeaderArray;
    }

    public void setInvoiceHeaderArray(ArrayList<InvoiceHeader> invoiceHeaderArray) {
        this.invoiceHeaderArray = invoiceHeaderArray;
        invoiceHeaderTableModel = new InvoiceHeaderTableModel(invoiceHeaderArray);
        this.invoiceHeaderTable.setModel(invoiceHeaderTableModel);
        
     //   DefaultTableModel tbModel = (DefaultTableModel) ParentUI.invoiceHeaderTable.getModel();
      //      tbModel.addRow(data);
    }

    public InvoiceItemTableModel getInvoiceLineTableModule() {
        return invoiceItemTableMod;
    }

    public InvoiceHeaderTableModel getInvoiceHeaderTableModule() {
        if (invoiceHeaderTableMod == null) {
            invoiceHeaderTableMod = new InvoiceHeaderTableModel(getInvoiceHeaderArray());
        }
        return invoiceHeaderTableMod;
    }

    public List<ListSelectionModel> getModels() {
        return models;
    }

    public javax.swing.JLabel getInvNumberLbl() {
        return invoiceNumLabel;
    }

    public javax.swing.JLabel getInvoiceDateTF() {
        return invoiceDateLabel;
    }

    public javax.swing.JLabel getCustomerNameTF() {
        return customerNameLabel;
    }

    public javax.swing.JLabel getInvoiceTotalLbl() {
        return invoiceTotalLabel;
    }

    public javax.swing.JTable getInvoiceTable() {
        return invoiceHeaderTable;
    }

    public javax.swing.JTable getInvoiceItemsTable() {
        return invoiceLinesTable;
    }
     public ActionController getController() {
        return controller;
    }
    public int getNextInvoiceNumber() {
        int n = 0;

        for (InvoiceHeader invoice : getInvoiceHeaderArray()) {
            if (invoice.getInvoiceNum() > n) {
                n = invoice.getInvoiceNum();
            }
        }
        return ++n;
    }
    private InvoiceHeaderTableModel invoiceHeaderTableMod;

    private InvoiceItemTableModel invoiceItemTableMod;
    private List<ListSelectionModel> models = new ArrayList<>();
    private ArrayList<InvoiceHeader> invoiceHeaderArray;
    private InvoiceHeaderTableModel invoiceHeaderTableModel;
    private ActionController controller;
    //  private  InvoiceHeaderUI  invoice;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInvoiceHeaderButton;
    private javax.swing.JButton addInvoiceLineButton;
    public javax.swing.JLabel customerName;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvoiceHeaderButton;
    private javax.swing.JButton deleteInvoiceLineButton;
    private javax.swing.JLabel invoiceDate;
    private javax.swing.JLabel invoiceDateLabel;
    public static javax.swing.JTable invoiceHeaderTable;
    private javax.swing.JLabel invoiceItems;
    private javax.swing.JTable invoiceLinesTable;
    private javax.swing.JLabel invoiceNum;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JLabel invoiceTotal;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadIteam;
    private javax.swing.JMenuItem saveItem;
    // End of variables declaration//GEN-END:variables

}
