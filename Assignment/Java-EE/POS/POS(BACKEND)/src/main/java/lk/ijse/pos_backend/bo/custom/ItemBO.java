package lk.ijse.pos_backend.bo.custom;

import lk.ijse.pos_backend.bo.SuperBO;
import lk.ijse.pos_backend.dto.ItemDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface ItemBO extends SuperBO {
    String SaveItem(ItemDTO itemDTO);
    ItemDTO getItem(String id);
    boolean UpdateItem(ItemDTO itemDTO);
    boolean DeleteItem(ItemDTO itemDTO);
}
