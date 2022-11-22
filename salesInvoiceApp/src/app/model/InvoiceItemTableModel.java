
package app.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceItemTableModel extends AbstractTableModel{
    private final ArrayList<InvoiceItem> itemsData;
    private final String[] colmsName = {"No.","Item Name","Item Price","Count", "Iteam Total"};

    public InvoiceItemTableModel(ArrayList<InvoiceItem> itemData) {
        this.itemsData = itemData;
    }
public ArrayList<InvoiceItem> getData() {
        return itemsData;
    }
    @Override
    public int getRowCount() {
       return itemsData.size();
    }

    @Override
    public int getColumnCount() {
         return colmsName.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     InvoiceItem invoiceItem =itemsData.get(rowIndex);
        switch (columnIndex){
            case 0:
                return invoiceItem.getInvoicHeader().getInvoiceNum();
            case 1:
                return invoiceItem.getItemName();
            case 2:
                return invoiceItem.getItemPrice();
            case 3:
                return invoiceItem.getCount();
            case 4:
                return invoiceItem.getTotal();
        }
        return "";  
    }
     @Override
    public String getColumnName(int column) {
        return colmsName[column];
    }
}
