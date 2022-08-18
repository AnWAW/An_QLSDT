package Bai1;

import java.util.Scanner;

public class home {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hinh_cn hcn = new hinh_cn();
        hinh_vuong hv = new hinh_vuong();
        System.out.println("Nhap key");
        System.out.println("1 la tinh chu vi dien tich hinh chu nhat");
        System.out.println("2 la tinh chu vi dien tich hinh vuong");
        int key = sc.nextInt();
        
        switch (key) {
            case 1:
                System.out.println("Nhap cd");
                hcn.set_cd(sc.nextFloat());
                System.out.println("Nhap cr");
                hcn.set_cr(sc.nextFloat());
                System.out.println("chu vi " + hcn.tinh_P_hcn(hcn.get_cd(), hcn.get_cr()));
                System.out.println("dien tich " + hcn.tinh_S_hcn(hcn.get_cd(), hcn.get_cr()));
                break;
            case 2: 
                System.out.println("Nhap canh");      
                hv.set_canh(sc.nextFloat());
                hv.tinh_P_hv(hv.get_canh());
                hv.tinh_S_hv(hv.get_canh());
                break;
            default:System.out.println("Dang o default");
                break;
        }
    }
}
