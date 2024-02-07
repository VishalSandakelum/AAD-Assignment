package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.ItemDao;
import lk.ijse.pos_backend.entity.ItemEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class ItemDaoImpl implements ItemDao {
    private Session session;

    @Override
    public Boolean Save(ItemEntity itemEntity) {
        //return session.save(itemEntity);
        return null;
    }

    @Override
    public ItemEntity Get(String id) {
        return session.get(ItemEntity.class, id);
    }

    @Override
    public void Update(ItemEntity itemEntity) {
        session.update(itemEntity);
    }

    @Override
    public void Delete(ItemEntity itemEntity) {
        session.delete(itemEntity);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}
