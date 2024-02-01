package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.OrderDetailsDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface OrderDetailsBO extends SuperBO {
    String SaveOrderDetails(OrderDetailsDTO orderDetailsDTO);
    OrderDetailsDTO getOrderDetails(String id);
    boolean UpdateOrderDetails(OrderDetailsDTO orderDetailsDTO);
    boolean DeleteOrderDetails(OrderDetailsDTO orderDetailsDTO);
}
