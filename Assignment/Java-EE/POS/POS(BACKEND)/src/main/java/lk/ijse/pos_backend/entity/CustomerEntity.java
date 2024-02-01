package lk.ijse.pos_backend.entity;

import javax.persistence.*;


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
    @Column(name = "name",length = 100)
    private String name;
    @Column(name = "number")
    private int number;
    @Column(name = "salary")
    private double salary;
}
