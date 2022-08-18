package bai2;

import java.util.List;
import java.util.Scanner;

public class operation_emp implements manager_emp {

    @Override
    public void add(List<employee> listEmp) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("input Id: ");
        String empID = sc.nextLine();
        System.out.print("input name: ");
        String empName = sc.nextLine();
        System.out.print("input phone: ");
        String empPhone = sc.nextLine();
        System.out.print("input Address: ");
        String empAddress = sc.nextLine();
        
        employee e = new employee(empID, empName, empPhone, empAddress);
        listEmp.add(e);
        
    }

    @Override
    public void display(List<employee> listEmp) {
        // TODO Auto-generated method stub
        for (employee e : listEmp) {
            System.out.println(e);
        }
        
    }

    @Override
    public void remove(List<employee> listEmp, int i) {
        // TODO Auto-generated method stub
        for(int j = 0; j < listEmp.size() ; j++)
        {
            if(j == i)
            {
                listEmp.remove(j);
                break;
            }
        }
        
    }

    @Override
    public void edit(List<employee> listEmp, int i) {
        // TODO Auto-generated method stub
        for(int j = 0 ; j < listEmp.size() ; j ++)
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

                listEmp.get(j).setEmpId(id);
                listEmp.get(j).setEmpName(name);
                listEmp.get(j).setEmpPhone(phone);
                listEmp.get(j).setEmpAddress(address);
                break;
            }
        }
        
    }
    
}
