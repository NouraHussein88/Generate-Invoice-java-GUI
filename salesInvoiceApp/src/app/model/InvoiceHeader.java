package app.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

    private int invoiceNum;
    private String invoiceDate;
    private String custName;
    private ArrayList<InvoiceItem> custItems;

    public InvoiceHeader(int invoiceNum, String invoiceDate, String Cust) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.custName = Cust;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String Cust) {
        this.custName = Cust;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public ArrayList<InvoiceItem> getCustomerItems() {
        if (custItems==null)
            custItems=new ArrayList();
        return custItems;
    }

    public double getTotal() {
        double total=0.0;
        for( InvoiceItem custItem:getCustomerItems())
         total+=custItem.getTotal();
        return total;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invoiceNum=" + invoiceNum + ", invoiceDate=" + invoiceDate + ", Cust=" + custName + ", customerItems=" + custItems + '}';
    }
    public String getAsCSV(){
        return invoiceNum + "," + invoiceDate + "," + custName;
    }
}
