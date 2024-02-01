package lk.ijse.pos_backend.dao.custom;

import lk.ijse.pos_backend.dao.CrudDao;
import lk.ijse.pos_backend.entity.OrderDetailsEntity;
import org.hibernate.Session;

public interface OrderDetailsDao extends CrudDao<OrderDetailsEntity,String> {
    void SetSession(Session session);
}
