package bai2;

import java.util.List;
import java.util.Scanner;

public class operation implements manager {

    @Override
    public void add(List<Customer> list) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id:");
        String id = sc.nextLine();
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap phone:");
        String phone = sc.nextLine();
        System.out.println("Nhap Address:");
        String address = sc.nextLine();

        Customer cus = new Customer(id, name, phone, address);
        list.add(cus);

        
    }

    @Override
    public void display(List<Customer> list) {
        // TODO Auto-generated method stub
        for (Customer cus : list) {
            System.out.println(cus);
        }
        
    }

    @Override
    public void remove(List<Customer> list, int i) {
        // TODO Auto-generated method stub
        for(int j = 0; j < list.size() ; j++)
        {
            if(j == i)
            {
                list.remove(j);
                break;
            }
        }
        
    }

    /* (non-Javadoc)
     * @see bai2.manager#edit(java.util.List, int)
     */
    @Override
    public void edit(List<Customer> list, int i) {
        // TODO Auto-generated method stub
        for(int j = 0 ; j < list.size() ; j ++)
        {
            if(j == i ){
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap Id:");
                String id = sc.nextLine();
                System.out.println("Nhap ten:");
                String name = sc.nextLine();
                System.out.println("Nhap phone:");
                String phone = sc.nextLine();
                System.out.println("Nhap Address:");
                String address = sc.nextLine();

                list.get(j).setCusId(id);
                list.get(j).setCusName(name);
                list.get(j).setCusPhone(phone);
                list.get(j).setCusAddress(address);
                break;
            }
        }
        
    }
    
}
