package lk.ijse.pos_backend.model;

import lombok.Data;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@Data
public class Item {
    private String code;
    private String name;
    private int qty;
    private double price;
}
