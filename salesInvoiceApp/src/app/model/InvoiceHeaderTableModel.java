
package app.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceHeaderTableModel  extends AbstractTableModel{
    private ArrayList<InvoiceHeader> invoiceData;
    private String[] colmsName = {"No.","Date","Customer","Total"};

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> data) {
        this.invoiceData = data;
    }

    @Override
    public int getRowCount() {
        return invoiceData.size();
    }

    @Override
    public int getColumnCount() {
         return colmsName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    InvoiceHeader invoiceHeader = invoiceData.get(rowIndex);
    switch (columnIndex){
        case 0:
            return invoiceHeader.getInvoiceNum();
        case 1:
            return invoiceHeader.getCustName();
        case 2:
            return invoiceHeader.getInvoiceDate();
        case 3:
            return invoiceHeader.getTotal();
    }
        return "";
    }
  @Override
    public String getColumnName(int column) {
        return colmsName[column];
    }

    
}
