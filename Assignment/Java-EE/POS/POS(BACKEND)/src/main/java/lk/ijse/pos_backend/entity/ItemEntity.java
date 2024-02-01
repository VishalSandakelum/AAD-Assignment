package lk.ijse.pos_backend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Entity
@Table(name = "item")
public class ItemEntity {
    @Id
    @Column(name = "code", length = 50)
    private String code;
    @Column(name = "name",
            length =100,
            nullable = false)
    private String name;
    @Column(name = "qty",
            nullable = false)
    private int qty;
    @Column(name = "price",
            nullable = false)
    private double price;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "Item")
    private List<OrderDetailsEntity>orderDetailsEntities = new ArrayList<>();
}
