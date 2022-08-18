package bai2;

import java.util.List;

public interface manager {
   public void add(List<Customer> list);
   public void display(List<Customer> list);
   public void remove(List<Customer> list, int i);
   public void edit(List<Customer> list, int i);

    
}
