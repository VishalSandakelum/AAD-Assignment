package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDao;
import lk.ijse.pos_backend.entity.OrderEntity;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/
public class OrderDaoImpl implements OrderDao {
    @Override
    public String Save(OrderEntity orderEntity) {
        return null;
    }

    @Override
    public OrderEntity Get(String s) {
        return null;
    }

    @Override
    public void Update(OrderEntity orderEntity) {

    }

    @Override
    public void Delete(OrderEntity orderEntity) {

    }

    @Override
    public void SetSession(Session session) {

    }
}
