package lk.ijse.pos_backend.bo.custom.impl;

import lk.ijse.pos_backend.bo.custom.OrderDetailsBO;
import lk.ijse.pos_backend.dto.OrderDetailsDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class OrderDetailsBOIMPL implements OrderDetailsBO {
    @Override
    public String SaveOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        return null;
    }

    @Override
    public OrderDetailsDTO getOrderDetails(String id) {
        return null;
    }

    @Override
    public boolean UpdateOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        return false;
    }

    @Override
    public boolean DeleteOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        return false;
    }
}
