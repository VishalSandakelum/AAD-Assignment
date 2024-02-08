package lk.ijse.pos_backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    private String order_id;
    private Date date;
    private String customerId;
}
