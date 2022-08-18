package bai2;

public class phone {
    private String phoneId;
    private String phoneName;
    private double price;
    private int quantity;

    phone(){

    }
    phone(String phoneId, String phoneName, double price, int quantity){
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getPhoneID(){
        return phoneId;
    }
    public String getPhoneName(){
        return phoneName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPhoneId(){
        this.phoneId = phoneId;
    }
    public void setPhoneName(){
        this.phoneName = phoneName;
    }
    public void setPrice(){
        this.price = price;
    }
    public void setQuantity(){
        this.quantity = quantity;
    }
}
