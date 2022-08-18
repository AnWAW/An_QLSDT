package Bai1;

public class hinh_vuong extends hinhhoc {
    public float p;
    public float s;
    private float canh;
    public hinh_vuong(float canh){
        canh = this.canh;
    }
    
    public hinh_vuong(){
    }

    public float get_canh(){
        return canh;
    }

    public void set_canh(float canh){
        this.canh = canh;
    }
    @Override
    public void tinh_P_hv(float canh) {
        // TODO Auto-generated method stub
        super.tinh_P_hv(canh);
    }
    @Override
    public void tinh_S_hv(float canh) {
        // TODO Auto-generated method stub
        super.tinh_S_hv(canh);
    }
}
