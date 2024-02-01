package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.ItemDao;
import lk.ijse.pos_backend.entity.ItemEntity;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class ItemDaoImpl implements ItemDao {
    @Override
    public String Save(ItemEntity itemEntity) {
        return null;
    }

    @Override
    public ItemEntity Get(String s) {
        return null;
    }

    @Override
    public void Update(ItemEntity itemEntity) {

    }

    @Override
    public void Delete(ItemEntity itemEntity) {

    }

    @Override
    public void SetSession(Session session) {

    }
}
