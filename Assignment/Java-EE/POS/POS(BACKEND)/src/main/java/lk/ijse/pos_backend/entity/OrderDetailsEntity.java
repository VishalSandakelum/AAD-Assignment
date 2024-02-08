package lk.ijse.pos_backend.entity;

import lombok.*;

import javax.persistence.*;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsEntity {
    private String OrderDetailsID;
    private String ItemName;
    private int Quantity;
    private double UnitPrice;
    private String ItemID;
    private String OrderID;
}
