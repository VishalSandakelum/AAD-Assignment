package lk.ijse.pos_backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    private String id;
    private String name;
    private String address;
    private double salary;
}
