package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.ItemDao;
import lk.ijse.pos_backend.entity.ItemEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class ItemDaoImpl implements ItemDao {
    private Session session;

    @Override
    public ArrayList<ItemEntity> GetAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean Save(ItemEntity itemEntity) {
        //return session.save(itemEntity);
        return null;
    }

    @Override
    public ItemEntity Search(String id) {
        return session.get(ItemEntity.class, id);
    }

    @Override
    public Boolean Update(ItemEntity itemEntity) {
        return null;
    }

    @Override
    public Boolean Delete(String id) {
        return null;
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}
