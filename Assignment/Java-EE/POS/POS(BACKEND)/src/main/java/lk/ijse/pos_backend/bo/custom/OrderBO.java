package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.OrderDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface OrderBO extends SuperBO {
    String SaveOrder(OrderDTO orderDTO);
    OrderDTO getOrder(String id);
    boolean UpdateOrder(OrderDTO orderDTO);
    boolean DeleteOrder(OrderDTO orderDTO);
}
