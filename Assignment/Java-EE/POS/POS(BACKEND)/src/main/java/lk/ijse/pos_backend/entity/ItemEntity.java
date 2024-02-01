package lk.ijse.pos_backend.entity;

import javax.persistence.*;

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
    @Column(name = "name", length =100)
    private String name;
    @Column(name = "qty")
    private int qty;
    @Column(name = "price")
    private double price;
}
