package lk.ijse.pos_backend.dto;

import lk.ijse.pos_backend.entity.CustomerEntity;
import lk.ijse.pos_backend.entity.OrderEntity;
import lombok.Data;

import java.util.Date;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data
public class OrderDTO {
    private String OrderId;
    private String CustomerId;
    private Date date;

    public OrderEntity ToEntity(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrder_id(this.OrderId);
        orderEntity.setCustomerId(this.CustomerId);
        orderEntity.setDate(this.date);
        return orderEntity;
    }
}
