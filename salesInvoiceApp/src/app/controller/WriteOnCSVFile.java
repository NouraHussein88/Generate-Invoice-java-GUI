
package app.controller;

import app.model.InvoiceHeader;
import app.model.InvoiceItem;
import java.util.ArrayList;


public class WriteOnCSVFile {
    
      public void writeFile(ArrayList<InvoiceHeader> invoiceHeaders){
        for(InvoiceHeader invoice : invoiceHeaders)
        {
            int invId = invoice.getInvoiceNum();
            String date = invoice.getInvoiceDate();
            String customer = invoice.getCustName();
            System.out.println("\n Invoice " + invId + "\n {\n " + date + "," + customer);
            for(InvoiceItem items : invoice.getCustomerItems()){
                System.out.println(items.getItemName() + "," + items.getItemPrice() + "," + items.getCount());
            }
            System.out.println(" } \n");
        }
    }

    
}
