package app.controller;

import app.model.InvoiceHeader;
import app.model.InvoiceItem;
import app.model.InvoiceItemTableModel;
import app.view.ParentUI;
import app.view.InvoiceHeaderUI;
import app.view.InvoiceLinesUI;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActionController implements ActionListener, ListSelectionListener {

    private final ParentUI parentUI;
    private InvoiceHeaderUI newInvoice;
    private InvoiceLinesUI invoiceLinesUI;

    public ActionController(ParentUI parentUI) {
        this.parentUI = parentUI;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create Invoice": {
                createInvoice();
                break;
            }
            case "SaveHeaderData": {
                saveHeaderData();
                break;

            }
            case "CancelHeaderData": {
                cancelHeaderData();
                break;

            }
            case "Delete Invoice": {
                deleteInvoice();
                break;
            }
            case "Load File": {
                loadFile();
                break;
            }
            case "Save File": {
                saveFile();
                break;
            }
            case "Add Iteam": {
                addIteam();
                break;
            }
            case "SaveItemData": {
                saveIteamData();
                break;
            }
            case "CancelItemData": {
                cancelIteamData();
                break;
            }
            case "Delete Iteam": {
                deleteIteam();
                break;
            }
        }
    }
    public void createInvoice() {
        newInvoice = new InvoiceHeaderUI(parentUI);
        newInvoice.setVisible(true);
    }

    public void saveHeaderData() {

        String dateInv = newInvoice.getInvoiceDateField().getText();
        String customerName = newInvoice.getCustomerNameField().getText();
        int numberInv = parentUI.getNextInvoiceNumber();
       try {
            String[] dateSplits = dateInv.split("-");
            if (dateSplits.length != 3) {

                JOptionPane.showMessageDialog(
                        parentUI, "Please enter a valid Date ", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int dayDate = Integer.parseInt(dateSplits[0]);
                int monthDate = Integer.parseInt(dateSplits[1]);
                int yearDate = Integer.parseInt(dateSplits[2]);


                if (dayDate > 31 || monthDate > 12 || yearDate > 3000||yearDate < 1000) {
                    JOptionPane.showMessageDialog(
                            parentUI, "Please enter a valid Date ", "Error", JOptionPane.ERROR_MESSAGE);
                } else 
            {

        InvoiceHeader invoice = new InvoiceHeader(numberInv, customerName, dateInv);
        ArrayList<InvoiceHeader> invoiceHeader = parentUI.getInvoiceHeaderArray();
        invoiceHeader.add(invoice);
        parentUI.setInvoiceHeaderArray(invoiceHeader);
        parentUI.getInvoiceHeaderTableModule().fireTableDataChanged();
        newInvoice.setVisible(false);
        newInvoice.dispose();
        newInvoice = null;
        }
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    parentUI, "Please enter a valid Date ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteInvoice() {
        int selectionRow = parentUI.getInvoiceTable().getSelectedRow();
        if (selectionRow != -1) {
            parentUI.getInvoiceHeaderArray().remove(selectionRow);
            parentUI.getInvoiceHeaderTableModule().fireTableDataChanged();
        }
    }

    public void loadFile() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(parentUI);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fileChooser.getSelectedFile();
                String hPath = headerFile.getAbsolutePath();
                Path hp = Paths.get(hPath);
                List<String> hLines = Files.lines(hp).collect(Collectors.toList());
                ArrayList<InvoiceHeader> invoiceHeaderArray = new ArrayList<>();
                for (String hLine : hLines) {
                    String[] invContent = hLine.split(",");

                    int id = Integer.parseInt(invContent[0]);
                    InvoiceHeader invHead = new InvoiceHeader(id, invContent[1], invContent[2]);
                    invoiceHeaderArray.add(invHead);
                }
                result = fileChooser.showOpenDialog(parentUI);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String lPath = fileChooser.getSelectedFile().getAbsolutePath();
                    Path lp = Paths.get(lPath);
                    List<String> lLines = Files.lines(lp).collect(Collectors.toList());
                    for (String lLine : lLines) {
                        String[] itmContent = lLine.split(",");
                        int itmID = Integer.parseInt(itmContent[0]);
                        double itmPrice = Double.parseDouble(itmContent[2]);
                        int itmCount = Integer.parseInt(itmContent[3]);
                        InvoiceHeader header = findInvoiceHeaderByID(invoiceHeaderArray, itmID);
                        InvoiceItem invLine = new InvoiceItem(header, itmContent[1], itmCount, itmPrice);
                        header.getCustomerItems().add(invLine);

                    }
                    parentUI.setInvoiceHeaderArray(invoiceHeaderArray);

                    for (InvoiceHeader inv : invoiceHeaderArray) {
                        System.out.println("\nInvoice " + inv.getInvoiceNum() + "\n{ \n"
                                + inv.getCustName() + ",\n" + inv.getInvoiceDate());

                        for (InvoiceItem item : inv.getCustomerItems()) {
                            System.out.println(item.getItemName() + ","
                                    + item.getItemPrice() + "," + item.getCount());
                        }
                        System.out.println("}");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InvoiceHeader findInvoiceHeaderByID(ArrayList<InvoiceHeader> invoices, int id) {
        for (InvoiceHeader invoice : invoices) {
            if (invoice.getInvoiceNum() == id) {
                return invoice;
            }
        }
        return null;
    }

    private void saveFile() {
        ArrayList<InvoiceHeader> invoiceHeaders = parentUI.getInvoiceHeaderArray();
        String invHeaders = "";
        String invLines = "";

        for (InvoiceHeader invoice : invoiceHeaders) {
            String invHeadersFormat = invoice.getAsCSV();
            invHeaders += invHeadersFormat;
            invHeaders += "\n";

            for (InvoiceItem inv : invoice.getCustomerItems()) {
                String linessFormat = inv.getAsCSV();
                invLines += linessFormat;
                invLines += "\n";
            }
        }
        try {
            JFileChooser fileChooser = new JFileChooser();
            int fileSaver = fileChooser.showSaveDialog(parentUI);
            if (fileSaver == JFileChooser.APPROVE_OPTION) {
                File invFile = fileChooser.getSelectedFile();
                FileWriter invFileWriter = new FileWriter(invFile);
                invFileWriter.write(invHeaders);
                invFileWriter.flush();
                invFileWriter.close();

                fileSaver = fileChooser.showSaveDialog(parentUI);
            }
            if (fileSaver == JFileChooser.APPROVE_OPTION) {
                File lineFile = fileChooser.getSelectedFile();
                FileWriter lineFileWriter = new FileWriter(lineFile);
                lineFileWriter.write(invLines);
                lineFileWriter.flush();
                lineFileWriter.close();
            }
        } catch (Exception e) {
        }
    }

    public void saveIteamData() {
        String newItem = invoiceLinesUI.getItemNameField().getText();
        String count = invoiceLinesUI.getItemCountField().getText();
        String nwPrice = invoiceLinesUI.getItemPriceField().getText();
        int counts = Integer.parseInt(count);
        double prices = Double.parseDouble(nwPrice);
        int selectedInvoice = parentUI.getInvoiceTable().getSelectedRow();
        if (selectedInvoice != -1) {

            InvoiceHeader newInvoice = parentUI.getInvoiceHeaderArray().get(selectedInvoice);
            InvoiceItem newLine = new InvoiceItem(newInvoice, newItem, counts, prices);
            newInvoice.getCustomerItems().add(newLine);
            InvoiceItemTableModel linesTableModel = (InvoiceItemTableModel) parentUI.getInvoiceItemsTable().getModel();
            linesTableModel.fireTableDataChanged();
            parentUI.getInvoiceHeaderTableModule().fireTableDataChanged();
        }
        invoiceLinesUI.setVisible(false);
        invoiceLinesUI.dispose();
        invoiceLinesUI = null;
    }

    private void deleteIteam() {
        int selectedRow = parentUI.getInvoiceItemsTable().getSelectedRow();
        if (selectedRow != -1) {

            InvoiceItemTableModel linesTableModel = (InvoiceItemTableModel) parentUI.getInvoiceItemsTable().getModel();
            linesTableModel.getData().remove(selectedRow);
            linesTableModel.fireTableDataChanged();
            parentUI.getInvoiceHeaderTableModule().fireTableDataChanged();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel selectedModel = (ListSelectionModel) e.getSource();
        for (ListSelectionModel model : parentUI.getModels()) {
            if (model != selectedModel) {
                model.removeListSelectionListener(this);
                model.clearSelection();
                model.addListSelectionListener(this);
            }
        }
        int selectedRow = parentUI.getInvoiceTable().getSelectedRow();
        if (selectedRow != -1) {
            InvoiceHeader selectedInvoice = parentUI.getInvoiceHeaderArray().get(selectedRow);

            parentUI.getInvNumberLbl().setText("" + selectedInvoice.getInvoiceNum());
            parentUI.getInvoiceDateTF().setText(selectedInvoice.getInvoiceDate());
            parentUI.getCustomerNameTF().setText(selectedInvoice.getCustName());
            parentUI.getInvoiceTotalLbl().setText("" + selectedInvoice.getTotal());
            InvoiceItemTableModel invLineTableMod = new InvoiceItemTableModel(selectedInvoice.getCustomerItems());
            parentUI.getInvoiceItemsTable().setModel(invLineTableMod);
            invLineTableMod.fireTableDataChanged();
        }

    }

    public void addIteam() {
        invoiceLinesUI = new InvoiceLinesUI(parentUI);
        invoiceLinesUI.setVisible(true);

    }

    private void cancelIteamData() {
        invoiceLinesUI.setVisible(false);
        invoiceLinesUI.dispose();
        invoiceLinesUI = null;
    }

    private void cancelHeaderData() {
        newInvoice.setVisible(false);
        newInvoice.dispose();
        newInvoice = null;
    }

}
