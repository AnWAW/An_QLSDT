package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class main {
    public static void main(String[] args) {
        manager ma = (manager) new operation();
        manager_emp me = (manager_emp) new operation_emp();

        Scanner sc = new Scanner(System.in);
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("1", "getCusName", "getCusPhone", "getCusAddress"));
        list.add(new Customer("2", "getCusName", "getCusPhone", "getCusAddress"));
        list.add(new Customer("3", "getCusName", "getCusPhone", "getCusAddress"));

        List<employee> listEmp = new ArrayList<>();
        listEmp.add(new employee("1", "empName", "000", "empAddress"));
        listEmp.add(new employee("2", "empName", "001", "empAddress"));

        while(true){
            System.out.println("0: Ket thuc");
            System.out.println("1 : nhap customer");
            System.out.println("2 : hien thi customer");
            System.out.println("3 : nhap employee");
            System.out.println("4 : hien thi employee");
            System.out.println("5: xoa khach hang");
            System.out.println("6: xoa nhan vien");
            System.out.println("7: sua khach hang");
            System.out.println("8: sua nhan vien");
            System.out.println("Nhap key");
            int key = sc.nextInt();
            int index = 0;
            switch (key) {

                case 1:
                    ma.add(list);
                    break;
                case 2:
                    ma.display(list);
                    break;
                case 3:
                    me.add(listEmp);
                    break;
                case 4:
                    me.display(listEmp);
                    break;
                case 5:
                    System.out.println("input remove index");
                    index = sc.nextInt();
                    ma.remove(list, (index-1));
                    break;
                case 6:
                    System.out.println("input remove index");
                    index = sc.nextInt();
                    me.remove(listEmp, (index-1));
                    break;
                case 7:
                    System.out.println("put edit index ");
                    index = sc.nextInt();
                    ma.edit(list, (index-1));
                    break;
                case 8:
                    System.out.println("put edit index ");
                    index = sc.nextInt();
                    me.edit(listEmp, (index-1));
                    break;
                case 0:
                    System.out.println("Ket thuc");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
