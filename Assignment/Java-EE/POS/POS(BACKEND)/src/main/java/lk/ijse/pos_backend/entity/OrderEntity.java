package lk.ijse.pos_backend.entity;

import javax.persistence.*;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @Column(name = "order_id", length = 50)
    private String order_id;
    @ManyToOne
    @JoinColumn(name = "customer_id",
    referencedColumnName = "id")
    private CustomerEntity customer;

}
