package app.model;

public class CustomerData {
    private String custNam;
    private String ID;

    public CustomerData(String custNam, String ID) {
        this.custNam = custNam;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCustNam() {
        return custNam;
    }

    public void setCustNam(String custNam) {
        this.custNam = custNam;
    }
    
}
