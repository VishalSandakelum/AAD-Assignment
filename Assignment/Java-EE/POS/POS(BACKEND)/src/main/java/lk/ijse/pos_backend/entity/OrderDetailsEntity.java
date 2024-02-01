package lk.ijse.pos_backend.entity;

import lombok.Data;

import javax.persistence.*;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data

@Entity
@Table(name = "order_details")
public class OrderDetailsEntity {
    @Id
    @Column(name = "order_details_id",
            length = 50)
    private String OrderDetailsID;
    @ManyToOne
    @JoinColumn(name = "order_id",
            referencedColumnName = "order_id",
            nullable = false)
    private OrderEntity Order;
    @ManyToOne
    @JoinColumn(name = "item_id",
            referencedColumnName = "code",
            nullable = false)
    private ItemEntity Item;
    @Column(name = "item_name",
            nullable = false)
    private String ItemName;
    @Column(name = "unit_price",
            nullable = false)
    private double UnitPrice;
    @Column(name = "qty",
            nullable = false)
    private int Quantity;
}
