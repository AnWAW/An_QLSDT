package bai2;

public class employee {
    private String empId;
    private String empName;
    private String empPhone;
    private String empAddress;

    public employee(){}
    public employee(String empId, String empName, String empPhone, String empAddress){
        this.empId = empId;
        this.empName = empName;
        this.empPhone = empPhone;
        this.empAddress = empAddress;
    }
    public String getEmpId(){
        return empId;
    }
    public void setEmpId(String empId){
        this.empId = empId;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }public String getEmpPhone(){
        return empPhone;
    }
    public void setEmpPhone(String empPhone){
        this.empPhone = empPhone;
    }public String getEmpAddress(){
        return empAddress;
    }
    public void setEmpAddress(String empPhone){
        this.empAddress = empAddress;
    }

    @Override
    public String toString(){
        return empId + "\t" + empName + "\t" + empName + "\t" + empAddress; 
    }
}
