package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.OrderDTO;
import lk.ijse.pos_backend.dto.OrderDetailsDTO;
import lk.ijse.pos_backend.entity.OrderEntity;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface OrderBO extends SuperBO {
    ArrayList<OrderEntity> GetAll() throws SQLException, ClassNotFoundException;
    Boolean SaveOrder(OrderDTO orderDTO, OrderDetailsDTO orderDetailsDTO);
    OrderEntity getOrder(String id);
    boolean UpdateOrder(OrderDTO orderDTO, OrderDetailsDTO orderDetailsDTO);
    boolean DeleteOrder(String OrderId);
}
