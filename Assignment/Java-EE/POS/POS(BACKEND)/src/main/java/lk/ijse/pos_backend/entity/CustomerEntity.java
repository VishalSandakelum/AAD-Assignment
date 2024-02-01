package lk.ijse.pos_backend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name = "id",length = 50)
    private String id;
    @Column(name = "name",
            length = 100,
            nullable = false)
    private String name;
    @Column(name = "number",
            nullable = false)
    private int number;
    @Column(name = "salary")
    private double salary;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private List<OrderEntity>orderEntities = new ArrayList<>();
}
