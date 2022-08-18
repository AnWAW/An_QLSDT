package Bai1;

public class hinhhoc {

    public float tinh_P_hcn(float a,float b){
        float p = ((a + b) * 2);
        return p;
    }
    public void tinh_P_hv(float c){
        float p = c * 4;
        System.out.println("chu vi la: " + p);
    }
    public float tinh_S_hcn(float a,float b){
        float s = (a * b);
        return s;
    }
    public void tinh_S_hv(float c){
        float s = c * c;
        System.out.println("chu vi la: " + s);
    }
}
