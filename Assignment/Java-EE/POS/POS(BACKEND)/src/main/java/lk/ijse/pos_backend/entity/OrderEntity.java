package lk.ijse.pos_backend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    referencedColumnName = "id",
            nullable = false)
    private CustomerEntity customer;
    @Temporal(TemporalType.DATE)//Date Without Time
    @Column(name = "date")
    private Date date;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "Order")
    private List<OrderDetailsEntity>orderDetailsEntities = new ArrayList<>();

}
