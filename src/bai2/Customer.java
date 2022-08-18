package bai2;

import java.util.List;

public class Customer {
    private String cusId;
    private String cusName;
    private String cusPhone;
    private String cusAddress;

    public Customer(){}
    public Customer(String cusId, String cusName, String cusPhone, String cusAddress){
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.cusAddress = cusAddress;
    }
    public String getCusId(){
        return cusId;
    }
    public void setCusId(String cusId){
        this.cusId = cusId;
    }
    public String getCusName(){
        return cusName;
    }
    public void setCusName(String cusName){
        this.cusName = cusName;
    }public String getCusPhone(){
        return cusPhone;
    }
    public void setCusPhone(String cusPhone){
        this.cusPhone = cusPhone;
    }public String getCusAddress(){
        return cusAddress;
    }
    public void setCusAddress(String cusAddress){
        this.cusAddress = cusAddress;
    }
    @Override
    public String toString(){
        System.out.println("Cus ID Co giat tri " + cusId);
        return cusId + "\t" + cusName + "\t" + cusPhone + "\t" + cusAddress; 
    }
    
}
