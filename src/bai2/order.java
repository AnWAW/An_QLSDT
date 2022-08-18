package bai2;

import java.util.Date;

public class order {
    private String orderId;
    private String phoneId;
    private String empId;
    private String cusName;
    private double price;
    private int quantity;
    private int orderValue;
    private Date date;

    public order(){
    }
    public order(String orderId, String phoneId, String empId,String cusName,double price, int quantity,int orderValue, Date date)
    {
        this.orderId = orderId;
        this.phoneId = phoneId;
        this.empId = empId;
        this.cusName = cusName;
        this.price = price;
        this.quantity = quantity;
        this.orderValue = orderValue;
        this.date = date;
    }
    public String getById(String orderId, String phoneId, String empId){
        return "Order co " + orderId
        + " phone " + phoneId + " emp " +
        empId;
    }
    public boolean checkOrder(String phoneId,String cusName,String orderId){
        if(phoneId != null && cusName != null && orderId != null)
        {
            return true;
        }
        return false;
    }
    public void showOrder(String orderId, String phoneId, String empId,String cusName,double price, int quantity,int orderValue, Date date ){
        System.out.println("Bang order bao gom ");
        System.out.println("order id " + orderId);
        System.out.println("phone id " + phoneId);
        System.out.println("emp id " + empId);
        System.out.println("customer name " + cusName);
        System.out.println("price " + price);
        System.out.println("quantity " + quantity);
        System.out.println("order value " + orderValue);
        System.out.println("date " + date);
        System.out.println("*____________________________________*");
    }
}
