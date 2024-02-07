package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.ItemDTO;
import lk.ijse.pos_backend.entity.ItemEntity;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface ItemBO extends SuperBO {
    ArrayList<ItemEntity> GetAll() throws SQLException, ClassNotFoundException;
    Boolean SaveItem(ItemDTO itemDTO);
    ItemEntity getItem(String itemCode);
    boolean UpdateItem(ItemDTO itemDTO);
    boolean DeleteItem(String itemCode);
}
