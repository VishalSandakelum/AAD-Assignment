package lk.ijse.pos_backend.dao.custom;

import lk.ijse.pos_backend.dao.CrudDao;
import lk.ijse.pos_backend.entity.OrderDetailsEntity;
import org.hibernate.Session;

import java.sql.Connection;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public interface OrderDetailsDao extends CrudDao<OrderDetailsEntity,String> {
    void SetSession(Session session);
    void SetConnection(Connection connection);
}
