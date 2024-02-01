package lk.ijse.pos_backend.dao.custom.impl;

import lk.ijse.pos_backend.dao.custom.CustomerDao;
import lk.ijse.pos_backend.entity.CustomerEntity;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

/**
*@author: Vishal Sandakelum,
*@Runtime version: 11.0.11+9-b1341.60 amd64
**/

@NoArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
    private Session session;

    @Override
    public String Save(CustomerEntity customerEntity) {
        return (String) session.save(customerEntity);
    }

    @Override
    public CustomerEntity Get(String id) {
        return session.get(CustomerEntity.class,id);
    }

    @Override
    public void Update(CustomerEntity customerEntity) {
        session.update(customerEntity);
    }

    @Override
    public void Delete(CustomerEntity customerEntity) {
        session.delete(customerEntity);
    }

    @Override
    public void SetSession(Session session) {
        this.session = session;
    }
}
