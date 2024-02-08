package lk.ijse.pos_backend.bo.custom.impl;

import lk.ijse.pos_backend.bo.custom.OrderBO;
import lk.ijse.pos_backend.dto.OrderDTO;
import lk.ijse.pos_backend.dto.OrderDetailsDTO;
import lk.ijse.pos_backend.entity.OrderEntity;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class OrderBOIMPL implements OrderBO {
    @Override
    public ArrayList<OrderEntity> GetAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean SaveOrder(OrderDTO orderDTO, OrderDetailsDTO orderDetailsDTO) {
        return null;
    }

    @Override
    public OrderEntity getOrder(String id) {
        return null;
    }

    @Override
    public boolean UpdateOrder(OrderDTO orderDTO, OrderDetailsDTO orderDetailsDTO) {
        return false;
    }

    @Override
    public boolean DeleteOrder(OrderDTO orderDTO, OrderDetailsDTO orderDetailsDTO) {
        return false;
    }
}
