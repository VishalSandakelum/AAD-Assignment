package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDetailsDao;
import lk.ijse.pos_backend.entity.OrderDetailsEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class OrderDetailsDaoImpl implements OrderDetailsDao {
    private Session session;

    @Override
    public Boolean Save(OrderDetailsEntity orderDetailsEntity) {
        //return session.save(orderDetailsEntity);
        return null;
    }

    @Override
    public OrderDetailsEntity Get(String id) {
        return session.get(OrderDetailsEntity.class,id);
    }

    @Override
    public void Update(OrderDetailsEntity orderDetailsEntity) {
        session.update(orderDetailsEntity);
    }

    @Override
    public void Delete(OrderDetailsEntity orderDetailsEntity) {
        session.delete(orderDetailsEntity);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}
