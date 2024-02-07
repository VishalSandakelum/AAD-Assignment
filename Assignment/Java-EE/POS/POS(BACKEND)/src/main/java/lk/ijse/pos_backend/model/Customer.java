package lk.ijse.pos_backend.model;

import lombok.*;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@Data
public class Customer {
    private String id;
    private String name;
    private String address;
    private double salary;
}
