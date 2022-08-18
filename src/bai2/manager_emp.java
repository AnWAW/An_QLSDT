package bai2;

import java.util.List;

public interface manager_emp {
    public void add(List<employee> listEmp);
    public void display(List<employee> listEmp);
    public void remove(List<employee> listEmp, int i);
    public void edit(List<employee> listEmp, int i);
}
