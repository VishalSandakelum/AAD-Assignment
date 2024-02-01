package lk.ijse.pos_backend.dao.custom;

import lk.ijse.pos_backend.dao.CrudDao;
import lk.ijse.pos_backend.entity.ItemEntity;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface ItemDao extends CrudDao<ItemEntity,String> {
    void SetSession(Session session);
}
