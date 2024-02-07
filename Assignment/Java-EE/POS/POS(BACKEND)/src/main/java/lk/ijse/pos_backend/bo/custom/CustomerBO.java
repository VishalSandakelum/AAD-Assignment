package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.CustomerDTO;
import lk.ijse.pos_backend.entity.CustomerEntity;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface CustomerBO extends SuperBO {
    ArrayList<CustomerEntity> GetAll() throws SQLException, ClassNotFoundException;
    Boolean SaveCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomer(String id);
    boolean UpdateCustomer(CustomerDTO customerDTO);
    boolean DeleteCustomer(CustomerDTO customerDTO);
}
