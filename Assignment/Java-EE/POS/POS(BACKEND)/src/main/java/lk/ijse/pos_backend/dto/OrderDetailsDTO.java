package lk.ijse.pos_backend.dto;

import lk.ijse.pos_backend.entity.ItemEntity;
import lk.ijse.pos_backend.entity.OrderDetailsEntity;
import lk.ijse.pos_backend.entity.OrderEntity;
import lombok.Data;

@Data
public class OrderDetailsDTO {
    private String OrderDetailsID;
    private OrderEntity Order;
    private ItemEntity Item;
    private String ItemName;
    private double UnitPrice;
    private int Quantity;

    public OrderDetailsEntity ToEntity() {
        OrderDetailsEntity orderDetailsEntity = new OrderDetailsEntity();
        orderDetailsEntity.setOrderDetailsID(this.OrderDetailsID);
        orderDetailsEntity.setOrder(this.Order);
        orderDetailsEntity.setItem(this.Item);
        orderDetailsEntity.setItemName(this.ItemName);
        orderDetailsEntity.setUnitPrice(this.UnitPrice);
        orderDetailsEntity.setQuantity(this.Quantity);
        return orderDetailsEntity;
    }
}
