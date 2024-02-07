package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDao;
import lk.ijse.pos_backend.entity.OrderEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class OrderDaoImpl implements OrderDao {
    private Session session;

    @Override
    public Boolean Save(OrderEntity orderEntity) {
        //return (String) session.save(orderEntity);
        return null;
    }

    @Override
    public OrderEntity Get(String id) {
        return session.get(OrderEntity.class,id);
    }

    @Override
    public void Update(OrderEntity orderEntity) {
        session.update(orderEntity);
    }

    @Override
    public void Delete(OrderEntity orderEntity) {
        session.delete(orderEntity);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}
