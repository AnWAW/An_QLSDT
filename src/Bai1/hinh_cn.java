package Bai1;

public class hinh_cn extends hinhhoc {
    private float cd;
    private float cr;

    public hinh_cn(float cd, float cr){
        cd = this.cd;
        cr = this.cr;
    }
    public hinh_cn(){

    }

    public float get_cd(){
        return cd;
    }
    public float get_cr(){
        return cr;
    }

    public void set_cd(float cd){
        this.cd = cd;
    }
    public void set_cr(float cr){
        this.cr = cr;
    }

    @Override
    public float tinh_P_hcn(float cd, float cr) {
        // TODO Auto-generated method stub
        return super.tinh_P_hcn(cd, cr);
    }
    @Override
    public float tinh_S_hcn(float cd, float cr) {
        // TODO Auto-generated method stub
        return super.tinh_S_hcn(cd, cr);
    }
    
}
