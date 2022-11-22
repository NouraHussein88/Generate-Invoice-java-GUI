
package app.model;


public class InvoiceItem {

    private InvoiceHeader invoice;
    private String itemName;
    private int count;
    private double itemPrice;


    public InvoiceItem(InvoiceHeader invoice, String itemName,  int count,double itemPrice) {
        this.invoice = invoice;
        this.itemName = itemName;
        this.count = count;
        this.itemPrice = itemPrice;
       
    }

    public InvoiceHeader getInvoicHeader() {
        return invoice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setInvoicNum(InvoiceHeader  invoicNum) {
        this.invoice = invoicNum;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal() {
        return count*itemPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }
    
    public String getAsCSV(){
        return invoice.getInvoiceNum() + "," + getItemName() + "," +  getItemPrice()
                + "," + getCount() ;
    }
}
