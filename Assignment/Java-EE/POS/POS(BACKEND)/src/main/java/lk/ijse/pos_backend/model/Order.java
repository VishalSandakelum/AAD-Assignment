package lk.ijse.pos_backend.model;

import lombok.Data;

import java.util.Date;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@Data
public class Order {
    private String orderId;
    private String date;
    private String customerId;
    private String orderDetailsId;
    private String itemName;
    private int qty;
    private double unitPrice;
    private String itemId;
}
