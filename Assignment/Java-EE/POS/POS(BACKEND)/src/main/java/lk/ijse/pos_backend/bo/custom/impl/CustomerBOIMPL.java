package lk.ijse.pos_backend.bo.custom.impl;

import lk.ijse.pos_backend.bo.custom.CustomerBO;
import lk.ijse.pos_backend.dto.CustomerDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class CustomerBOIMPL implements CustomerBO {
    @Override
    public String SaveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO getCustomer(String id) {
        return null;
    }

    @Override
    public boolean UpdateCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean DeleteCustomer(CustomerDTO customerDTO) {
        return false;
    }
}
