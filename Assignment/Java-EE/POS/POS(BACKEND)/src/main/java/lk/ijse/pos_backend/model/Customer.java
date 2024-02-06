package lk.ijse.pos_backend.model;

import lombok.*;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String customerid;
    private String customername;
    private String customeraddress;
    private String customersalary;
}
