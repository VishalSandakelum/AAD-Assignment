package lk.ijse.pos_backend.dto;

import lk.ijse.pos_backend.entity.CustomerEntity;
import lombok.Data;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data
public class CustomerDTO {
    private String Id;
    private String Name;
    private int Number;
    private double Salary;

    public CustomerEntity ToEntity(){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(this.Id);
        customerEntity.setName(this.Name);
        customerEntity.setNumber(this.Number);
        customerEntity.setSalary(this.Salary);
        return customerEntity;
    }
}
