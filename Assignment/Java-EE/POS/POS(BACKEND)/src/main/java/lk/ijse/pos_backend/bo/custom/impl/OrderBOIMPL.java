package lk.ijse.pos_backend.bo.custom.impl;

import lk.ijse.pos_backend.bo.custom.OrderBO;
import lk.ijse.pos_backend.dto.OrderDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class OrderBOIMPL implements OrderBO {
    @Override
    public String SaveOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO getOrder(String id) {
        return null;
    }

    @Override
    public boolean UpdateOrder(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean DeleteOrder(OrderDTO orderDTO) {
        return false;
    }
}
