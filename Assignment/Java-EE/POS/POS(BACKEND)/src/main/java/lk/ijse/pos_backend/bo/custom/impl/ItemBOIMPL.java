package lk.ijse.pos_backend.bo.custom.impl;

import lk.ijse.pos_backend.bo.custom.ItemBO;
import lk.ijse.pos_backend.dto.ItemDTO;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class ItemBOIMPL implements ItemBO {
    @Override
    public String SaveItem(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO getItem(String id) {
        return null;
    }

    @Override
    public boolean UpdateItem(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean DeleteItem(ItemDTO itemDTO) {
        return false;
    }
}
