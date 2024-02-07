package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.OrderDao;
import lk.ijse.pos_backend.entity.OrderEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class OrderDaoImpl implements OrderDao {
    private Session session;

    @Override
    public ArrayList<OrderEntity> GetAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Boolean Save(OrderEntity orderEntity) {
        //return (String) session.save(orderEntity);
        return null;
    }

    @Override
    public OrderEntity Search(String id) {
        return session.get(OrderEntity.class,id);
    }

    @Override
    public Boolean Update(OrderEntity orderEntity) {
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
