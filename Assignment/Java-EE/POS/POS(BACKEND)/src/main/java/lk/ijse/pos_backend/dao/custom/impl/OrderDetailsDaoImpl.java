package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDetailsDao;
import lk.ijse.pos_backend.entity.OrderDetailsEntity;
import org.hibernate.Session;

public class OrderDetailsDaoImpl implements OrderDetailsDao {
    @Override
    public String Save(OrderDetailsEntity orderDetailsEntity) {
        return null;
    }

    @Override
    public OrderDetailsEntity Get(String s) {
        return null;
    }

    @Override
    public void Update(OrderDetailsEntity orderDetailsEntity) {

    }

    @Override
    public void Delete(OrderDetailsEntity orderDetailsEntity) {

    }

    @Override
    public void SetSession(Session session) {

    }
}
